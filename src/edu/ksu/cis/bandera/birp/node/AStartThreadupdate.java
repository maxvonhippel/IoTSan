/* This file was generated by SableCC (http://www.sablecc.org/). */

package edu.ksu.cis.bandera.birp.node;

import java.util.*;
import edu.ksu.cis.bandera.birp.analysis.*;

public final class AStartThreadupdate extends PThreadupdate
{
    private PLhsAssign _lhsAssign_;
    private TStart _start_;
    private TId _id_;
    private TLparen _lparen_;
    private PStartargs _startargs_;
    private TRparen _rparen_;
    private TSemicolon _semicolon_;

    public AStartThreadupdate()
    {
    }

    public AStartThreadupdate(
        PLhsAssign _lhsAssign_,
        TStart _start_,
        TId _id_,
        TLparen _lparen_,
        PStartargs _startargs_,
        TRparen _rparen_,
        TSemicolon _semicolon_)
    {
        setLhsAssign(_lhsAssign_);

        setStart(_start_);

        setId(_id_);

        setLparen(_lparen_);

        setStartargs(_startargs_);

        setRparen(_rparen_);

        setSemicolon(_semicolon_);

    }
    public Object clone()
    {
        return new AStartThreadupdate(
            (PLhsAssign) cloneNode(_lhsAssign_),
            (TStart) cloneNode(_start_),
            (TId) cloneNode(_id_),
            (TLparen) cloneNode(_lparen_),
            (PStartargs) cloneNode(_startargs_),
            (TRparen) cloneNode(_rparen_),
            (TSemicolon) cloneNode(_semicolon_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStartThreadupdate(this);
    }

    public PLhsAssign getLhsAssign()
    {
        return _lhsAssign_;
    }

    public void setLhsAssign(PLhsAssign node)
    {
        if(_lhsAssign_ != null)
        {
            _lhsAssign_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lhsAssign_ = node;
    }

    public TStart getStart()
    {
        return _start_;
    }

    public void setStart(TStart node)
    {
        if(_start_ != null)
        {
            _start_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _start_ = node;
    }

    public TId getId()
    {
        return _id_;
    }

    public void setId(TId node)
    {
        if(_id_ != null)
        {
            _id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _id_ = node;
    }

    public TLparen getLparen()
    {
        return _lparen_;
    }

    public void setLparen(TLparen node)
    {
        if(_lparen_ != null)
        {
            _lparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _lparen_ = node;
    }

    public PStartargs getStartargs()
    {
        return _startargs_;
    }

    public void setStartargs(PStartargs node)
    {
        if(_startargs_ != null)
        {
            _startargs_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _startargs_ = node;
    }

    public TRparen getRparen()
    {
        return _rparen_;
    }

    public void setRparen(TRparen node)
    {
        if(_rparen_ != null)
        {
            _rparen_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rparen_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return _semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(_semicolon_ != null)
        {
            _semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _semicolon_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_lhsAssign_)
            + toString(_start_)
            + toString(_id_)
            + toString(_lparen_)
            + toString(_startargs_)
            + toString(_rparen_)
            + toString(_semicolon_);
    }

    void removeChild(Node child)
    {
        if(_lhsAssign_ == child)
        {
            _lhsAssign_ = null;
            return;
        }

        if(_start_ == child)
        {
            _start_ = null;
            return;
        }

        if(_id_ == child)
        {
            _id_ = null;
            return;
        }

        if(_lparen_ == child)
        {
            _lparen_ = null;
            return;
        }

        if(_startargs_ == child)
        {
            _startargs_ = null;
            return;
        }

        if(_rparen_ == child)
        {
            _rparen_ = null;
            return;
        }

        if(_semicolon_ == child)
        {
            _semicolon_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_lhsAssign_ == oldChild)
        {
            setLhsAssign((PLhsAssign) newChild);
            return;
        }

        if(_start_ == oldChild)
        {
            setStart((TStart) newChild);
            return;
        }

        if(_id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(_lparen_ == oldChild)
        {
            setLparen((TLparen) newChild);
            return;
        }

        if(_startargs_ == oldChild)
        {
            setStartargs((PStartargs) newChild);
            return;
        }

        if(_rparen_ == oldChild)
        {
            setRparen((TRparen) newChild);
            return;
        }

        if(_semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

    }
}
