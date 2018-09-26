package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class ADecIntLiteral extends PLiteral
{
	private TDecIntLiteral _decIntLiteral_;

	public ADecIntLiteral()
	{
	}
	public ADecIntLiteral(
		TDecIntLiteral _decIntLiteral_)
	{
		setDecIntLiteral(_decIntLiteral_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseADecIntLiteral(this);
	}
	public Object clone()
	{
		return new ADecIntLiteral(
			(TDecIntLiteral) cloneNode(_decIntLiteral_));
	}
	public TDecIntLiteral getDecIntLiteral()
	{
		return _decIntLiteral_;
	}
	void removeChild(Node child)
	{
		if(_decIntLiteral_ == child)
		{
			_decIntLiteral_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_decIntLiteral_ == oldChild)
		{
			setDecIntLiteral((TDecIntLiteral) newChild);
			return;
		}

	}
	public void setDecIntLiteral(TDecIntLiteral node)
	{
		if(_decIntLiteral_ != null)
		{
			_decIntLiteral_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_decIntLiteral_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_decIntLiteral_);
	}
}
