/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import java.util.*;
import edu.ksu.cis.bandera.birp.analysis.*;

public final class AOneParameters extends PParameters
{
    private PParameter _parameter_;

    public AOneParameters()
    {
    }

    public AOneParameters(
        PParameter _parameter_)
    {
        setParameter(_parameter_);

    }
    public Object clone()
    {
        return new AOneParameters(
            (PParameter) cloneNode(_parameter_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOneParameters(this);
    }

    public PParameter getParameter()
    {
        return _parameter_;
    }

    public void setParameter(PParameter node)
    {
        if(_parameter_ != null)
        {
            _parameter_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _parameter_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_parameter_);
    }

    void removeChild(Node child)
    {
        if(_parameter_ == child)
        {
            _parameter_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_parameter_ == oldChild)
        {
            setParameter((PParameter) newChild);
            return;
        }

    }
}
