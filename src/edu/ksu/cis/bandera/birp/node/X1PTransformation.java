/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import edu.ksu.cis.bandera.birp.analysis.*;

public final class X1PTransformation extends XPTransformation
{
    private XPTransformation _xPTransformation_;
    private PTransformation _pTransformation_;

    public X1PTransformation()
    {
    }

    public X1PTransformation(
        XPTransformation _xPTransformation_,
        PTransformation _pTransformation_)
    {
        setXPTransformation(_xPTransformation_);
        setPTransformation(_pTransformation_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPTransformation getXPTransformation()
    {
        return _xPTransformation_;
    }

    public void setXPTransformation(XPTransformation node)
    {
        if(_xPTransformation_ != null)
        {
            _xPTransformation_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPTransformation_ = node;
    }

    public PTransformation getPTransformation()
    {
        return _pTransformation_;
    }

    public void setPTransformation(PTransformation node)
    {
        if(_pTransformation_ != null)
        {
            _pTransformation_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pTransformation_ = node;
    }

    void removeChild(Node child)
    {
        if(_xPTransformation_ == child)
        {
            _xPTransformation_ = null;
        }

        if(_pTransformation_ == child)
        {
            _pTransformation_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPTransformation_) +
            toString(_pTransformation_);
    }
}
