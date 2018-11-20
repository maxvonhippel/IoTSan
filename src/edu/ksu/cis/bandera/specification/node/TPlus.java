package edu.ksu.cis.bandera.specification.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

import edu.ksu.cis.bandera.specification.analysis.*;

public final class TPlus extends Token
{
	public TPlus()
	{
		super.setText("+");
	}
	public TPlus(int line, int pos)
	{
		super.setText("+");
		setLine(line);
		setPos(pos);
	}
	public void apply(Switch sw)
	{
		((Analysis) sw).caseTPlus(this);
	}
	public Object clone()
	{
	  return new TPlus(getLine(), getPos());
	}
	public void setText(String text)
	{
		throw new RuntimeException("Cannot change TPlus text.");
	}
}
