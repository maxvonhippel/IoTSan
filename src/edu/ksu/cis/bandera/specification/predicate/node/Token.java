package edu.ksu.cis.bandera.specification.predicate.node;

/* This file was generated by SableCC (http://www.sablecc.org/). */

public abstract class Token extends Node
{
	private String text;
	private int line;
	private int pos;

	public int getLine()
	{
		return line;
	}
	public int getPos()
	{
		return pos;
	}
	public String getText()
	{
		return text;
	}
	void removeChild(Node child)
	{
	}
	void replaceChild(Node oldChild, Node newChild)
	{
	}
	public void setLine(int line)
	{
		this.line = line;
	}
	public void setPos(int pos)
	{
		this.pos = pos;
	}
	public void setText(String text)
	{
		this.text = text;
	}
	public String toString()
	{
		return text + " ";
	}
}
