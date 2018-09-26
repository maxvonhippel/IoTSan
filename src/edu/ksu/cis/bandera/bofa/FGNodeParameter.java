/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Bandera, a Java(TM) analysis and transformation toolkit           *
 * Copyright (C) 1998, 1999                                          *
 * John Hatcliff (hatcliff@cis.ksu.edu)
 * All rights reserved.                                              *
 *                                                                   *
 * This work was done as a project in the SAnToS Laboratory,         *
 * Department of Computing and Information Sciences, Kansas State    *
 * University, USA (http://www.cis.ksu.edu/santos).                  *
 * It is understood that any modification not identified as such is  *
 * not covered by the preceding statement.                           *
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
 * License along with this toolkit; if not, write to the             *
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,      *
 * Boston, MA  02111-1307, USA.                                      *
 *                                                                   *
 * Java is a trademark of Sun Microsystems, Inc.                     *
 *                                                                   *
 * To submit a bug report, send a comment, or get the latest news on *
 * this project and other SAnToS projects, please visit the web-site *
 *                http://www.cis.ksu.edu/santos                      *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */

package edu.ksu.cis.bandera.bofa;

import ca.mcgill.sable.soot.*;
import ca.mcgill.sable.soot.jimple.*;
import ca.mcgill.sable.util.*;

/*
 * FGNodeParameter.java
 * $Id: FGNodeParameter.java,v 1.2 2002/02/21 07:42:22 rvprasad Exp $
 */

/**
 * This class represents the node which describes parameters to the method.
 *
 * @author <A HREF="http://www.cis.ksu.edu/~hatcliff">John Hatcliff</A>
 * @author <a href="http://www.cis.ksu.edu/~rvprasad">Venkatesh Prasad Ranganath</a>
 * @version $Name:  $($Revision: 1.2 $)
 */
public class FGNodeParameter extends FGNode
{
	/**
	 * Index of the parameter in the parameter list.
	 */
	private int index;

	/**
	 * MethodVariant in which the described parameter occurs.
	 */
	private MethodVariant methodVariant;

	/**
	 * Constructor that uses empty sets for values, actions, and succs.
	 *
	 * @param index parameter index described by this node.
	 * @param methodVariant method variant to which this node belongs.  */
	public FGNodeParameter(int index, MethodVariant methodVariant)
    {
		super();
		this.index         = index;
		this.methodVariant = methodVariant;
    }

	/**
	 * Returns the method variant in which the parameter defined by this node exists.
	 *
	 * @return the method variant in which the parameter defined by this node exists.
	 */
	public MethodVariant getMethodVariant()
    {
		return this.methodVariant;
    }
}
