package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class TRetVal extends Token
{
	public TRetVal()
	{
		super.setText("$ret");
	}
	public TRetVal(int line, int pos)
	{
		super.setText("$ret");
		setLine(line);
		setPos(pos);
	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseTRetVal(this);
	}
	public Object clone()
	{
	  return new TRetVal(getLine(), getPos());
	}
	public void setText(String text)
	{
		throw new RuntimeException("Cannot change TRetVal text.");
	}
}
