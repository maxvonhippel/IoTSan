/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import edu.ksu.cis.bandera.birp.analysis.*;

public final class TInvisible extends Token
{
    public TInvisible()
    {
        super.setText("invisible");
    }

    public TInvisible(int line, int pos)
    {
        super.setText("invisible");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TInvisible(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInvisible(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TInvisible text.");
    }
}
