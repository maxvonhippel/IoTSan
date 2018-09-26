/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import edu.ksu.cis.bandera.birp.analysis.*;

public final class TOr extends Token
{
    public TOr()
    {
        super.setText("||");
    }

    public TOr(int line, int pos)
    {
        super.setText("||");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TOr(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOr(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TOr text.");
    }
}
