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

import java.util.*;
import edu.ksu.cis.bandera.abstraction.specification.analysis.*;

public final class APatternPattern extends PPattern
{
	private TLParen _lParen_;
	private PAnyId _lId_;
	private TComma _comma_;
	private PAnyId _rId_;
	private TRParen _rParen_;
	private TRightarrow _rightarrow_;
	private PTokenTokenSet _tokenTokenSet_;
	private TSemicolon _semicolon_;

	public APatternPattern()
	{
	}
	public APatternPattern(
		TLParen _lParen_,
		PAnyId _lId_,
		TComma _comma_,
		PAnyId _rId_,
		TRParen _rParen_,
		TRightarrow _rightarrow_,
		PTokenTokenSet _tokenTokenSet_,
		TSemicolon _semicolon_)
	{
		setLParen(_lParen_);

		setLId(_lId_);

		setComma(_comma_);

		setRId(_rId_);

		setRParen(_rParen_);

		setRightarrow(_rightarrow_);

		setTokenTokenSet(_tokenTokenSet_);

		setSemicolon(_semicolon_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAPatternPattern(this);
	}
	public Object clone()
	{
		return new APatternPattern(
			(TLParen) cloneNode(_lParen_),
			(PAnyId) cloneNode(_lId_),
			(TComma) cloneNode(_comma_),
			(PAnyId) cloneNode(_rId_),
			(TRParen) cloneNode(_rParen_),
			(TRightarrow) cloneNode(_rightarrow_),
			(PTokenTokenSet) cloneNode(_tokenTokenSet_),
			(TSemicolon) cloneNode(_semicolon_));
	}
	public TComma getComma()
	{
		return _comma_;
	}
	public PAnyId getLId()
	{
		return _lId_;
	}
	public TLParen getLParen()
	{
		return _lParen_;
	}
	public PAnyId getRId()
	{
		return _rId_;
	}
	public TRightarrow getRightarrow()
	{
		return _rightarrow_;
	}
	public TRParen getRParen()
	{
		return _rParen_;
	}
	public TSemicolon getSemicolon()
	{
		return _semicolon_;
	}
	public PTokenTokenSet getTokenTokenSet()
	{
		return _tokenTokenSet_;
	}
	void removeChild(Node child)
	{
		if(_lParen_ == child)
		{
			_lParen_ = null;
			return;
		}

		if(_lId_ == child)
		{
			_lId_ = null;
			return;
		}

		if(_comma_ == child)
		{
			_comma_ = null;
			return;
		}

		if(_rId_ == child)
		{
			_rId_ = null;
			return;
		}

		if(_rParen_ == child)
		{
			_rParen_ = null;
			return;
		}

		if(_rightarrow_ == child)
		{
			_rightarrow_ = null;
			return;
		}

		if(_tokenTokenSet_ == child)
		{
			_tokenTokenSet_ = null;
			return;
		}

		if(_semicolon_ == child)
		{
			_semicolon_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_lParen_ == oldChild)
		{
			setLParen((TLParen) newChild);
			return;
		}

		if(_lId_ == oldChild)
		{
			setLId((PAnyId) newChild);
			return;
		}

		if(_comma_ == oldChild)
		{
			setComma((TComma) newChild);
			return;
		}

		if(_rId_ == oldChild)
		{
			setRId((PAnyId) newChild);
			return;
		}

		if(_rParen_ == oldChild)
		{
			setRParen((TRParen) newChild);
			return;
		}

		if(_rightarrow_ == oldChild)
		{
			setRightarrow((TRightarrow) newChild);
			return;
		}

		if(_tokenTokenSet_ == oldChild)
		{
			setTokenTokenSet((PTokenTokenSet) newChild);
			return;
		}

		if(_semicolon_ == oldChild)
		{
			setSemicolon((TSemicolon) newChild);
			return;
		}

	}
	public void setComma(TComma node)
	{
		if(_comma_ != null)
		{
			_comma_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_comma_ = node;
	}
	public void setLId(PAnyId node)
	{
		if(_lId_ != null)
		{
			_lId_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_lId_ = node;
	}
	public void setLParen(TLParen node)
	{
		if(_lParen_ != null)
		{
			_lParen_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_lParen_ = node;
	}
	public void setRId(PAnyId node)
	{
		if(_rId_ != null)
		{
			_rId_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_rId_ = node;
	}
	public void setRightarrow(TRightarrow node)
	{
		if(_rightarrow_ != null)
		{
			_rightarrow_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_rightarrow_ = node;
	}
	public void setRParen(TRParen node)
	{
		if(_rParen_ != null)
		{
			_rParen_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_rParen_ = node;
	}
	public void setSemicolon(TSemicolon node)
	{
		if(_semicolon_ != null)
		{
			_semicolon_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_semicolon_ = node;
	}
	public void setTokenTokenSet(PTokenTokenSet node)
	{
		if(_tokenTokenSet_ != null)
		{
			_tokenTokenSet_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_tokenTokenSet_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_lParen_)
			+ toString(_lId_)
			+ toString(_comma_)
			+ toString(_rId_)
			+ toString(_rParen_)
			+ toString(_rightarrow_)
			+ toString(_tokenTokenSet_)
			+ toString(_semicolon_);
	}
}
