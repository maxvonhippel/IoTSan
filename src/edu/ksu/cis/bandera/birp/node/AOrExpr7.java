/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import java.util.*;
import edu.ksu.cis.bandera.birp.analysis.*;

public final class AOrExpr7 extends PExpr7
{
    private PExpr7 _expr7_;
    private TOr _or_;
    private PExpr6 _expr6_;

    public AOrExpr7()
    {
    }

    public AOrExpr7(
        PExpr7 _expr7_,
        TOr _or_,
        PExpr6 _expr6_)
    {
        setExpr7(_expr7_);

        setOr(_or_);

        setExpr6(_expr6_);

    }
    public Object clone()
    {
        return new AOrExpr7(
            (PExpr7) cloneNode(_expr7_),
            (TOr) cloneNode(_or_),
            (PExpr6) cloneNode(_expr6_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOrExpr7(this);
    }

    public PExpr7 getExpr7()
    {
        return _expr7_;
    }

    public void setExpr7(PExpr7 node)
    {
        if(_expr7_ != null)
        {
            _expr7_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expr7_ = node;
    }

    public TOr getOr()
    {
        return _or_;
    }

    public void setOr(TOr node)
    {
        if(_or_ != null)
        {
            _or_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _or_ = node;
    }

    public PExpr6 getExpr6()
    {
        return _expr6_;
    }

    public void setExpr6(PExpr6 node)
    {
        if(_expr6_ != null)
        {
            _expr6_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expr6_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_expr7_)
            + toString(_or_)
            + toString(_expr6_);
    }

    void removeChild(Node child)
    {
        if(_expr7_ == child)
        {
            _expr7_ = null;
            return;
        }

        if(_or_ == child)
        {
            _or_ = null;
            return;
        }

        if(_expr6_ == child)
        {
            _expr6_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_expr7_ == oldChild)
        {
            setExpr7((PExpr7) newChild);
            return;
        }

        if(_or_ == oldChild)
        {
            setOr((TOr) newChild);
            return;
        }

        if(_expr6_ == oldChild)
        {
            setExpr6((PExpr6) newChild);
            return;
        }

    }
}
