package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class AShiftRelExp extends PRelExp
{
	private PShiftExp _shiftExp_;

	public AShiftRelExp()
	{
	}
	public AShiftRelExp(
		PShiftExp _shiftExp_)
	{
		setShiftExp(_shiftExp_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAShiftRelExp(this);
	}
	public Object clone()
	{
		return new AShiftRelExp(
			(PShiftExp) cloneNode(_shiftExp_));
	}
	public PShiftExp getShiftExp()
	{
		return _shiftExp_;
	}
	void removeChild(Node child)
	{
		if(_shiftExp_ == child)
		{
			_shiftExp_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_shiftExp_ == oldChild)
		{
			setShiftExp((PShiftExp) newChild);
			return;
		}

	}
	public void setShiftExp(PShiftExp node)
	{
		if(_shiftExp_ != null)
		{
			_shiftExp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_shiftExp_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_shiftExp_);
	}
}
