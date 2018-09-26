package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class AFloatPrimitiveType extends PPrimitiveType
{
	private TFloat _float_;

	public AFloatPrimitiveType()
	{
	}
	public AFloatPrimitiveType(
		TFloat _float_)
	{
		setFloat(_float_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAFloatPrimitiveType(this);
	}
	public Object clone()
	{
		return new AFloatPrimitiveType(
			(TFloat) cloneNode(_float_));
	}
	public TFloat getFloat()
	{
		return _float_;
	}
	void removeChild(Node child)
	{
		if(_float_ == child)
		{
			_float_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_float_ == oldChild)
		{
			setFloat((TFloat) newChild);
			return;
		}

	}
	public void setFloat(TFloat node)
	{
		if(_float_ != null)
		{
			_float_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_float_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_float_);
	}
}
