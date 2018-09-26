package edu.ksu.cis.bandera.specification.assertion.analysis;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Bandera, a Java(TM) analysis and transformation toolkit           *
 * Copyright (C) 1998-2001 SAnToS Laboratories (santos@cis.ksu.edu)  *

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
/* This file was generated by SableCC (http://www.sable.mcgill.ca/sablecc/). */

import edu.ksu.cis.bandera.specification.assertion.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
	public void caseAEndOfLineComment(AEndOfLineComment node)
	{
		inAEndOfLineComment(node);
		if(node.getEndOfLineComment() != null)
		{
			node.getEndOfLineComment().apply(this);
		}
		outAEndOfLineComment(node);
	}
	public void caseALocationAssertion(ALocationAssertion node)
	{
		inALocationAssertion(node);
		{
			Object temp[] = node.getComment().toArray();
			for(int i = temp.length - 1; i >= 0; i--)
			{
				((PComment) temp[i]).apply(this);
			}
		}
		if(node.getSemicolon() != null)
		{
			node.getSemicolon().apply(this);
		}
		if(node.getColon() != null)
		{
			node.getColon().apply(this);
		}
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		if(node.getRBracket() != null)
		{
			node.getRBracket().apply(this);
		}
		if(node.getLabel() != null)
		{
			node.getLabel().apply(this);
		}
		if(node.getLBracket() != null)
		{
			node.getLBracket().apply(this);
		}
		if(node.getLocation() != null)
		{
			node.getLocation().apply(this);
		}
		outALocationAssertion(node);
	}
	public void caseAPostAssertion(APostAssertion node)
	{
		inAPostAssertion(node);
		{
			Object temp[] = node.getComment().toArray();
			for(int i = temp.length - 1; i >= 0; i--)
			{
				((PComment) temp[i]).apply(this);
			}
		}
		if(node.getSemicolon() != null)
		{
			node.getSemicolon().apply(this);
		}
		if(node.getColon() != null)
		{
			node.getColon().apply(this);
		}
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		if(node.getPost() != null)
		{
			node.getPost().apply(this);
		}
		outAPostAssertion(node);
	}
	public void caseAPreAssertion(APreAssertion node)
	{
		inAPreAssertion(node);
		{
			Object temp[] = node.getComment().toArray();
			for(int i = temp.length - 1; i >= 0; i--)
			{
				((PComment) temp[i]).apply(this);
			}
		}
		if(node.getSemicolon() != null)
		{
			node.getSemicolon().apply(this);
		}
		if(node.getColon() != null)
		{
			node.getColon().apply(this);
		}
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		if(node.getPre() != null)
		{
			node.getPre().apply(this);
		}
		outAPreAssertion(node);
	}
	public void caseAQualifiedName(AQualifiedName node)
	{
		inAQualifiedName(node);
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		if(node.getDot() != null)
		{
			node.getDot().apply(this);
		}
		if(node.getName() != null)
		{
			node.getName().apply(this);
		}
		outAQualifiedName(node);
	}
	public void caseASimpleName(ASimpleName node)
	{
		inASimpleName(node);
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		outASimpleName(node);
	}
	public void caseAUnit(AUnit node)
	{
		inAUnit(node);
		{
			Object temp[] = node.getAssertion().toArray();
			for(int i = temp.length - 1; i >= 0; i--)
			{
				((PAssertion) temp[i]).apply(this);
			}
		}
		{
			Object temp[] = node.getComment().toArray();
			for(int i = temp.length - 1; i >= 0; i--)
			{
				((PComment) temp[i]).apply(this);
			}
		}
		if(node.getName() != null)
		{
			node.getName().apply(this);
		}
		outAUnit(node);
	}
	public void caseStart(Start node)
	{
		inStart(node);
		node.getEOF().apply(this);
		node.getPUnit().apply(this);
		outStart(node);
	}
	public void defaultIn(Node node)
	{
	}
	public void defaultOut(Node node)
	{
	}
	public void inAEndOfLineComment(AEndOfLineComment node)
	{
		defaultIn(node);
	}
	public void inALocationAssertion(ALocationAssertion node)
	{
		defaultIn(node);
	}
	public void inAPostAssertion(APostAssertion node)
	{
		defaultIn(node);
	}
	public void inAPreAssertion(APreAssertion node)
	{
		defaultIn(node);
	}
	public void inAQualifiedName(AQualifiedName node)
	{
		defaultIn(node);
	}
	public void inASimpleName(ASimpleName node)
	{
		defaultIn(node);
	}
	public void inAUnit(AUnit node)
	{
		defaultIn(node);
	}
	public void inStart(Start node)
	{
		defaultIn(node);
	}
	public void outAEndOfLineComment(AEndOfLineComment node)
	{
		defaultOut(node);
	}
	public void outALocationAssertion(ALocationAssertion node)
	{
		defaultOut(node);
	}
	public void outAPostAssertion(APostAssertion node)
	{
		defaultOut(node);
	}
	public void outAPreAssertion(APreAssertion node)
	{
		defaultOut(node);
	}
	public void outAQualifiedName(AQualifiedName node)
	{
		defaultOut(node);
	}
	public void outASimpleName(ASimpleName node)
	{
		defaultOut(node);
	}
	public void outAUnit(AUnit node)
	{
		defaultOut(node);
	}
	public void outStart(Start node)
	{
		defaultOut(node);
	}
}
