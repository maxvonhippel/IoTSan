/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.sessions.parser.v1.node;

import edu.ksu.cis.bandera.sessions.parser.v1.analysis.*;

public final class Start extends Node
{
    private PUnit _pUnit_;
    private EOF _eof_;

    public Start()
    {
    }

    public Start(
        PUnit _pUnit_,
        EOF _eof_)
    {
        setPUnit(_pUnit_);
        setEOF(_eof_);
    }

    public Object clone()
    {
        return new Start(
            (PUnit) cloneNode(_pUnit_),
            (EOF) cloneNode(_eof_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseStart(this);
    }

    public PUnit getPUnit()
    {
        return _pUnit_;
    }

    public void setPUnit(PUnit node)
    {
        if(_pUnit_ != null)
        {
            _pUnit_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pUnit_ = node;
    }

    public EOF getEOF()
    {
        return _eof_;
    }

    public void setEOF(EOF node)
    {
        if(_eof_ != null)
        {
            _eof_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _eof_ = node;
    }

    void removeChild(Node child)
    {
        if(_pUnit_ == child)
        {
            _pUnit_ = null;
            return;
        }

        if(_eof_ == child)
        {
            _eof_ = null;
            return;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_pUnit_ == oldChild)
        {
            setPUnit((PUnit) newChild);
            return;
        }

        if(_eof_ == oldChild)
        {
            setEOF((EOF) newChild);
            return;
        }
    }

    public String toString()
    {
        return "" +
            toString(_pUnit_) +
            toString(_eof_);
    }
}
