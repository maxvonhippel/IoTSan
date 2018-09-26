/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import java.util.*;
import edu.ksu.cis.bandera.birp.analysis.*;

public final class AOneStartargs extends PStartargs
{
    private PStartarg _startarg_;

    public AOneStartargs()
    {
    }

    public AOneStartargs(
        PStartarg _startarg_)
    {
        setStartarg(_startarg_);

    }
    public Object clone()
    {
        return new AOneStartargs(
            (PStartarg) cloneNode(_startarg_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOneStartargs(this);
    }

    public PStartarg getStartarg()
    {
        return _startarg_;
    }

    public void setStartarg(PStartarg node)
    {
        if(_startarg_ != null)
        {
            _startarg_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _startarg_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_startarg_);
    }

    void removeChild(Node child)
    {
        if(_startarg_ == child)
        {
            _startarg_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_startarg_ == oldChild)
        {
            setStartarg((PStartarg) newChild);
            return;
        }

    }
}
