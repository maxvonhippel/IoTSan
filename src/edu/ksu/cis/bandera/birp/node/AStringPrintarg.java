/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import java.util.*;
import edu.ksu.cis.bandera.birp.analysis.*;

public final class AStringPrintarg extends PPrintarg
{
    private TString _string_;

    public AStringPrintarg()
    {
    }

    public AStringPrintarg(
        TString _string_)
    {
        setString(_string_);

    }
    public Object clone()
    {
        return new AStringPrintarg(
            (TString) cloneNode(_string_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStringPrintarg(this);
    }

    public TString getString()
    {
        return _string_;
    }

    public void setString(TString node)
    {
        if(_string_ != null)
        {
            _string_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _string_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_string_);
    }

    void removeChild(Node child)
    {
        if(_string_ == child)
        {
            _string_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_string_ == oldChild)
        {
            setString((TString) newChild);
            return;
        }

    }
}
