package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class TAnd extends Token
{
	public TAnd()
	{
		super.setText("&&");
	}
	public TAnd(int line, int pos)
	{
		super.setText("&&");
		setLine(line);
		setPos(pos);
	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseTAnd(this);
	}
	public Object clone()
	{
	  return new TAnd(getLine(), getPos());
	}
	public void setText(String text)
	{
		throw new RuntimeException("Cannot change TAnd text.");
	}
}
