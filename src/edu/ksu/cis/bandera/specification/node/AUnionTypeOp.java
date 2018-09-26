package edu.ksu.cis.bandera.specification.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.analysis.*;

public final class AUnionTypeOp extends PTypeOp
{
	private TPlus _plus_;

	public AUnionTypeOp()
	{
	}
	public AUnionTypeOp(
		TPlus _plus_)
	{
		setPlus(_plus_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAUnionTypeOp(this);
	}
	public Object clone()
	{
		return new AUnionTypeOp(
			(TPlus) cloneNode(_plus_));
	}
	public TPlus getPlus()
	{
		return _plus_;
	}
	void removeChild(Node child)
	{
		if(_plus_ == child)
		{
			_plus_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_plus_ == oldChild)
		{
			setPlus((TPlus) newChild);
			return;
		}

	}
	public void setPlus(TPlus node)
	{
		if(_plus_ != null)
		{
			_plus_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_plus_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_plus_);
	}
}
