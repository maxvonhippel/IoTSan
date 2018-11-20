package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class AOrInclusiveOrExp extends PInclusiveOrExp
{
	private PInclusiveOrExp _inclusiveOrExp_;
	private TBitOr _bitOr_;
	private PExclusiveOrExp _exclusiveOrExp_;

	public AOrInclusiveOrExp()
	{
	}
	public AOrInclusiveOrExp(
		PInclusiveOrExp _inclusiveOrExp_,
		TBitOr _bitOr_,
		PExclusiveOrExp _exclusiveOrExp_)
	{
		setInclusiveOrExp(_inclusiveOrExp_);

		setBitOr(_bitOr_);

		setExclusiveOrExp(_exclusiveOrExp_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAOrInclusiveOrExp(this);
	}
	public Object clone()
	{
		return new AOrInclusiveOrExp(
			(PInclusiveOrExp) cloneNode(_inclusiveOrExp_),
			(TBitOr) cloneNode(_bitOr_),
			(PExclusiveOrExp) cloneNode(_exclusiveOrExp_));
	}
	public TBitOr getBitOr()
	{
		return _bitOr_;
	}
	public PExclusiveOrExp getExclusiveOrExp()
	{
		return _exclusiveOrExp_;
	}
	public PInclusiveOrExp getInclusiveOrExp()
	{
		return _inclusiveOrExp_;
	}
	void removeChild(Node child)
	{
		if(_inclusiveOrExp_ == child)
		{
			_inclusiveOrExp_ = null;
			return;
		}

		if(_bitOr_ == child)
		{
			_bitOr_ = null;
			return;
		}

		if(_exclusiveOrExp_ == child)
		{
			_exclusiveOrExp_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_inclusiveOrExp_ == oldChild)
		{
			setInclusiveOrExp((PInclusiveOrExp) newChild);
			return;
		}

		if(_bitOr_ == oldChild)
		{
			setBitOr((TBitOr) newChild);
			return;
		}

		if(_exclusiveOrExp_ == oldChild)
		{
			setExclusiveOrExp((PExclusiveOrExp) newChild);
			return;
		}

	}
	public void setBitOr(TBitOr node)
	{
		if(_bitOr_ != null)
		{
			_bitOr_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_bitOr_ = node;
	}
	public void setExclusiveOrExp(PExclusiveOrExp node)
	{
		if(_exclusiveOrExp_ != null)
		{
			_exclusiveOrExp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_exclusiveOrExp_ = node;
	}
	public void setInclusiveOrExp(PInclusiveOrExp node)
	{
		if(_inclusiveOrExp_ != null)
		{
			_inclusiveOrExp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_inclusiveOrExp_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_inclusiveOrExp_)
			+ toString(_bitOr_)
			+ toString(_exclusiveOrExp_);
	}
}
