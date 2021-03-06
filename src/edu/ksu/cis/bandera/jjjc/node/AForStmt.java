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

public final class AForStmt extends PStmt
{
	private TFor _for_;
	private TLPar _lPar_;
	private PForInit _forInit_;
	private TSemicolon _semicolon1_;
	private PExp _exp_;
	private TSemicolon _semicolon2_;
	private final LinkedList _forUpdate_ = new TypedLinkedList(new ForUpdate_Cast());
	private TRPar _rPar_;
	private PBlock _block_;

	private class ForUpdate_Cast implements Cast
	{
		public Object cast(Object o)
		{
			PExp node = (PExp) o;

			if((node.parent() != null) &&
				(node.parent() != AForStmt.this))
			{
				node.parent().removeChild(node);
			}

			if((node.parent() == null) ||
				(node.parent() != AForStmt.this))
			{
				node.parent(AForStmt.this);
			}

			return node;
		}
	}
	public AForStmt()
	{
	}
	public AForStmt(
		TFor _for_,
		TLPar _lPar_,
		PForInit _forInit_,
		TSemicolon _semicolon1_,
		PExp _exp_,
		TSemicolon _semicolon2_,
		List _forUpdate_,
		TRPar _rPar_,
		PBlock _block_)
	{
		setFor(_for_);

		setLPar(_lPar_);

		setForInit(_forInit_);

		setSemicolon1(_semicolon1_);

		setExp(_exp_);

		setSemicolon2(_semicolon2_);

		{
			Object temp[] = _forUpdate_.toArray();
			for(int i = 0; i < temp.length; i++)
			{
				this._forUpdate_.add(temp[i]);
			}
		}

		setRPar(_rPar_);

		setBlock(_block_);

	}
	public AForStmt(
		TFor _for_,
		TLPar _lPar_,
		PForInit _forInit_,
		TSemicolon _semicolon1_,
		PExp _exp_,
		TSemicolon _semicolon2_,
		XPExp _forUpdate_,
		TRPar _rPar_,
		PBlock _block_)
	{
		setFor(_for_);

		setLPar(_lPar_);

		setForInit(_forInit_);

		setSemicolon1(_semicolon1_);

		setExp(_exp_);

		setSemicolon2(_semicolon2_);

		if(_forUpdate_ != null)
		{
			while(_forUpdate_ instanceof X1PExp)
			{
				this._forUpdate_.addFirst(((X1PExp) _forUpdate_).getPExp());
				_forUpdate_ = ((X1PExp) _forUpdate_).getXPExp();
			}
			this._forUpdate_.addFirst(((X2PExp) _forUpdate_).getPExp());
		}

		setRPar(_rPar_);

		setBlock(_block_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAForStmt(this);
	}
	public Object clone()
	{
		return new AForStmt(
			(TFor) cloneNode(_for_),
			(TLPar) cloneNode(_lPar_),
			(PForInit) cloneNode(_forInit_),
			(TSemicolon) cloneNode(_semicolon1_),
			(PExp) cloneNode(_exp_),
			(TSemicolon) cloneNode(_semicolon2_),
			cloneList(_forUpdate_),
			(TRPar) cloneNode(_rPar_),
			(PBlock) cloneNode(_block_));
	}
	public PBlock getBlock()
	{
		return _block_;
	}
	public PExp getExp()
	{
		return _exp_;
	}
	public TFor getFor()
	{
		return _for_;
	}
	public PForInit getForInit()
	{
		return _forInit_;
	}
	public LinkedList getForUpdate()
	{
		return _forUpdate_;
	}
	public TLPar getLPar()
	{
		return _lPar_;
	}
	public TRPar getRPar()
	{
		return _rPar_;
	}
	public TSemicolon getSemicolon1()
	{
		return _semicolon1_;
	}
	public TSemicolon getSemicolon2()
	{
		return _semicolon2_;
	}
	void removeChild(Node child)
	{
		if(_for_ == child)
		{
			_for_ = null;
			return;
		}

		if(_lPar_ == child)
		{
			_lPar_ = null;
			return;
		}

		if(_forInit_ == child)
		{
			_forInit_ = null;
			return;
		}

		if(_semicolon1_ == child)
		{
			_semicolon1_ = null;
			return;
		}

		if(_exp_ == child)
		{
			_exp_ = null;
			return;
		}

		if(_semicolon2_ == child)
		{
			_semicolon2_ = null;
			return;
		}

		if(_forUpdate_.remove(child))
		{
			return;
		}

		if(_rPar_ == child)
		{
			_rPar_ = null;
			return;
		}

		if(_block_ == child)
		{
			_block_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_for_ == oldChild)
		{
			setFor((TFor) newChild);
			return;
		}

		if(_lPar_ == oldChild)
		{
			setLPar((TLPar) newChild);
			return;
		}

		if(_forInit_ == oldChild)
		{
			setForInit((PForInit) newChild);
			return;
		}

		if(_semicolon1_ == oldChild)
		{
			setSemicolon1((TSemicolon) newChild);
			return;
		}

		if(_exp_ == oldChild)
		{
			setExp((PExp) newChild);
			return;
		}

		if(_semicolon2_ == oldChild)
		{
			setSemicolon2((TSemicolon) newChild);
			return;
		}

		for(ListIterator i = _forUpdate_.listIterator(); i.hasNext();)
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

		if(_rPar_ == oldChild)
		{
			setRPar((TRPar) newChild);
			return;
		}

		if(_block_ == oldChild)
		{
			setBlock((PBlock) newChild);
			return;
		}

	}
	public void setBlock(PBlock node)
	{
		if(_block_ != null)
		{
			_block_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_block_ = node;
	}
	public void setExp(PExp node)
	{
		if(_exp_ != null)
		{
			_exp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_exp_ = node;
	}
	public void setFor(TFor node)
	{
		if(_for_ != null)
		{
			_for_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_for_ = node;
	}
	public void setForInit(PForInit node)
	{
		if(_forInit_ != null)
		{
			_forInit_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_forInit_ = node;
	}
	public void setForUpdate(List list)
	{
		Object temp[] = list.toArray();
		for(int i = 0; i < temp.length; i++)
		{
			_forUpdate_.add(temp[i]);
		}
	}
	public void setLPar(TLPar node)
	{
		if(_lPar_ != null)
		{
			_lPar_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_lPar_ = node;
	}
	public void setRPar(TRPar node)
	{
		if(_rPar_ != null)
		{
			_rPar_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_rPar_ = node;
	}
	public void setSemicolon1(TSemicolon node)
	{
		if(_semicolon1_ != null)
		{
			_semicolon1_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_semicolon1_ = node;
	}
	public void setSemicolon2(TSemicolon node)
	{
		if(_semicolon2_ != null)
		{
			_semicolon2_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_semicolon2_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_for_)
			+ toString(_lPar_)
			+ toString(_forInit_)
			+ toString(_semicolon1_)
			+ toString(_exp_)
			+ toString(_semicolon2_)
			+ toString(_forUpdate_)
			+ toString(_rPar_)
			+ toString(_block_);
	}
}
