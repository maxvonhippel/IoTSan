/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import edu.ksu.cis.bandera.birp.analysis.*;

public final class TRecord extends Token
{
    public TRecord()
    {
        super.setText("record");
    }

    public TRecord(int line, int pos)
    {
        super.setText("record");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TRecord(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTRecord(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TRecord text.");
    }
}
