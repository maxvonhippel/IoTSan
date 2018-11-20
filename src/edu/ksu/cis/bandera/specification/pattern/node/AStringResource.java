package edu.ksu.cis.bandera.specification.pattern.node;

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
import edu.ksu.cis.bandera.specification.pattern.analysis.*;

public final class AStringResource extends PResource
{
	private TId _id_;
	private TEqual _equal_;
	private PStrings _strings_;

	public AStringResource()
	{
	}
	public AStringResource(
		TId _id_,
		TEqual _equal_,
		PStrings _strings_)
	{
		setId(_id_);

		setEqual(_equal_);

		setStrings(_strings_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAStringResource(this);
	}
	public Object clone()
	{
		return new AStringResource(
			(TId) cloneNode(_id_),
			(TEqual) cloneNode(_equal_),
			(PStrings) cloneNode(_strings_));
	}
	public TEqual getEqual()
	{
		return _equal_;
	}
	public TId getId()
	{
		return _id_;
	}
	public PStrings getStrings()
	{
		return _strings_;
	}
	void removeChild(Node child)
	{
		if(_id_ == child)
		{
			_id_ = null;
			return;
		}

		if(_equal_ == child)
		{
			_equal_ = null;
			return;
		}

		if(_strings_ == child)
		{
			_strings_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_id_ == oldChild)
		{
			setId((TId) newChild);
			return;
		}

		if(_equal_ == oldChild)
		{
			setEqual((TEqual) newChild);
			return;
		}

		if(_strings_ == oldChild)
		{
			setStrings((PStrings) newChild);
			return;
		}

	}
	public void setEqual(TEqual node)
	{
		if(_equal_ != null)
		{
			_equal_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_equal_ = node;
	}
	public void setId(TId node)
	{
		if(_id_ != null)
		{
			_id_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_id_ = node;
	}
	public void setStrings(PStrings node)
	{
		if(_strings_ != null)
		{
			_strings_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_strings_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_id_)
			+ toString(_equal_)
			+ toString(_strings_);
	}
}
