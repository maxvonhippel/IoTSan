/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import edu.ksu.cis.bandera.birp.analysis.*;

public final class TLock extends Token
{
    public TLock()
    {
        super.setText("lock");
    }

    public TLock(int line, int pos)
    {
        super.setText("lock");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TLock(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLock(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TLock text.");
    }
}
