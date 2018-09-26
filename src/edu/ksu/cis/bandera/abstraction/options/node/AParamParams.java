package edu.ksu.cis.bandera.abstraction.options.node;

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
import edu.ksu.cis.bandera.abstraction.options.analysis.*;

public final class AParamParams extends PParams
{
	private PName _name_;
	private final LinkedList _dim_ = new TypedLinkedList(new Dim_Cast());

	private class Dim_Cast implements Cast
	{
		public Object cast(Object o)
		{
			TDim node = (TDim) o;

			if((node.parent() != null) &&
				(node.parent() != AParamParams.this))
			{
				node.parent().removeChild(node);
			}

			if((node.parent() == null) ||
				(node.parent() != AParamParams.this))
			{
				node.parent(AParamParams.this);
			}

			return node;
		}
	}
	public AParamParams()
	{
	}
	public AParamParams(
		PName _name_,
		XTDim _dim_)
	{
		setName(_name_);

		if(_dim_ != null)
		{
			while(_dim_ instanceof X1TDim)
			{
				this._dim_.addFirst(((X1TDim) _dim_).getTDim());
				_dim_ = ((X1TDim) _dim_).getXTDim();
			}
			this._dim_.addFirst(((X2TDim) _dim_).getTDim());
		}

	}
	public AParamParams(
		PName _name_,
		List _dim_)
	{
		setName(_name_);

		{
			Object temp[] = _dim_.toArray();
			for(int i = 0; i < temp.length; i++)
			{
				this._dim_.add(temp[i]);
			}
		}

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAParamParams(this);
	}
	public Object clone()
	{
		return new AParamParams(
			(PName) cloneNode(_name_),
			cloneList(_dim_));
	}
	public LinkedList getDim()
	{
		return _dim_;
	}
	public PName getName()
	{
		return _name_;
	}
	void removeChild(Node child)
	{
		if(_name_ == child)
		{
			_name_ = null;
			return;
		}

		if(_dim_.remove(child))
		{
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_name_ == oldChild)
		{
			setName((PName) newChild);
			return;
		}

		for(ListIterator i = _dim_.listIterator(); i.hasNext();)
		{
			if(i.next() == oldChild)
			{
				if(newChild != null)
				{
					i.set(newChild);
					oldChild.parent(null);
					return;
				}

				i.remove();
				oldChild.parent(null);
				return;
			}
		}

	}
	public void setDim(List list)
	{
		Object temp[] = list.toArray();
		for(int i = 0; i < temp.length; i++)
		{
			_dim_.add(temp[i]);
		}
	}
	public void setName(PName node)
	{
		if(_name_ != null)
		{
			_name_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_name_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_name_)
			+ toString(_dim_);
	}
}
