/**
Copyright 2017 Frontier Science & Technology Research Foundation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

ADDITIONAL DISCLAIMER:
In addition to the standard warranty exclusions and limitations of 
liability set forth in sections 7, 8 and 9 of the Apache 2.0 license 
that governs the use and development of this software, Frontier Science 
& Technology Research Foundation disclaims any liability for use of 
this software for patient care or in clinical settings. This software 
was developed solely for use in medical and public health research, and 
was not intended, designed, or validated to guide patient care.
*/ 



/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.fstrf.stanfordAsiInterpreter.resistance.grammar.node;

import java.util.*;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.analysis.*;

public final class AResiduenotResidue extends PResidue<AResiduenotResidue>
{
    private TNot _not_;
    private TAminoAcid _originalaminoacid_;
    private TInteger _integer_;
    private final LinkedList<TAminoAcid> _mutatedaminoacid_ = new TypedLinkedList<>(new Mutatedaminoacid_Cast());

    public AResiduenotResidue()
    {
    }

    public AResiduenotResidue(
        TNot _not_,
        TAminoAcid _originalaminoacid_,
        TInteger _integer_,
        List<TAminoAcid> _mutatedaminoacid_)
    {
        setNot(_not_);

        setOriginalaminoacid(_originalaminoacid_);

        setInteger(_integer_);

        {
            this._mutatedaminoacid_.clear();
            this._mutatedaminoacid_.addAll(_mutatedaminoacid_);
        }

    }
    
    @SuppressWarnings("unchecked")
	@Override
    public AResiduenotResidue clone()
    {
        return new AResiduenotResidue(
            (TNot) cloneNode(_not_),
            (TAminoAcid) cloneNode(_originalaminoacid_),
            (TInteger) cloneNode(_integer_),
            (List<TAminoAcid>) cloneList(_mutatedaminoacid_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAResiduenotResidue(this);
    }

    public TNot getNot()
    {
        return _not_;
    }

    public void setNot(TNot node)
    {
        if(_not_ != null)
        {
            _not_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _not_ = node;
    }

    public TAminoAcid getOriginalaminoacid()
    {
        return _originalaminoacid_;
    }

    public void setOriginalaminoacid(TAminoAcid node)
    {
        if(_originalaminoacid_ != null)
        {
            _originalaminoacid_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _originalaminoacid_ = node;
    }

    public TInteger getInteger()
    {
        return _integer_;
    }

    public void setInteger(TInteger node)
    {
        if(_integer_ != null)
        {
            _integer_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _integer_ = node;
    }

    public LinkedList<TAminoAcid> getMutatedaminoacid()
    {
        return _mutatedaminoacid_;
    }

    public void setMutatedaminoacid(List<TAminoAcid> list)
    {
        _mutatedaminoacid_.clear();
        _mutatedaminoacid_.addAll(list);
    }

    @Override
    public String toString()
    {
        return ""
            + toString(_not_)
            + toString(_originalaminoacid_)
            + toString(_integer_)
            + toString(_mutatedaminoacid_);
    }

    @Override
    void removeChild(Node<?> child)
    {
        if(_not_ == child)
        {
            _not_ = null;
            return;
        }

        if(_originalaminoacid_ == child)
        {
            _originalaminoacid_ = null;
            return;
        }

        if(_integer_ == child)
        {
            _integer_ = null;
            return;
        }

        if(_mutatedaminoacid_.remove(child))
        {
            return;
        }

    }

    @Override
    <U extends Node<U>> void replaceChild(U oldChild, U newChild)
    {
        if(_not_ == oldChild)
        {
            setNot((TNot) newChild);
            return;
        }

        if(_originalaminoacid_ == oldChild)
        {
            setOriginalaminoacid((TAminoAcid) newChild);
            return;
        }

        if(_integer_ == oldChild)
        {
            setInteger((TInteger) newChild);
            return;
        }

        for(ListIterator<TAminoAcid> i = _mutatedaminoacid_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((TAminoAcid) newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

    }

    private class Mutatedaminoacid_Cast implements Cast<TAminoAcid>
    {
        public TAminoAcid cast(Object o)
        {
            TAminoAcid node = (TAminoAcid) o;

            if((node.parent() != null) &&
                (node.parent() != AResiduenotResidue.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != AResiduenotResidue.this))
            {
                node.parent(AResiduenotResidue.this);
            }

            return node;
        }
    }
}
