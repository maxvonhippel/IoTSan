package edu.ksu.cis.bandera.specification.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.analysis.*;

public final class AImplicationExp extends PExp
{
	private PImplicationExp _implicationExp_;

	public AImplicationExp()
	{
	}
	public AImplicationExp(
		PImplicationExp _implicationExp_)
	{
		setImplicationExp(_implicationExp_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAImplicationExp(this);
	}
	public Object clone()
	{
		return new AImplicationExp(
			(PImplicationExp) cloneNode(_implicationExp_));
	}
	public PImplicationExp getImplicationExp()
	{
		return _implicationExp_;
	}
	void removeChild(Node child)
	{
		if(_implicationExp_ == child)
		{
			_implicationExp_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_implicationExp_ == oldChild)
		{
			setImplicationExp((PImplicationExp) newChild);
			return;
		}

	}
	public void setImplicationExp(PImplicationExp node)
	{
		if(_implicationExp_ != null)
		{
			_implicationExp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_implicationExp_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_implicationExp_);
	}
}
