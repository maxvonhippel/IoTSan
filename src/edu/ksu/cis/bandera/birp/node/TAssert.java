/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import edu.ksu.cis.bandera.birp.analysis.*;

public final class TAssert extends Token
{
    public TAssert()
    {
        super.setText("assert");
    }

    public TAssert(int line, int pos)
    {
        super.setText("assert");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TAssert(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAssert(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TAssert text.");
    }
}
