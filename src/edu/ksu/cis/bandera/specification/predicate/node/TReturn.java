package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class TReturn extends Token
{
	public TReturn()
	{
		super.setText("RETURN");
	}
	public TReturn(int line, int pos)
	{
		super.setText("RETURN");
		setLine(line);
		setPos(pos);
	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseTReturn(this);
	}
	public Object clone()
	{
	  return new TReturn(getLine(), getPos());
	}
	public void setText(String text)
	{
		throw new RuntimeException("Cannot change TReturn text.");
	}
}
