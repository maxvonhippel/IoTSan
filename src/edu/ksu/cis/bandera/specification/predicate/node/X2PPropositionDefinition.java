package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class X2PPropositionDefinition extends XPPropositionDefinition
{
	private PPropositionDefinition _pPropositionDefinition_;

	public X2PPropositionDefinition()
	{
	}
	public X2PPropositionDefinition(
		PPropositionDefinition _pPropositionDefinition_)
	{
		setPPropositionDefinition(_pPropositionDefinition_);
	}
	public void apply(Switch sw)
	{
		throw new RuntimeException("Switch not supported.");
	}
	public Object clone()
	{
		throw new RuntimeException("Unsupported Operation");
	}
	public PPropositionDefinition getPPropositionDefinition()
	{
		return _pPropositionDefinition_;
	}
	void removeChild(Node child)
	{
		if(_pPropositionDefinition_ == child)
		{
			_pPropositionDefinition_ = null;
		}
	}
	void replaceChild(Node oldChild, Node newChild)
	{
	}
	public void setPPropositionDefinition(PPropositionDefinition node)
	{
		if(_pPropositionDefinition_ != null)
		{
			_pPropositionDefinition_.parent(null);
		}

		if(node != null)
		{
			if(node.parent() != null)
			{
				node.parent().removeChild(node);
			}

			node.parent(this);
		}

		_pPropositionDefinition_ = node;
	}
	public String toString()
	{
		return "" +
			toString(_pPropositionDefinition_);
	}
}
