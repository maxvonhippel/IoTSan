/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import java.util.*;
import edu.ksu.cis.bandera.birp.analysis.*;

public final class AMinusExpr1 extends PExpr1
{
    private TMinus _minus_;
    private PExpr1 _expr1_;

    public AMinusExpr1()
    {
    }

    public AMinusExpr1(
        TMinus _minus_,
        PExpr1 _expr1_)
    {
        setMinus(_minus_);

        setExpr1(_expr1_);

    }
    public Object clone()
    {
        return new AMinusExpr1(
            (TMinus) cloneNode(_minus_),
            (PExpr1) cloneNode(_expr1_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMinusExpr1(this);
    }

    public TMinus getMinus()
    {
        return _minus_;
    }

    public void setMinus(TMinus node)
    {
        if(_minus_ != null)
        {
            _minus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _minus_ = node;
    }

    public PExpr1 getExpr1()
    {
        return _expr1_;
    }

    public void setExpr1(PExpr1 node)
    {
        if(_expr1_ != null)
        {
            _expr1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expr1_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_minus_)
            + toString(_expr1_);
    }

    void removeChild(Node child)
    {
        if(_minus_ == child)
        {
            _minus_ = null;
            return;
        }

        if(_expr1_ == child)
        {
            _expr1_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_minus_ == oldChild)
        {
            setMinus((TMinus) newChild);
            return;
        }

        if(_expr1_ == oldChild)
        {
            setExpr1((PExpr1) newChild);
            return;
        }

    }
}
