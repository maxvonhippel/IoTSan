package edu.ksu.cis.bandera.specification.pattern.analysis;

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

import java.util.*;
import edu.ksu.cis.bandera.specification.pattern.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
	public void caseAIdIds(AIdIds node)
	{
		inAIdIds(node);
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		outAIdIds(node);
	}
	public void caseAIdsIds(AIdsIds node)
	{
		inAIdsIds(node);
		if(node.getIds() != null)
		{
			node.getIds().apply(this);
		}
		if(node.getComma() != null)
		{
			node.getComma().apply(this);
		}
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		outAIdsIds(node);
	}
	public void caseAParamResource(AParamResource node)
	{
		inAParamResource(node);
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		if(node.getEqual() != null)
		{
			node.getEqual().apply(this);
		}
		if(node.getLBrace() != null)
		{
			node.getLBrace().apply(this);
		}
		if(node.getIds() != null)
		{
			node.getIds().apply(this);
		}
		if(node.getRBrace() != null)
		{
			node.getRBrace().apply(this);
		}
		outAParamResource(node);
	}
	public void caseAPattern(APattern node)
	{
		inAPattern(node);
		if(node.getPattern() != null)
		{
			node.getPattern().apply(this);
		}
		if(node.getLBrace() != null)
		{
			node.getLBrace().apply(this);
		}
		{
			Object temp[] = node.getResource().toArray();
			for(int i = 0; i < temp.length; i++)
			{
				((PResource) temp[i]).apply(this);
			}
		}
		if(node.getRBrace() != null)
		{
			node.getRBrace().apply(this);
		}
		outAPattern(node);
	}
	public void caseAStringResource(AStringResource node)
	{
		inAStringResource(node);
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		if(node.getEqual() != null)
		{
			node.getEqual().apply(this);
		}
		if(node.getStrings() != null)
		{
			node.getStrings().apply(this);
		}
		outAStringResource(node);
	}
	public void caseAStringsStrings(AStringsStrings node)
	{
		inAStringsStrings(node);
		if(node.getStrings() != null)
		{
			node.getStrings().apply(this);
		}
		if(node.getPlus() != null)
		{
			node.getPlus().apply(this);
		}
		if(node.getStringLiteral() != null)
		{
			node.getStringLiteral().apply(this);
		}
		outAStringsStrings(node);
	}
	public void caseAStringStrings(AStringStrings node)
	{
		inAStringStrings(node);
		if(node.getStringLiteral() != null)
		{
			node.getStringLiteral().apply(this);
		}
		outAStringStrings(node);
	}
	public void caseAUnit(AUnit node)
	{
		inAUnit(node);
		{
			Object temp[] = node.getPattern().toArray();
			for(int i = 0; i < temp.length; i++)
			{
				((PPattern) temp[i]).apply(this);
			}
		}
		outAUnit(node);
	}
	public void caseStart(Start node)
	{
		inStart(node);
		node.getPUnit().apply(this);
		node.getEOF().apply(this);
		outStart(node);
	}
	public void defaultIn(Node node)
	{
	}
	public void defaultOut(Node node)
	{
	}
	public void inAIdIds(AIdIds node)
	{
		defaultIn(node);
	}
	public void inAIdsIds(AIdsIds node)
	{
		defaultIn(node);
	}
	public void inAParamResource(AParamResource node)
	{
		defaultIn(node);
	}
	public void inAPattern(APattern node)
	{
		defaultIn(node);
	}
	public void inAStringResource(AStringResource node)
	{
		defaultIn(node);
	}
	public void inAStringsStrings(AStringsStrings node)
	{
		defaultIn(node);
	}
	public void inAStringStrings(AStringStrings node)
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
	public void outAIdIds(AIdIds node)
	{
		defaultOut(node);
	}
	public void outAIdsIds(AIdsIds node)
	{
		defaultOut(node);
	}
	public void outAParamResource(AParamResource node)
	{
		defaultOut(node);
	}
	public void outAPattern(APattern node)
	{
		defaultOut(node);
	}
	public void outAStringResource(AStringResource node)
	{
		defaultOut(node);
	}
	public void outAStringsStrings(AStringsStrings node)
	{
		defaultOut(node);
	}
	public void outAStringStrings(AStringStrings node)
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
