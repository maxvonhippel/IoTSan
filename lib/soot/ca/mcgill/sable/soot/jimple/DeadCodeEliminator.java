package ca.mcgill.sable.soot.jimple;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Jimple, a 3-address code Java(TM) bytecode representation.        *
 * Copyright (C) 1999 Raja Vallee-Rai (kor@sable.mcgill.ca)          *
 * All rights reserved.                                              *
 *                                                                   *
 * This work was done as a project of the Sable Research Group,      *
 * School of Computer Science, McGill University, Canada             *
 * (http://www.sable.mcgill.ca/).  It is understood that any         *
 * modification not identified as such is not covered by the         *
 * preceding statement.                                              *
 *                                                                   *
 * This work is free software; you can redistribute it and/or        *
 * modify it under the terms of the GNU Library General Public       *
 * License as published by the Free Software Foundation; either      *
 * version 2 of the License, or (at your option) any later version.  *
 *                                                                   *
 * This work is distributed in the hope that it will be useful,      *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of    *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU *
 * Library General Public License for more details.                  *
 *                                                                   *
 * You should have received a copy of the GNU Library General Public *
 * License along with this library; if not, write to the             *
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,      *
 * Boston, MA  02111-1307, USA.                                      *
 *                                                                   *
 * Java is a trademark of Sun Microsystems, Inc.                     *
 *                                                                   *
 * To submit a bug report, send a comment, or get the latest news on *
 * this project and other Sable Research Group projects, please      *
 * visit the web site: http://www.sable.mcgill.ca/                   *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

/*
 Reference Version
 -----------------
 This is the latest official version on which this file is based.
 The reference version is: $SootVersion: 1.beta.4 $

 Change History
 --------------
 A) Notes:

 Please use the following template.  Most recent changes should
 appear at the top of the list.

 - Modified on [date (March 1, 1900)] by [name]. [(*) if appropriate]
   [description of modification].

 Any Modification flagged with "(*)" was done as a project of the
 Sable Research Group, School of Computer Science,
 McGill University, Canada (http://www.sable.mcgill.ca/).

 You should add your copyright, using the following template, at
 the top of this file, along with other copyrights.

 *                                                                   *
 * Modifications by [name] are                                       *
 * Copyright (C) [year(s)] [your name (or company)].  All rights     *
 * reserved.                                                         *
 *                                                                   *

 B) Changes:

 - Modified on March 13, 1999 by Raja Vallee-Rai (rvalleerai@sable.mcgill.ca) (*)
   First release.
*/

import ca.mcgill.sable.soot.*;
import ca.mcgill.sable.util.*;

public class DeadCodeEliminator
{
	/** Eliminates dead code in a linear fashion.  Complexity is linear 
		with respect to the statements.
	*/
	public static void eliminateDeadCode(StmtBody body)
	{
		if(Main.isVerbose)
			System.out.println("[" + body.getMethod().getName() +
				"] Eliminating dead code...");
		
		if(Main.isProfilingOptimization)
			Main.deadCodeTimer.start();

		Set essentialStmts = new HashSet();
		LinkedList toVisit = new LinkedList();
		StmtList stmtList = body.getStmtList();
		
		// Make a first pass through the statements, noting 
		// the statements we must absolutely keep. 
		{
			Iterator stmtIt = stmtList.iterator();
			
			while(stmtIt.hasNext()) 
			{
				Stmt s = (Stmt) stmtIt.next();
				boolean isEssential = true;
				 
				if(s instanceof NopStmt)
					isEssential = false;
				 
				if(s instanceof AssignStmt)
				{
					AssignStmt as = (AssignStmt) s;
					
					if(as.getLeftOp() instanceof Local &&
						!(as.getRightOp() instanceof InvokeExpr) && 
						!(as.getRightOp() instanceof InstanceFieldRef) &&
						!(as.getRightOp() instanceof ArrayRef)) 
					{
						// Note that InstanceFieldRef, ArrayRef, InvokeExpr all can
						// have side effects (like throwing a null pointer exception)
					
						isEssential = false;
					}
				}
				
				if(isEssential)
				{
					essentialStmts.add(s);
					toVisit.addLast(s);                    
				}                     
			}
		}
		
		// Add all the statements which are used to compute values
		// for the essential statements, recursively
		{
			CompleteStmtGraph graph = new CompleteStmtGraph(stmtList);
			LocalDefs defs = new SimpleLocalDefs(graph);
			
			while(!toVisit.isEmpty())
			{
				Stmt s = (Stmt) toVisit.removeFirst();
				Iterator boxIt = s.getUseBoxes().iterator();
								
				while(boxIt.hasNext())
				{
					ValueBox box = (ValueBox) boxIt.next();
					
					if(box.getValue() instanceof Local)
					{
						Iterator defIt = defs.getDefsOfAt(
							(Local) box.getValue(), s).iterator();
						
						while(defIt.hasNext())
						{
							// Add all the definitions as essential stmts
							
							Stmt def = (Stmt) defIt.next();
							
							if(!essentialStmts.contains(def))
							{
								essentialStmts.add(def);
								toVisit.addLast(def);
							}    
						}         
					}
				}
			}
		}
		
		// Remove all statements which are not essential
		{
			Iterator stmtIt = stmtList.iterator();
			
			while(stmtIt.hasNext())
			{
				Stmt s = (Stmt) stmtIt.next();
				
				if(!essentialStmts.contains(s))
					stmtIt.remove();
				else if(s instanceof AssignStmt &&
					((AssignStmt) s).getLeftOp() == 
					((AssignStmt) s).getRightOp() &&
					((AssignStmt) s).getLeftOp() instanceof Local)
				{
					// Stmt is of the form a = a which is useless
					
					stmtIt.remove();
				}   
			}
		}
		
		if(Main.isProfilingOptimization)
			Main.deadCodeTimer.end();

	}
}
