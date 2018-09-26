package edu.ksu.cis.bandera.specification.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.analysis.*;

public final class AAssertDef extends PDef
{
	private PAssert _assert_;

	public AAssertDef()
	{
	}
	public AAssertDef(
		PAssert _assert_)
	{
		setAssert(_assert_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAAssertDef(this);
	}
	public Object clone()
	{
		return new AAssertDef(
			(PAssert) cloneNode(_assert_));
	}
	public PAssert getAssert()
	{
		return _assert_;
	}
	void removeChild(Node child)
	{
		if(_assert_ == child)
		{
			_assert_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_assert_ == oldChild)
		{
			setAssert((PAssert) newChild);
			return;
		}

	}
	public void setAssert(PAssert node)
	{
		if(_assert_ != null)
		{
			_assert_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_assert_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_assert_);
	}
}
