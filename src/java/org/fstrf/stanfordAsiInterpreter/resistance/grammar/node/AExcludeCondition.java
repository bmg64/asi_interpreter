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

import org.fstrf.stanfordAsiInterpreter.resistance.grammar.analysis.*;

public final class AExcludeCondition extends PCondition<AExcludeCondition>
{
    private PExcludestatement<?> _excludestatement_;

    public AExcludeCondition()
    {
    }

    public AExcludeCondition(
        PExcludestatement<?> _excludestatement_)
    {
        setExcludestatement(_excludestatement_);

    }
    
    @Override
    public AExcludeCondition clone()
    {
        return new AExcludeCondition(
        	(PExcludestatement<?>) cloneNode(_excludestatement_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAExcludeCondition(this);
    }

    public PExcludestatement<?> getExcludestatement()
    {
        return _excludestatement_;
    }

    public void setExcludestatement(PExcludestatement<?> node)
    {
        if(_excludestatement_ != null)
        {
            _excludestatement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _excludestatement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(_excludestatement_);
    }

    @Override
    void removeChild(Node<?> child)
    {
        if(_excludestatement_ == child)
        {
            _excludestatement_ = null;
            return;
        }

    }

    @Override
    <U extends Node<U>> void replaceChild(U oldChild, U newChild)
    {
        if(_excludestatement_ == oldChild)
        {
            setExcludestatement((PExcludestatement<?>) newChild);
            return;
        }

    }
}
