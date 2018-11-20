package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class ABitOrBinOp extends PBinOp
{
	private TBitOr _bitOr_;

	public ABitOrBinOp()
	{
	}
	public ABitOrBinOp(
		TBitOr _bitOr_)
	{
		setBitOr(_bitOr_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseABitOrBinOp(this);
	}
	public Object clone()
	{
		return new ABitOrBinOp(
			(TBitOr) cloneNode(_bitOr_));
	}
	public TBitOr getBitOr()
	{
		return _bitOr_;
	}
	void removeChild(Node child)
	{
		if(_bitOr_ == child)
		{
			_bitOr_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_bitOr_ == oldChild)
		{
			setBitOr((TBitOr) newChild);
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
	public String toString()
	{
		return ""
			+ toString(_bitOr_);
	}
}
