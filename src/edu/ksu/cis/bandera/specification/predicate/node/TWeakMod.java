package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.predicate.analysis.*;

public final class TWeakMod extends Token
{
	public TWeakMod()
	{
		super.setText("%%");
	}
	public TWeakMod(int line, int pos)
	{
		super.setText("%%");
		setLine(line);
		setPos(pos);
	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseTWeakMod(this);
	}
	public Object clone()
	{
	  return new TWeakMod(getLine(), getPos());
	}
	public void setText(String text)
	{
		throw new RuntimeException("Cannot change TWeakMod text.");
	}
}
