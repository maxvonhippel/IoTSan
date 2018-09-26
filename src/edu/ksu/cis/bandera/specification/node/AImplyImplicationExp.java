package edu.ksu.cis.bandera.specification.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.analysis.*;

public final class AImplyImplicationExp extends PImplicationExp
{
	private PImplicationExp _implicationExp_;
	private TImply _imply_;
	private POrExp _orExp_;

	public AImplyImplicationExp()
	{
	}
	public AImplyImplicationExp(
		PImplicationExp _implicationExp_,
		TImply _imply_,
		POrExp _orExp_)
	{
		setImplicationExp(_implicationExp_);

		setImply(_imply_);

		setOrExp(_orExp_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAImplyImplicationExp(this);
	}
	public Object clone()
	{
		return new AImplyImplicationExp(
			(PImplicationExp) cloneNode(_implicationExp_),
			(TImply) cloneNode(_imply_),
			(POrExp) cloneNode(_orExp_));
	}
	public PImplicationExp getImplicationExp()
	{
		return _implicationExp_;
	}
	public TImply getImply()
	{
		return _imply_;
	}
	public POrExp getOrExp()
	{
		return _orExp_;
	}
	void removeChild(Node child)
	{
		if(_implicationExp_ == child)
		{
			_implicationExp_ = null;
			return;
		}

		if(_imply_ == child)
		{
			_imply_ = null;
			return;
		}

		if(_orExp_ == child)
		{
			_orExp_ = null;
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

		if(_imply_ == oldChild)
		{
			setImply((TImply) newChild);
			return;
		}

		if(_orExp_ == oldChild)
		{
			setOrExp((POrExp) newChild);
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
	public void setImply(TImply node)
	{
		if(_imply_ != null)
		{
			_imply_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_imply_ = node;
	}
	public void setOrExp(POrExp node)
	{
		if(_orExp_ != null)
		{
			_orExp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_orExp_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_implicationExp_)
			+ toString(_imply_)
			+ toString(_orExp_);
	}
}
