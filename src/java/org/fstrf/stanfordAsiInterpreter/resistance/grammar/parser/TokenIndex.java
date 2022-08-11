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

package org.fstrf.stanfordAsiInterpreter.resistance.grammar.parser;

import org.fstrf.stanfordAsiInterpreter.resistance.grammar.analysis.AnalysisAdapter;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.EOF;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.TAminoAcid;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.TAnd;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.TAtleast;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.TComma;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.TExactly;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.TExclude;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.TFloat;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.TFrom;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.TInteger;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.TLPar;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.TMapper;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.TMax;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.TMin;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.TNot;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.TNotmorethan;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.TOr;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.TRPar;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.TScore;
import org.fstrf.stanfordAsiInterpreter.resistance.grammar.node.TSelect;

class TokenIndex extends AnalysisAdapter {
    int index;

    @Override
    public void caseTMin(TMin node) {
        index = 0;
    }

    @Override
    public void caseTAnd(TAnd node) {
        index = 1;
    }

    @Override
    public void caseTOr(TOr node) {
        index = 2;
    }

    @Override
    public void caseTNot(TNot node) {
        index = 3;
    }

    @Override
    public void caseTExclude(TExclude node) {
        index = 4;
    }

    @Override
    public void caseTSelect(TSelect node) {
        index = 5;
    }

    @Override
    public void caseTFrom(TFrom node) {
        index = 6;
    }

    @Override
    public void caseTAtleast(TAtleast node) {
        index = 7;
    }

    @Override
    public void caseTExactly(TExactly node) {
        index = 8;
    }

    @Override
    public void caseTNotmorethan(TNotmorethan node) {
        index = 9;
    }

    @Override
    public void caseTScore(TScore node) {
        index = 10;
    }

    @Override
    public void caseTMax(TMax node) {
        index = 11;
    }

    @Override
    public void caseTLPar(TLPar node) {
        index = 12;
    }

    @Override
    public void caseTRPar(TRPar node) {
        index = 13;
    }

    @Override
    public void caseTMapper(TMapper node) {
        index = 14;
    }

    @Override
    public void caseTComma(TComma node) {
        index = 15;
    }

    @Override
    public void caseTInteger(TInteger node) {
        index = 16;
    }

    @Override
    public void caseTFloat(TFloat node) {
        index = 17;
    }

    @Override
    public void caseTAminoAcid(TAminoAcid node) {
        index = 18;
    }

    @Override
    public void caseEOF(EOF node) {
        index = 19;
    }
}
