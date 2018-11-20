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

public final class AInitClassInterfaceArrayCreationExp extends PArrayCreationExp
{
	private TNew _new_;
	private PClassOrInterfaceType _classOrInterfaceType_;
	private final LinkedList _dim_ = new TypedLinkedList(new Dim_Cast());
	private PArrayInitializer _arrayInitializer_;

	private class Dim_Cast implements Cast
	{
		public Object cast(Object o)
		{
			PDim node = (PDim) o;

			if((node.parent() != null) &&
				(node.parent() != AInitClassInterfaceArrayCreationExp.this))
			{
				node.parent().removeChild(node);
			}

			if((node.parent() == null) ||
				(node.parent() != AInitClassInterfaceArrayCreationExp.this))
			{
				node.parent(AInitClassInterfaceArrayCreationExp.this);
			}

			return node;
		}
	}
	public AInitClassInterfaceArrayCreationExp()
	{
	}
	public AInitClassInterfaceArrayCreationExp(
		TNew _new_,
		PClassOrInterfaceType _classOrInterfaceType_,
		List _dim_,
		PArrayInitializer _arrayInitializer_)
	{
		setNew(_new_);

		setClassOrInterfaceType(_classOrInterfaceType_);

		{
			Object temp[] = _dim_.toArray();
			for(int i = 0; i < temp.length; i++)
			{
				this._dim_.add(temp[i]);
			}
		}

		setArrayInitializer(_arrayInitializer_);

	}
	public AInitClassInterfaceArrayCreationExp(
		TNew _new_,
		PClassOrInterfaceType _classOrInterfaceType_,
		XPDim _dim_,
		PArrayInitializer _arrayInitializer_)
	{
		setNew(_new_);

		setClassOrInterfaceType(_classOrInterfaceType_);

		if(_dim_ != null)
		{
			while(_dim_ instanceof X1PDim)
			{
				this._dim_.addFirst(((X1PDim) _dim_).getPDim());
				_dim_ = ((X1PDim) _dim_).getXPDim();
			}
			this._dim_.addFirst(((X2PDim) _dim_).getPDim());
		}

		setArrayInitializer(_arrayInitializer_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAInitClassInterfaceArrayCreationExp(this);
	}
	public Object clone()
	{
		return new AInitClassInterfaceArrayCreationExp(
			(TNew) cloneNode(_new_),
			(PClassOrInterfaceType) cloneNode(_classOrInterfaceType_),
			cloneList(_dim_),
			(PArrayInitializer) cloneNode(_arrayInitializer_));
	}
	public PArrayInitializer getArrayInitializer()
	{
		return _arrayInitializer_;
	}
	public PClassOrInterfaceType getClassOrInterfaceType()
	{
		return _classOrInterfaceType_;
	}
	public LinkedList getDim()
	{
		return _dim_;
	}
	public TNew getNew()
	{
		return _new_;
	}
	void removeChild(Node child)
	{
		if(_new_ == child)
		{
			_new_ = null;
			return;
		}

		if(_classOrInterfaceType_ == child)
		{
			_classOrInterfaceType_ = null;
			return;
		}

		if(_dim_.remove(child))
		{
			return;
		}

		if(_arrayInitializer_ == child)
		{
			_arrayInitializer_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_new_ == oldChild)
		{
			setNew((TNew) newChild);
			return;
		}

		if(_classOrInterfaceType_ == oldChild)
		{
			setClassOrInterfaceType((PClassOrInterfaceType) newChild);
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

		if(_arrayInitializer_ == oldChild)
		{
			setArrayInitializer((PArrayInitializer) newChild);
			return;
		}

	}
	public void setArrayInitializer(PArrayInitializer node)
	{
		if(_arrayInitializer_ != null)
		{
			_arrayInitializer_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_arrayInitializer_ = node;
	}
	public void setClassOrInterfaceType(PClassOrInterfaceType node)
	{
		if(_classOrInterfaceType_ != null)
		{
			_classOrInterfaceType_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_classOrInterfaceType_ = node;
	}
	public void setDim(List list)
	{
		Object temp[] = list.toArray();
		for(int i = 0; i < temp.length; i++)
		{
			_dim_.add(temp[i]);
		}
	}
	public void setNew(TNew node)
	{
		if(_new_ != null)
		{
			_new_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_new_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_new_)
			+ toString(_classOrInterfaceType_)
			+ toString(_dim_)
			+ toString(_arrayInitializer_);
	}
}
