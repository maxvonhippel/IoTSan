/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.sessions.parser.v1.node;

import java.util.*;
import edu.ksu.cis.bandera.sessions.parser.v1.analysis.*;

public final class AStringsStrings extends PStrings
{
    private PStrings _strings_;
    private TPlus _plus_;
    private TStringLiteral _stringLiteral_;

    public AStringsStrings()
    {
    }

    public AStringsStrings(
        PStrings _strings_,
        TPlus _plus_,
        TStringLiteral _stringLiteral_)
    {
        setStrings(_strings_);

        setPlus(_plus_);

        setStringLiteral(_stringLiteral_);

    }
    public Object clone()
    {
        return new AStringsStrings(
            (PStrings) cloneNode(_strings_),
            (TPlus) cloneNode(_plus_),
            (TStringLiteral) cloneNode(_stringLiteral_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStringsStrings(this);
    }

    public PStrings getStrings()
    {
        return _strings_;
    }

    public void setStrings(PStrings node)
    {
        if(_strings_ != null)
        {
            _strings_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _strings_ = node;
    }

    public TPlus getPlus()
    {
        return _plus_;
    }

    public void setPlus(TPlus node)
    {
        if(_plus_ != null)
        {
            _plus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _plus_ = node;
    }

    public TStringLiteral getStringLiteral()
    {
        return _stringLiteral_;
    }

    public void setStringLiteral(TStringLiteral node)
    {
        if(_stringLiteral_ != null)
        {
            _stringLiteral_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _stringLiteral_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_strings_)
            + toString(_plus_)
            + toString(_stringLiteral_);
    }

    void removeChild(Node child)
    {
        if(_strings_ == child)
        {
            _strings_ = null;
            return;
        }

        if(_plus_ == child)
        {
            _plus_ = null;
            return;
        }

        if(_stringLiteral_ == child)
        {
            _stringLiteral_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_strings_ == oldChild)
        {
            setStrings((PStrings) newChild);
            return;
        }

        if(_plus_ == oldChild)
        {
            setPlus((TPlus) newChild);
            return;
        }

        if(_stringLiteral_ == oldChild)
        {
            setStringLiteral((TStringLiteral) newChild);
            return;
        }

    }
}
