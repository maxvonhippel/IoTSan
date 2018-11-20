package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class AThisPrimaryExp extends PPrimaryExp
{
	private TThis _this_;

	public AThisPrimaryExp()
	{
	}
	public AThisPrimaryExp(
		TThis _this_)
	{
		setThis(_this_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAThisPrimaryExp(this);
	}
	public Object clone()
	{
		return new AThisPrimaryExp(
			(TThis) cloneNode(_this_));
	}
	public TThis getThis()
	{
		return _this_;
	}
	void removeChild(Node child)
	{
		if(_this_ == child)
		{
			_this_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_this_ == oldChild)
		{
			setThis((TThis) newChild);
			return;
		}

	}
	public void setThis(TThis node)
	{
		if(_this_ != null)
		{
			_this_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_this_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_this_);
	}
}
