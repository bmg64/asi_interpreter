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

public abstract class Node implements Switchable, Cloneable
{
    private Node parent;

    public abstract Object clone();

    public Node parent()
    {
        return parent;
    }

    void parent(Node parent)
    {
        this.parent = parent;
    }

    abstract void removeChild(Node child);
    abstract void replaceChild(Node oldChild, Node newChild);

    public void replaceBy(Node node)
    {
        if(parent != null)
        {
            parent.replaceChild(this, node);
        }
    }

    protected String toString(Node node)
    {
        if(node != null)
        {
            return node.toString();
        }

        return "";
    }

    protected String toString(List list)
    {
        StringBuffer s = new StringBuffer();

        for(Iterator i = list.iterator(); i.hasNext();)
        {
            s.append(i.next());
        }

        return s.toString();
    }

    protected Node cloneNode(Node node)
    {
        if(node != null)
        {
            return (Node) node.clone();
        }

        return null;
    }

    protected List cloneList(List list)
    {
        List clone = new LinkedList();

        for(Iterator i = list.iterator(); i.hasNext();)
        {
            clone.add(((Node) i.next()).clone());
        }

        return clone;
    }
}
