package edu.ksu.cis.bandera.jjjc.node;

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
import ca.mcgill.sable.util.*;
import edu.ksu.cis.bandera.jjjc.analysis.*;

public final class AExclusiveOrExpExclusiveOrExp extends PExclusiveOrExp
{
	private PExclusiveOrExp _exclusiveOrExp_;
	private TBitXor _bitXor_;
	private PAndExp _andExp_;

	public AExclusiveOrExpExclusiveOrExp()
	{
	}
	public AExclusiveOrExpExclusiveOrExp(
		PExclusiveOrExp _exclusiveOrExp_,
		TBitXor _bitXor_,
		PAndExp _andExp_)
	{
		setExclusiveOrExp(_exclusiveOrExp_);

		setBitXor(_bitXor_);

		setAndExp(_andExp_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAExclusiveOrExpExclusiveOrExp(this);
	}
	public Object clone()
	{
		return new AExclusiveOrExpExclusiveOrExp(
			(PExclusiveOrExp) cloneNode(_exclusiveOrExp_),
			(TBitXor) cloneNode(_bitXor_),
			(PAndExp) cloneNode(_andExp_));
	}
	public PAndExp getAndExp()
	{
		return _andExp_;
	}
	public TBitXor getBitXor()
	{
		return _bitXor_;
	}
	public PExclusiveOrExp getExclusiveOrExp()
	{
		return _exclusiveOrExp_;
	}
	void removeChild(Node child)
	{
		if(_exclusiveOrExp_ == child)
		{
			_exclusiveOrExp_ = null;
			return;
		}

		if(_bitXor_ == child)
		{
			_bitXor_ = null;
			return;
		}

		if(_andExp_ == child)
		{
			_andExp_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_exclusiveOrExp_ == oldChild)
		{
			setExclusiveOrExp((PExclusiveOrExp) newChild);
			return;
		}

		if(_bitXor_ == oldChild)
		{
			setBitXor((TBitXor) newChild);
			return;
		}

		if(_andExp_ == oldChild)
		{
			setAndExp((PAndExp) newChild);
			return;
		}

	}
	public void setAndExp(PAndExp node)
	{
		if(_andExp_ != null)
		{
			_andExp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_andExp_ = node;
	}
	public void setBitXor(TBitXor node)
	{
		if(_bitXor_ != null)
		{
			_bitXor_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_bitXor_ = node;
	}
	public void setExclusiveOrExp(PExclusiveOrExp node)
	{
		if(_exclusiveOrExp_ != null)
		{
			_exclusiveOrExp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_exclusiveOrExp_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_exclusiveOrExp_)
			+ toString(_bitXor_)
			+ toString(_andExp_);
	}
}
