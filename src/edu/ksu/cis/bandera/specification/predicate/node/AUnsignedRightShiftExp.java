package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class AUnsignedRightShiftExp extends PShiftExp
{
	private PShiftExp _shiftExp_;
	private TUnsignedShiftRight _unsignedShiftRight_;
	private PAddExp _addExp_;

	public AUnsignedRightShiftExp()
	{
	}
	public AUnsignedRightShiftExp(
		PShiftExp _shiftExp_,
		TUnsignedShiftRight _unsignedShiftRight_,
		PAddExp _addExp_)
	{
		setShiftExp(_shiftExp_);

		setUnsignedShiftRight(_unsignedShiftRight_);

		setAddExp(_addExp_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAUnsignedRightShiftExp(this);
	}
	public Object clone()
	{
		return new AUnsignedRightShiftExp(
			(PShiftExp) cloneNode(_shiftExp_),
			(TUnsignedShiftRight) cloneNode(_unsignedShiftRight_),
			(PAddExp) cloneNode(_addExp_));
	}
	public PAddExp getAddExp()
	{
		return _addExp_;
	}
	public PShiftExp getShiftExp()
	{
		return _shiftExp_;
	}
	public TUnsignedShiftRight getUnsignedShiftRight()
	{
		return _unsignedShiftRight_;
	}
	void removeChild(Node child)
	{
		if(_shiftExp_ == child)
		{
			_shiftExp_ = null;
			return;
		}

		if(_unsignedShiftRight_ == child)
		{
			_unsignedShiftRight_ = null;
			return;
		}

		if(_addExp_ == child)
		{
			_addExp_ = null;
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

		if(_unsignedShiftRight_ == oldChild)
		{
			setUnsignedShiftRight((TUnsignedShiftRight) newChild);
			return;
		}

		if(_addExp_ == oldChild)
		{
			setAddExp((PAddExp) newChild);
			return;
		}

	}
	public void setAddExp(PAddExp node)
	{
		if(_addExp_ != null)
		{
			_addExp_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_addExp_ = node;
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
	public void setUnsignedShiftRight(TUnsignedShiftRight node)
	{
		if(_unsignedShiftRight_ != null)
		{
			_unsignedShiftRight_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_unsignedShiftRight_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_shiftExp_)
			+ toString(_unsignedShiftRight_)
			+ toString(_addExp_);
	}
}
