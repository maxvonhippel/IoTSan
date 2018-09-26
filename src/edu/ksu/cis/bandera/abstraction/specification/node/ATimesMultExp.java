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

public final class ATimesMultExp extends PMultExp
{
	private PMultExp _multExp_;
	private TTimes _times_;
	private PUnaryExp _unaryExp_;

	public ATimesMultExp()
	{
	}
	public ATimesMultExp(
		PMultExp _multExp_,
		TTimes _times_,
		PUnaryExp _unaryExp_)
	{
		setMultExp(_multExp_);

		setTimes(_times_);

		setUnaryExp(_unaryExp_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseATimesMultExp(this);
	}
	public Object clone()
	{
		return new ATimesMultExp(
			(PMultExp) cloneNode(_multExp_),
			(TTimes) cloneNode(_times_),
			(PUnaryExp) cloneNode(_unaryExp_));
	}
	public PMultExp getMultExp()
	{
		return _multExp_;
	}
	public TTimes getTimes()
	{
		return _times_;
	}
	public PUnaryExp getUnaryExp()
	{
		return _unaryExp_;
	}
	void removeChild(Node child)
	{
		if(_multExp_ == child)
		{
			_multExp_ = null;
			return;
		}

		if(_times_ == child)
		{
			_times_ = null;
			return;
		}

		if(_unaryExp_ == child)
		{
			_unaryExp_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_multExp_ == oldChild)
		{
			setMultExp((PMultExp) newChild);
			return;
		}

		if(_times_ == oldChild)
		{
			setTimes((TTimes) newChild);
			return;
		}

		if(_unaryExp_ == oldChild)
		{
			setUnaryExp((PUnaryExp) newChild);
			return;
		}

	}
	public void setMultExp(PMultExp node)
	{
		if(_multExp_ != null)
		{
			_multExp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_multExp_ = node;
	}
	public void setTimes(TTimes node)
	{
		if(_times_ != null)
		{
			_times_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_times_ = node;
	}
	public void setUnaryExp(PUnaryExp node)
	{
		if(_unaryExp_ != null)
		{
			_unaryExp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_unaryExp_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_multExp_)
			+ toString(_times_)
			+ toString(_unaryExp_);
	}
}
