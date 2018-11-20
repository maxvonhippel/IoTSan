package edu.ksu.cis.bandera.abstraction.specification.node;

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

import edu.ksu.cis.bandera.abstraction.specification.analysis.*;

public final class X1POperatorTest extends XPOperatorTest
{
	private XPOperatorTest _xPOperatorTest_;
	private POperatorTest _pOperatorTest_;

	public X1POperatorTest()
	{
	}
	public X1POperatorTest(
		XPOperatorTest _xPOperatorTest_,
		POperatorTest _pOperatorTest_)
	{
		setXPOperatorTest(_xPOperatorTest_);
		setPOperatorTest(_pOperatorTest_);
	}
	public void apply(Switch sw)
	{
		throw new RuntimeException("Switch not supported.");
	}
	public Object clone()
	{
		throw new RuntimeException("Unsupported Operation");
	}
	public POperatorTest getPOperatorTest()
	{
		return _pOperatorTest_;
	}
	public XPOperatorTest getXPOperatorTest()
	{
		return _xPOperatorTest_;
	}
	void removeChild(Node child)
	{
		if(_xPOperatorTest_ == child)
		{
			_xPOperatorTest_ = null;
		}

		if(_pOperatorTest_ == child)
		{
			_pOperatorTest_ = null;
		}
	}
	void replaceChild(Node oldChild, Node newChild)
	{
	}
	public void setPOperatorTest(POperatorTest node)
	{
		if(_pOperatorTest_ != null)
		{
			_pOperatorTest_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_pOperatorTest_ = node;
	}
	public void setXPOperatorTest(XPOperatorTest node)
	{
		if(_xPOperatorTest_ != null)
		{
			_xPOperatorTest_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_xPOperatorTest_ = node;
	}
	public String toString()
	{
		return "" +
			toString(_xPOperatorTest_) +
			toString(_pOperatorTest_);
	}
}
