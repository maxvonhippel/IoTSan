/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import edu.ksu.cis.bandera.birp.analysis.*;

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

    public Object clone()
    {
      return new TPlus(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPlus(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TPlus text.");
    }
}
