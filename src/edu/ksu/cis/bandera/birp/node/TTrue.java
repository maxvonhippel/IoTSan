/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import edu.ksu.cis.bandera.birp.analysis.*;

public final class TTrue extends Token
{
    public TTrue()
    {
        super.setText("true");
    }

    public TTrue(int line, int pos)
    {
        super.setText("true");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TTrue(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTTrue(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TTrue text.");
    }
}
