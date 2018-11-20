package edu.ksu.cis.bandera.specification.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import java.util.*;
import edu.ksu.cis.bandera.specification.analysis.*;

public final class AAssertionImport extends PImport
{
	private TImport _import_;
	private TAssertion _assertion_;
	private PImportNames _importNames_;
	private TSemicolon _semicolon_;

	public AAssertionImport()
	{
	}
	public AAssertionImport(
		TImport _import_,
		TAssertion _assertion_,
		PImportNames _importNames_,
		TSemicolon _semicolon_)
	{
		setImport(_import_);

		setAssertion(_assertion_);

		setImportNames(_importNames_);

		setSemicolon(_semicolon_);

	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseAAssertionImport(this);
	}
	public Object clone()
	{
		return new AAssertionImport(
			(TImport) cloneNode(_import_),
			(TAssertion) cloneNode(_assertion_),
			(PImportNames) cloneNode(_importNames_),
			(TSemicolon) cloneNode(_semicolon_));
	}
	public TAssertion getAssertion()
	{
		return _assertion_;
	}
	public TImport getImport()
	{
		return _import_;
	}
	public PImportNames getImportNames()
	{
		return _importNames_;
	}
	public TSemicolon getSemicolon()
	{
		return _semicolon_;
	}
	void removeChild(Node child)
	{
		if(_import_ == child)
		{
			_import_ = null;
			return;
		}

		if(_assertion_ == child)
		{
			_assertion_ = null;
			return;
		}

		if(_importNames_ == child)
		{
			_importNames_ = null;
			return;
		}

		if(_semicolon_ == child)
		{
			_semicolon_ = null;
			return;
		}

	}
	void replaceChild(Node oldChild, Node newChild)
	{
		if(_import_ == oldChild)
		{
			setImport((TImport) newChild);
			return;
		}

		if(_assertion_ == oldChild)
		{
			setAssertion((TAssertion) newChild);
			return;
		}

		if(_importNames_ == oldChild)
		{
			setImportNames((PImportNames) newChild);
			return;
		}

		if(_semicolon_ == oldChild)
		{
			setSemicolon((TSemicolon) newChild);
			return;
		}

	}
	public void setAssertion(TAssertion node)
	{
		if(_assertion_ != null)
		{
			_assertion_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_assertion_ = node;
	}
	public void setImport(TImport node)
	{
		if(_import_ != null)
		{
			_import_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_import_ = node;
	}
	public void setImportNames(PImportNames node)
	{
		if(_importNames_ != null)
		{
			_importNames_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_importNames_ = node;
	}
	public void setSemicolon(TSemicolon node)
	{
		if(_semicolon_ != null)
		{
			_semicolon_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_semicolon_ = node;
	}
	public String toString()
	{
		return ""
			+ toString(_import_)
			+ toString(_assertion_)
			+ toString(_importNames_)
			+ toString(_semicolon_);
	}
}
