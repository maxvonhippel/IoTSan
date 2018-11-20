package edu.ksu.cis.bandera.specification.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.analysis.*;

public final class AFormat extends PFormat
{
	private TDoubleQuote _quote1_;
	private final LinkedList _formatWord_ = new TypedLinkedList(new FormatWord_Cast());
	private TDoubleQuote _quote2_;

	private class FormatWord_Cast implements Cast
	{
		public Object cast(Object o)
		{
			PFormatWord node = (PFormatWord) o;

			if((node.parent() != null) &&
				(node.parent() != AFormat.this))
			{
				node.parent().removeChild(node);
			}

			if((node.parent() == null) ||
				(node.parent() != AFormat.this))
			{
				node.parent(AFormat.this);
			}

			return node;
		}
	}
	public AFormat()
	{
	}
	public AFormat(
		TDoubleQuote _quote1_,
		XPFormatWord _formatWord_,
		TDoubleQuote _quote2_)
	{
		setQuote1(_quote1_);

		if(_formatWord_ != null)
		{
			while(_formatWord_ instanceof X1PFormatWord)
			{
				this._formatWord_.addFirst(((X1PFormatWord) _formatWord_).getPFormatWord());
				_formatWord_ = ((X1PFormatWord) _formatWord_).getXPFormatWord();
			}
			this._formatWord_.addFirst(((X2PFormatWord) _formatWord_).getPFormatWord());
		}

		setQuote2(_quote2_);

	}
	public AFormat(
		TDoubleQuote _quote1_,
		List _formatWord_,
		TDoubleQuote _quote2_)
	{
		setQuote1(_quote1_);

		{
			this._formatWord_.clear();
			this._formatWord_.addAll(_formatWord_);
		}

		setQuote2(_quote2_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAFormat(this);
	}
	public Object clone()
	{
		return new AFormat(
			(TDoubleQuote) cloneNode(_quote1_),
			cloneList(_formatWord_),
			(TDoubleQuote) cloneNode(_quote2_));
	}
	public LinkedList getFormatWord()
	{
		return _formatWord_;
	}
	public TDoubleQuote getQuote1()
	{
		return _quote1_;
	}
	public TDoubleQuote getQuote2()
	{
		return _quote2_;
	}
	void removeChild(Node child)
	{
		if(_quote1_ == child)
		{
			_quote1_ = null;
			return;
		}

		if(_formatWord_.remove(child))
		{
			return;
		}

		if(_quote2_ == child)
		{
			_quote2_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_quote1_ == oldChild)
		{
			setQuote1((TDoubleQuote) newChild);
			return;
		}

		for(ListIterator i = _formatWord_.listIterator(); i.hasNext();)
		{
			if(i.next() == oldChild)
			{
				if(newChild != null)
				{
					i.set(newChild);
					oldChild.parent(null);
					return;
				}

				i.remove();
				oldChild.parent(null);
				return;
			}
		}

		if(_quote2_ == oldChild)
		{
			setQuote2((TDoubleQuote) newChild);
			return;
		}

	}
	public void setFormatWord(List list)
	{
		_formatWord_.clear();
		_formatWord_.addAll(list);
	}
	public void setQuote1(TDoubleQuote node)
	{
		if(_quote1_ != null)
		{
			_quote1_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_quote1_ = node;
	}
	public void setQuote2(TDoubleQuote node)
	{
		if(_quote2_ != null)
		{
			_quote2_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_quote2_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_quote1_)
			+ toString(_formatWord_)
			+ toString(_quote2_);
	}
}
