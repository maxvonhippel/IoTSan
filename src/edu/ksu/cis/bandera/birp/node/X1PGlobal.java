/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import edu.ksu.cis.bandera.birp.analysis.*;

public final class X1PGlobal extends XPGlobal
{
    private XPGlobal _xPGlobal_;
    private PGlobal _pGlobal_;

    public X1PGlobal()
    {
    }

    public X1PGlobal(
        XPGlobal _xPGlobal_,
        PGlobal _pGlobal_)
    {
        setXPGlobal(_xPGlobal_);
        setPGlobal(_pGlobal_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPGlobal getXPGlobal()
    {
        return _xPGlobal_;
    }

    public void setXPGlobal(XPGlobal node)
    {
        if(_xPGlobal_ != null)
        {
            _xPGlobal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPGlobal_ = node;
    }

    public PGlobal getPGlobal()
    {
        return _pGlobal_;
    }

    public void setPGlobal(PGlobal node)
    {
        if(_pGlobal_ != null)
        {
            _pGlobal_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pGlobal_ = node;
    }

    void removeChild(Node child)
    {
        if(_xPGlobal_ == child)
        {
            _xPGlobal_ = null;
        }

        if(_pGlobal_ == child)
        {
            _pGlobal_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPGlobal_) +
            toString(_pGlobal_);
    }
}
