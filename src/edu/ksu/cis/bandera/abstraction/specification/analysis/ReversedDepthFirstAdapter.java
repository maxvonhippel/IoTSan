package edu.ksu.cis.bandera.abstraction.specification.analysis;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Bandera, a Java(TM) analysis and transformation toolkit           *
 * Copyright (C) 1998-2001 SAnToS Laboratories (santos@cis.ksu.edu)  *

 * All rights reserved.                                              *
 *                                                                   *
 * This work was done as a project in the SAnToS Laboratory,         *
 * Department of Computing and Information Sciences, Kansas State    *
 * University, USA (http://www.cis.ksu.edu/santos).                  *
 * It is understood that any modification not identified as such is  *
 * not covered by the preceding statement.                           *
 *                                                                   *
 * This work is free software; you can redistribute it and/or        *
 * modify it under the terms of the GNU Library General Public       *
 * License as published by the Free Software Foundation; either      *
 * version 2 of the License, or (at your option) any later version.  *
 *                                                                   *
 * This work is distributed in the hope that it will be useful,      *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of    *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU *
 * Library General Public License for more details.                  *
 *                                                                   *
 * You should have received a copy of the GNU Library General Public *
 * License along with this toolkit; if not, write to the             *
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,      *
 * Boston, MA  02111-1307, USA.                                      *
 *                                                                   *
 * Java is a trademark of Sun Microsystems, Inc.                     *
 *                                                                   *
 * To submit a bug report, send a comment, or get the latest news on *
 * this project and other SAnToS projects, please visit the web-site *
 *                http://www.cis.ksu.edu/santos                      *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
/* This file was generated by SableCC (http://www.sable.mcgill.ca/sablecc/). */

import edu.ksu.cis.bandera.abstraction.specification.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
	public void caseAAbstractFunction(AAbstractFunction node)
	{
		inAAbstractFunction(node);
		if(node.getEnd() != null)
		{
			node.getEnd().apply(this);
		}
		{
			Object temp[] = node.getAbstractDef().toArray();
			for(int i = temp.length - 1; i >= 0; i--)
			{
				((PAbstractDef) temp[i]).apply(this);
			}
		}
		if(node.getBegin() != null)
		{
			node.getBegin().apply(this);
		}
		if(node.getRParen() != null)
		{
			node.getRParen().apply(this);
		}
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		if(node.getLParen() != null)
		{
			node.getLParen().apply(this);
		}
		if(node.getAbstract() != null)
		{
			node.getAbstract().apply(this);
		}
		outAAbstractFunction(node);
	}
	public void caseAAddExpShiftExp(AAddExpShiftExp node)
	{
		inAAddExpShiftExp(node);
		if(node.getAddExp() != null)
		{
			node.getAddExp().apply(this);
		}
		outAAddExpShiftExp(node);
	}
	public void caseAAndAndExp(AAndAndExp node)
	{
		inAAndAndExp(node);
		if(node.getInclusiveOrExp() != null)
		{
			node.getInclusiveOrExp().apply(this);
		}
		if(node.getAnd() != null)
		{
			node.getAnd().apply(this);
		}
		if(node.getAndExp() != null)
		{
			node.getAndExp().apply(this);
		}
		outAAndAndExp(node);
	}
	public void caseAAndBitAndExp(AAndBitAndExp node)
	{
		inAAndBitAndExp(node);
		if(node.getEqExp() != null)
		{
			node.getEqExp().apply(this);
		}
		if(node.getBitAnd() != null)
		{
			node.getBitAnd().apply(this);
		}
		if(node.getBitAndExp() != null)
		{
			node.getBitAndExp().apply(this);
		}
		outAAndBitAndExp(node);
	}
	public void caseAAndExclusiveOrExp(AAndExclusiveOrExp node)
	{
		inAAndExclusiveOrExp(node);
		if(node.getBitAndExp() != null)
		{
			node.getBitAndExp().apply(this);
		}
		outAAndExclusiveOrExp(node);
	}
	public void caseAAndOrExp(AAndOrExp node)
	{
		inAAndOrExp(node);
		if(node.getAndExp() != null)
		{
			node.getAndExp().apply(this);
		}
		outAAndOrExp(node);
	}
	public void caseAAnyAbstractDef(AAnyAbstractDef node)
	{
		inAAnyAbstractDef(node);
		if(node.getSemicolon() != null)
		{
			node.getSemicolon().apply(this);
		}
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		if(node.getRightarrow() != null)
		{
			node.getRightarrow().apply(this);
		}
		if(node.getAny() != null)
		{
			node.getAny().apply(this);
		}
		outAAnyAbstractDef(node);
	}
	public void caseAAnyAnyId(AAnyAnyId node)
	{
		inAAnyAnyId(node);
		if(node.getAny() != null)
		{
			node.getAny().apply(this);
		}
		outAAnyAnyId(node);
	}
	public void caseAAnyPattern(AAnyPattern node)
	{
		inAAnyPattern(node);
		if(node.getSemicolon() != null)
		{
			node.getSemicolon().apply(this);
		}
		if(node.getTokenTokenSet() != null)
		{
			node.getTokenTokenSet().apply(this);
		}
		if(node.getRightarrow() != null)
		{
			node.getRightarrow().apply(this);
		}
		if(node.getAny() != null)
		{
			node.getAny().apply(this);
		}
		outAAnyPattern(node);
	}
	public void caseABitComplementUnaryNotPlusMinusExp(ABitComplementUnaryNotPlusMinusExp node)
	{
		inABitComplementUnaryNotPlusMinusExp(node);
		if(node.getUnaryExp() != null)
		{
			node.getUnaryExp().apply(this);
		}
		if(node.getBitComplement() != null)
		{
			node.getBitComplement().apply(this);
		}
		outABitComplementUnaryNotPlusMinusExp(node);
	}
	public void caseAComplementUnaryNotPlusMinusExp(AComplementUnaryNotPlusMinusExp node)
	{
		inAComplementUnaryNotPlusMinusExp(node);
		if(node.getUnaryExp() != null)
		{
			node.getUnaryExp().apply(this);
		}
		if(node.getNot() != null)
		{
			node.getNot().apply(this);
		}
		outAComplementUnaryNotPlusMinusExp(node);
	}
	public void caseADecIntLiteral(ADecIntLiteral node)
	{
		inADecIntLiteral(node);
		if(node.getDecIntLiteral() != null)
		{
			node.getDecIntLiteral().apply(this);
		}
		outADecIntLiteral(node);
	}
	public void caseADecLongLiteral(ADecLongLiteral node)
	{
		inADecLongLiteral(node);
		if(node.getDecLongLiteral() != null)
		{
			node.getDecLongLiteral().apply(this);
		}
		outADecLongLiteral(node);
	}
	public void caseADefaultToken(ADefaultToken node)
	{
		inADefaultToken(node);
		if(node.getSemicolon() != null)
		{
			node.getSemicolon().apply(this);
		}
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		if(node.getEq() != null)
		{
			node.getEq().apply(this);
		}
		if(node.getDefault() != null)
		{
			node.getDefault().apply(this);
		}
		outADefaultToken(node);
	}
	public void caseADivMultExp(ADivMultExp node)
	{
		inADivMultExp(node);
		if(node.getUnaryExp() != null)
		{
			node.getUnaryExp().apply(this);
		}
		if(node.getDiv() != null)
		{
			node.getDiv().apply(this);
		}
		if(node.getMultExp() != null)
		{
			node.getMultExp().apply(this);
		}
		outADivMultExp(node);
	}
	public void caseADivOp(ADivOp node)
	{
		inADivOp(node);
		if(node.getDiv() != null)
		{
			node.getDiv().apply(this);
		}
		outADivOp(node);
	}
	public void caseADoubleLiteral(ADoubleLiteral node)
	{
		inADoubleLiteral(node);
		if(node.getDoubleLiteral() != null)
		{
			node.getDoubleLiteral().apply(this);
		}
		outADoubleLiteral(node);
	}
	public void caseAEqBitAndExp(AEqBitAndExp node)
	{
		inAEqBitAndExp(node);
		if(node.getEqExp() != null)
		{
			node.getEqExp().apply(this);
		}
		outAEqBitAndExp(node);
	}
	public void caseAEqEqExp(AEqEqExp node)
	{
		inAEqEqExp(node);
		if(node.getRelExp() != null)
		{
			node.getRelExp().apply(this);
		}
		if(node.getEqual() != null)
		{
			node.getEqual().apply(this);
		}
		if(node.getEqExp() != null)
		{
			node.getEqExp().apply(this);
		}
		outAEqEqExp(node);
	}
	public void caseAEqualTOp(AEqualTOp node)
	{
		inAEqualTOp(node);
		if(node.getEqual() != null)
		{
			node.getEqual().apply(this);
		}
		outAEqualTOp(node);
	}
	public void caseAExp(AExp node)
	{
		inAExp(node);
		if(node.getConditionalExp() != null)
		{
			node.getConditionalExp().apply(this);
		}
		outAExp(node);
	}
	public void caseAExpAbstractDef(AExpAbstractDef node)
	{
		inAExpAbstractDef(node);
		if(node.getSemicolon() != null)
		{
			node.getSemicolon().apply(this);
		}
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		if(node.getRightarrow() != null)
		{
			node.getRightarrow().apply(this);
		}
		if(node.getExp() != null)
		{
			node.getExp().apply(this);
		}
		outAExpAbstractDef(node);
	}
	public void caseAFloatLiteral(AFloatLiteral node)
	{
		inAFloatLiteral(node);
		if(node.getFloatLiteral() != null)
		{
			node.getFloatLiteral().apply(this);
		}
		outAFloatLiteral(node);
	}
	public void caseAGreaterEqualRelExp(AGreaterEqualRelExp node)
	{
		inAGreaterEqualRelExp(node);
		if(node.getShiftExp() != null)
		{
			node.getShiftExp().apply(this);
		}
		if(node.getGreaterEqual() != null)
		{
			node.getGreaterEqual().apply(this);
		}
		if(node.getRelExp() != null)
		{
			node.getRelExp().apply(this);
		}
		outAGreaterEqualRelExp(node);
	}
	public void caseAGreaterEqualTOp(AGreaterEqualTOp node)
	{
		inAGreaterEqualTOp(node);
		if(node.getGreaterEqual() != null)
		{
			node.getGreaterEqual().apply(this);
		}
		outAGreaterEqualTOp(node);
	}
	public void caseAGreaterRelExp(AGreaterRelExp node)
	{
		inAGreaterRelExp(node);
		if(node.getShiftExp() != null)
		{
			node.getShiftExp().apply(this);
		}
		if(node.getGreater() != null)
		{
			node.getGreater().apply(this);
		}
		if(node.getRelExp() != null)
		{
			node.getRelExp().apply(this);
		}
		outAGreaterRelExp(node);
	}
	public void caseAGreaterTOp(AGreaterTOp node)
	{
		inAGreaterTOp(node);
		if(node.getGreater() != null)
		{
			node.getGreater().apply(this);
		}
		outAGreaterTOp(node);
	}
	public void caseAHexIntLiteral(AHexIntLiteral node)
	{
		inAHexIntLiteral(node);
		if(node.getHexIntLiteral() != null)
		{
			node.getHexIntLiteral().apply(this);
		}
		outAHexIntLiteral(node);
	}
	public void caseAHexLongLiteral(AHexLongLiteral node)
	{
		inAHexLongLiteral(node);
		if(node.getHexLongLiteral() != null)
		{
			node.getHexLongLiteral().apply(this);
		}
		outAHexLongLiteral(node);
	}
	public void caseAIdAnyId(AIdAnyId node)
	{
		inAIdAnyId(node);
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		outAIdAnyId(node);
	}
	public void caseAIdIdList(AIdIdList node)
	{
		inAIdIdList(node);
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		outAIdIdList(node);
	}
	public void caseAIdPrimaryExp(AIdPrimaryExp node)
	{
		inAIdPrimaryExp(node);
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		outAIdPrimaryExp(node);
	}
	public void caseAIdSet(AIdSet node)
	{
		inAIdSet(node);
		if(node.getRBrace() != null)
		{
			node.getRBrace().apply(this);
		}
		if(node.getIdList() != null)
		{
			node.getIdList().apply(this);
		}
		if(node.getLBrace() != null)
		{
			node.getLBrace().apply(this);
		}
		outAIdSet(node);
	}
	public void caseAIdsIdList(AIdsIdList node)
	{
		inAIdsIdList(node);
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		if(node.getComma() != null)
		{
			node.getComma().apply(this);
		}
		if(node.getIdList() != null)
		{
			node.getIdList().apply(this);
		}
		outAIdsIdList(node);
	}
	public void caseAInclusiveOrAndExp(AInclusiveOrAndExp node)
	{
		inAInclusiveOrAndExp(node);
		if(node.getInclusiveOrExp() != null)
		{
			node.getInclusiveOrExp().apply(this);
		}
		outAInclusiveOrAndExp(node);
	}
	public void caseAIntegralType(AIntegralType node)
	{
		inAIntegralType(node);
		if(node.getIntegral() != null)
		{
			node.getIntegral().apply(this);
		}
		outAIntegralType(node);
	}
	public void caseALeftShiftExp(ALeftShiftExp node)
	{
		inALeftShiftExp(node);
		if(node.getAddExp() != null)
		{
			node.getAddExp().apply(this);
		}
		if(node.getShiftLeft() != null)
		{
			node.getShiftLeft().apply(this);
		}
		if(node.getShiftExp() != null)
		{
			node.getShiftExp().apply(this);
		}
		outALeftShiftExp(node);
	}
	public void caseALessEqualRelExp(ALessEqualRelExp node)
	{
		inALessEqualRelExp(node);
		if(node.getShiftExp() != null)
		{
			node.getShiftExp().apply(this);
		}
		if(node.getLessEqual() != null)
		{
			node.getLessEqual().apply(this);
		}
		if(node.getRelExp() != null)
		{
			node.getRelExp().apply(this);
		}
		outALessEqualRelExp(node);
	}
	public void caseALessEqualTOp(ALessEqualTOp node)
	{
		inALessEqualTOp(node);
		if(node.getLessEqual() != null)
		{
			node.getLessEqual().apply(this);
		}
		outALessEqualTOp(node);
	}
	public void caseALessRelExp(ALessRelExp node)
	{
		inALessRelExp(node);
		if(node.getShiftExp() != null)
		{
			node.getShiftExp().apply(this);
		}
		if(node.getLess() != null)
		{
			node.getLess().apply(this);
		}
		if(node.getRelExp() != null)
		{
			node.getRelExp().apply(this);
		}
		outALessRelExp(node);
	}
	public void caseALessTOp(ALessTOp node)
	{
		inALessTOp(node);
		if(node.getLess() != null)
		{
			node.getLess().apply(this);
		}
		outALessTOp(node);
	}
	public void caseALiteralPrimaryExp(ALiteralPrimaryExp node)
	{
		inALiteralPrimaryExp(node);
		if(node.getLiteral() != null)
		{
			node.getLiteral().apply(this);
		}
		outALiteralPrimaryExp(node);
	}
	public void caseAMinusAddExp(AMinusAddExp node)
	{
		inAMinusAddExp(node);
		if(node.getMultExp() != null)
		{
			node.getMultExp().apply(this);
		}
		if(node.getMinus() != null)
		{
			node.getMinus().apply(this);
		}
		if(node.getAddExp() != null)
		{
			node.getAddExp().apply(this);
		}
		outAMinusAddExp(node);
	}
	public void caseAMinusOp(AMinusOp node)
	{
		inAMinusOp(node);
		if(node.getMinus() != null)
		{
			node.getMinus().apply(this);
		}
		outAMinusOp(node);
	}
	public void caseAMinusUnaryExp(AMinusUnaryExp node)
	{
		inAMinusUnaryExp(node);
		if(node.getUnaryExp() != null)
		{
			node.getUnaryExp().apply(this);
		}
		if(node.getMinus() != null)
		{
			node.getMinus().apply(this);
		}
		outAMinusUnaryExp(node);
	}
	public void caseAModMultExp(AModMultExp node)
	{
		inAModMultExp(node);
		if(node.getUnaryExp() != null)
		{
			node.getUnaryExp().apply(this);
		}
		if(node.getMod() != null)
		{
			node.getMod().apply(this);
		}
		if(node.getMultExp() != null)
		{
			node.getMultExp().apply(this);
		}
		outAModMultExp(node);
	}
	public void caseAModOp(AModOp node)
	{
		inAModOp(node);
		if(node.getMod() != null)
		{
			node.getMod().apply(this);
		}
		outAModOp(node);
	}
	public void caseAMultAddExp(AMultAddExp node)
	{
		inAMultAddExp(node);
		if(node.getMultExp() != null)
		{
			node.getMultExp().apply(this);
		}
		outAMultAddExp(node);
	}
	public void caseANeqEqExp(ANeqEqExp node)
	{
		inANeqEqExp(node);
		if(node.getRelExp() != null)
		{
			node.getRelExp().apply(this);
		}
		if(node.getNotEqual() != null)
		{
			node.getNotEqual().apply(this);
		}
		if(node.getEqExp() != null)
		{
			node.getEqExp().apply(this);
		}
		outANeqEqExp(node);
	}
	public void caseANotEqualTOp(ANotEqualTOp node)
	{
		inANotEqualTOp(node);
		if(node.getNotEqual() != null)
		{
			node.getNotEqual().apply(this);
		}
		outANotEqualTOp(node);
	}
	public void caseAOctIntLiteral(AOctIntLiteral node)
	{
		inAOctIntLiteral(node);
		if(node.getOctIntLiteral() != null)
		{
			node.getOctIntLiteral().apply(this);
		}
		outAOctIntLiteral(node);
	}
	public void caseAOctLongLiteral(AOctLongLiteral node)
	{
		inAOctLongLiteral(node);
		if(node.getOctLongLiteral() != null)
		{
			node.getOctLongLiteral().apply(this);
		}
		outAOctLongLiteral(node);
	}
	public void caseAOne2oneSet(AOne2oneSet node)
	{
		inAOne2oneSet(node);
		if(node.getSemicolon() != null)
		{
			node.getSemicolon().apply(this);
		}
		if(node.getRBrace() != null)
		{
			node.getRBrace().apply(this);
		}
		if(node.getIdList() != null)
		{
			node.getIdList().apply(this);
		}
		if(node.getLBrace() != null)
		{
			node.getLBrace().apply(this);
		}
		if(node.getEq() != null)
		{
			node.getEq().apply(this);
		}
		if(node.getOne2one() != null)
		{
			node.getOne2one().apply(this);
		}
		outAOne2oneSet(node);
	}
	public void caseAOperator(AOperator node)
	{
		inAOperator(node);
		if(node.getEnd() != null)
		{
			node.getEnd().apply(this);
		}
		{
			Object temp[] = node.getPattern().toArray();
			for(int i = temp.length - 1; i >= 0; i--)
			{
				((PPattern) temp[i]).apply(this);
			}
		}
		if(node.getBegin() != null)
		{
			node.getBegin().apply(this);
		}
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		if(node.getOp() != null)
		{
			node.getOp().apply(this);
		}
		if(node.getOperator() != null)
		{
			node.getOperator().apply(this);
		}
		outAOperator(node);
	}
	public void caseAOperatorOperatorTest(AOperatorOperatorTest node)
	{
		inAOperatorOperatorTest(node);
		if(node.getOperator() != null)
		{
			node.getOperator().apply(this);
		}
		outAOperatorOperatorTest(node);
	}
	public void caseAOrConditionalExp(AOrConditionalExp node)
	{
		inAOrConditionalExp(node);
		if(node.getOrExp() != null)
		{
			node.getOrExp().apply(this);
		}
		outAOrConditionalExp(node);
	}
	public void caseAOrInclusiveOrExp(AOrInclusiveOrExp node)
	{
		inAOrInclusiveOrExp(node);
		if(node.getExclusiveOrExp() != null)
		{
			node.getExclusiveOrExp().apply(this);
		}
		if(node.getBitOr() != null)
		{
			node.getBitOr().apply(this);
		}
		if(node.getInclusiveOrExp() != null)
		{
			node.getInclusiveOrExp().apply(this);
		}
		outAOrInclusiveOrExp(node);
	}
	public void caseAOrOrExp(AOrOrExp node)
	{
		inAOrOrExp(node);
		if(node.getAndExp() != null)
		{
			node.getAndExp().apply(this);
		}
		if(node.getOr() != null)
		{
			node.getOr().apply(this);
		}
		if(node.getOrExp() != null)
		{
			node.getOrExp().apply(this);
		}
		outAOrOrExp(node);
	}
	public void caseAParenPrimaryExp(AParenPrimaryExp node)
	{
		inAParenPrimaryExp(node);
		if(node.getRParen() != null)
		{
			node.getRParen().apply(this);
		}
		if(node.getExp() != null)
		{
			node.getExp().apply(this);
		}
		if(node.getLParen() != null)
		{
			node.getLParen().apply(this);
		}
		outAParenPrimaryExp(node);
	}
	public void caseAPatternPattern(APatternPattern node)
	{
		inAPatternPattern(node);
		if(node.getSemicolon() != null)
		{
			node.getSemicolon().apply(this);
		}
		if(node.getTokenTokenSet() != null)
		{
			node.getTokenTokenSet().apply(this);
		}
		if(node.getRightarrow() != null)
		{
			node.getRightarrow().apply(this);
		}
		if(node.getRParen() != null)
		{
			node.getRParen().apply(this);
		}
		if(node.getRId() != null)
		{
			node.getRId().apply(this);
		}
		if(node.getComma() != null)
		{
			node.getComma().apply(this);
		}
		if(node.getLId() != null)
		{
			node.getLId().apply(this);
		}
		if(node.getLParen() != null)
		{
			node.getLParen().apply(this);
		}
		outAPatternPattern(node);
	}
	public void caseAPlusAddExp(APlusAddExp node)
	{
		inAPlusAddExp(node);
		if(node.getMultExp() != null)
		{
			node.getMultExp().apply(this);
		}
		if(node.getPlus() != null)
		{
			node.getPlus().apply(this);
		}
		if(node.getAddExp() != null)
		{
			node.getAddExp().apply(this);
		}
		outAPlusAddExp(node);
	}
	public void caseAPlusOp(APlusOp node)
	{
		inAPlusOp(node);
		if(node.getPlus() != null)
		{
			node.getPlus().apply(this);
		}
		outAPlusOp(node);
	}
	public void caseAPlusUnaryExp(APlusUnaryExp node)
	{
		inAPlusUnaryExp(node);
		if(node.getUnaryExp() != null)
		{
			node.getUnaryExp().apply(this);
		}
		if(node.getPlus() != null)
		{
			node.getPlus().apply(this);
		}
		outAPlusUnaryExp(node);
	}
	public void caseAPrimaryUnaryNotPlusMinusExp(APrimaryUnaryNotPlusMinusExp node)
	{
		inAPrimaryUnaryNotPlusMinusExp(node);
		if(node.getPrimaryExp() != null)
		{
			node.getPrimaryExp().apply(this);
		}
		outAPrimaryUnaryNotPlusMinusExp(node);
	}
	public void caseAQuestionConditionalExp(AQuestionConditionalExp node)
	{
		inAQuestionConditionalExp(node);
		if(node.getFalseExp() != null)
		{
			node.getFalseExp().apply(this);
		}
		if(node.getColon() != null)
		{
			node.getColon().apply(this);
		}
		if(node.getTrueExp() != null)
		{
			node.getTrueExp().apply(this);
		}
		if(node.getQuestion() != null)
		{
			node.getQuestion().apply(this);
		}
		if(node.getOrExp() != null)
		{
			node.getOrExp().apply(this);
		}
		outAQuestionConditionalExp(node);
	}
	public void caseARealType(ARealType node)
	{
		inARealType(node);
		if(node.getReal() != null)
		{
			node.getReal().apply(this);
		}
		outARealType(node);
	}
	public void caseARelEqExp(ARelEqExp node)
	{
		inARelEqExp(node);
		if(node.getRelExp() != null)
		{
			node.getRelExp().apply(this);
		}
		outARelEqExp(node);
	}
	public void caseAShiftRelExp(AShiftRelExp node)
	{
		inAShiftRelExp(node);
		if(node.getShiftExp() != null)
		{
			node.getShiftExp().apply(this);
		}
		outAShiftRelExp(node);
	}
	public void caseASignedRightShiftExp(ASignedRightShiftExp node)
	{
		inASignedRightShiftExp(node);
		if(node.getAddExp() != null)
		{
			node.getAddExp().apply(this);
		}
		if(node.getSignedShiftRight() != null)
		{
			node.getSignedShiftRight().apply(this);
		}
		if(node.getShiftExp() != null)
		{
			node.getShiftExp().apply(this);
		}
		outASignedRightShiftExp(node);
	}
	public void caseATest(ATest node)
	{
		inATest(node);
		if(node.getEnd() != null)
		{
			node.getEnd().apply(this);
		}
		{
			Object temp[] = node.getPattern().toArray();
			for(int i = temp.length - 1; i >= 0; i--)
			{
				((PPattern) temp[i]).apply(this);
			}
		}
		if(node.getBegin() != null)
		{
			node.getBegin().apply(this);
		}
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		if(node.getTOp() != null)
		{
			node.getTOp().apply(this);
		}
		if(node.getTest() != null)
		{
			node.getTest().apply(this);
		}
		outATest(node);
	}
	public void caseATestOperatorTest(ATestOperatorTest node)
	{
		inATestOperatorTest(node);
		if(node.getTest() != null)
		{
			node.getTest().apply(this);
		}
		outATestOperatorTest(node);
	}
	public void caseATimesMultExp(ATimesMultExp node)
	{
		inATimesMultExp(node);
		if(node.getUnaryExp() != null)
		{
			node.getUnaryExp().apply(this);
		}
		if(node.getTimes() != null)
		{
			node.getTimes().apply(this);
		}
		if(node.getMultExp() != null)
		{
			node.getMultExp().apply(this);
		}
		outATimesMultExp(node);
	}
	public void caseATimesOp(ATimesOp node)
	{
		inATimesOp(node);
		if(node.getTimes() != null)
		{
			node.getTimes().apply(this);
		}
		outATimesOp(node);
	}
	public void caseATokenSet(ATokenSet node)
	{
		inATokenSet(node);
		if(node.getSemicolon() != null)
		{
			node.getSemicolon().apply(this);
		}
		if(node.getIdSet() != null)
		{
			node.getIdSet().apply(this);
		}
		if(node.getEq() != null)
		{
			node.getEq().apply(this);
		}
		if(node.getTokens() != null)
		{
			node.getTokens().apply(this);
		}
		outATokenSet(node);
	}
	public void caseATokenSetTokenTokenSet(ATokenSetTokenTokenSet node)
	{
		inATokenSetTokenTokenSet(node);
		if(node.getIdSet() != null)
		{
			node.getIdSet().apply(this);
		}
		outATokenSetTokenTokenSet(node);
	}
	public void caseATokenTokenTokenSet(ATokenTokenTokenSet node)
	{
		inATokenTokenTokenSet(node);
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		outATokenTokenTokenSet(node);
	}
	public void caseAUnaryExpMultExp(AUnaryExpMultExp node)
	{
		inAUnaryExpMultExp(node);
		if(node.getUnaryExp() != null)
		{
			node.getUnaryExp().apply(this);
		}
		outAUnaryExpMultExp(node);
	}
	public void caseAUnaryNotPlusMinusUnaryExp(AUnaryNotPlusMinusUnaryExp node)
	{
		inAUnaryNotPlusMinusUnaryExp(node);
		if(node.getUnaryNotPlusMinusExp() != null)
		{
			node.getUnaryNotPlusMinusExp().apply(this);
		}
		outAUnaryNotPlusMinusUnaryExp(node);
	}
	public void caseAUnit(AUnit node)
	{
		inAUnit(node);
		if(node.getEnd() != null)
		{
			node.getEnd().apply(this);
		}
		{
			Object temp[] = node.getOperatorTest().toArray();
			for(int i = temp.length - 1; i >= 0; i--)
			{
				((POperatorTest) temp[i]).apply(this);
			}
		}
		if(node.getAbstractFunction() != null)
		{
			node.getAbstractFunction().apply(this);
		}
		if(node.getOne2oneSet() != null)
		{
			node.getOne2oneSet().apply(this);
		}
		if(node.getDefaultToken() != null)
		{
			node.getDefaultToken().apply(this);
		}
		if(node.getTokenSet() != null)
		{
			node.getTokenSet().apply(this);
		}
		if(node.getBegin() != null)
		{
			node.getBegin().apply(this);
		}
		if(node.getType() != null)
		{
			node.getType().apply(this);
		}
		if(node.getExtends() != null)
		{
			node.getExtends().apply(this);
		}
		if(node.getId() != null)
		{
			node.getId().apply(this);
		}
		if(node.getAbstraction() != null)
		{
			node.getAbstraction().apply(this);
		}
		outAUnit(node);
	}
	public void caseAUnsignedRightShiftExp(AUnsignedRightShiftExp node)
	{
		inAUnsignedRightShiftExp(node);
		if(node.getAddExp() != null)
		{
			node.getAddExp().apply(this);
		}
		if(node.getUnsignedShiftRight() != null)
		{
			node.getUnsignedShiftRight().apply(this);
		}
		if(node.getShiftExp() != null)
		{
			node.getShiftExp().apply(this);
		}
		outAUnsignedRightShiftExp(node);
	}
	public void caseAXorExclusiveOrExp(AXorExclusiveOrExp node)
	{
		inAXorExclusiveOrExp(node);
		if(node.getBitAndExp() != null)
		{
			node.getBitAndExp().apply(this);
		}
		if(node.getBitXor() != null)
		{
			node.getBitXor().apply(this);
		}
		if(node.getExclusiveOrExp() != null)
		{
			node.getExclusiveOrExp().apply(this);
		}
		outAXorExclusiveOrExp(node);
	}
	public void caseAXorInclusiveOrExp(AXorInclusiveOrExp node)
	{
		inAXorInclusiveOrExp(node);
		if(node.getExclusiveOrExp() != null)
		{
			node.getExclusiveOrExp().apply(this);
		}
		outAXorInclusiveOrExp(node);
	}
	public void caseStart(Start node)
	{
		inStart(node);
		node.getEOF().apply(this);
		node.getPUnit().apply(this);
		outStart(node);
	}
	public void defaultIn(Node node)
	{
	}
	public void defaultOut(Node node)
	{
	}
	public void inAAbstractFunction(AAbstractFunction node)
	{
		defaultIn(node);
	}
	public void inAAddExpShiftExp(AAddExpShiftExp node)
	{
		defaultIn(node);
	}
	public void inAAndAndExp(AAndAndExp node)
	{
		defaultIn(node);
	}
	public void inAAndBitAndExp(AAndBitAndExp node)
	{
		defaultIn(node);
	}
	public void inAAndExclusiveOrExp(AAndExclusiveOrExp node)
	{
		defaultIn(node);
	}
	public void inAAndOrExp(AAndOrExp node)
	{
		defaultIn(node);
	}
	public void inAAnyAbstractDef(AAnyAbstractDef node)
	{
		defaultIn(node);
	}
	public void inAAnyAnyId(AAnyAnyId node)
	{
		defaultIn(node);
	}
	public void inAAnyPattern(AAnyPattern node)
	{
		defaultIn(node);
	}
	public void inABitComplementUnaryNotPlusMinusExp(ABitComplementUnaryNotPlusMinusExp node)
	{
		defaultIn(node);
	}
	public void inAComplementUnaryNotPlusMinusExp(AComplementUnaryNotPlusMinusExp node)
	{
		defaultIn(node);
	}
	public void inADecIntLiteral(ADecIntLiteral node)
	{
		defaultIn(node);
	}
	public void inADecLongLiteral(ADecLongLiteral node)
	{
		defaultIn(node);
	}
	public void inADefaultToken(ADefaultToken node)
	{
		defaultIn(node);
	}
	public void inADivMultExp(ADivMultExp node)
	{
		defaultIn(node);
	}
	public void inADivOp(ADivOp node)
	{
		defaultIn(node);
	}
	public void inADoubleLiteral(ADoubleLiteral node)
	{
		defaultIn(node);
	}
	public void inAEqBitAndExp(AEqBitAndExp node)
	{
		defaultIn(node);
	}
	public void inAEqEqExp(AEqEqExp node)
	{
		defaultIn(node);
	}
	public void inAEqualTOp(AEqualTOp node)
	{
		defaultIn(node);
	}
	public void inAExp(AExp node)
	{
		defaultIn(node);
	}
	public void inAExpAbstractDef(AExpAbstractDef node)
	{
		defaultIn(node);
	}
	public void inAFloatLiteral(AFloatLiteral node)
	{
		defaultIn(node);
	}
	public void inAGreaterEqualRelExp(AGreaterEqualRelExp node)
	{
		defaultIn(node);
	}
	public void inAGreaterEqualTOp(AGreaterEqualTOp node)
	{
		defaultIn(node);
	}
	public void inAGreaterRelExp(AGreaterRelExp node)
	{
		defaultIn(node);
	}
	public void inAGreaterTOp(AGreaterTOp node)
	{
		defaultIn(node);
	}
	public void inAHexIntLiteral(AHexIntLiteral node)
	{
		defaultIn(node);
	}
	public void inAHexLongLiteral(AHexLongLiteral node)
	{
		defaultIn(node);
	}
	public void inAIdAnyId(AIdAnyId node)
	{
		defaultIn(node);
	}
	public void inAIdIdList(AIdIdList node)
	{
		defaultIn(node);
	}
	public void inAIdPrimaryExp(AIdPrimaryExp node)
	{
		defaultIn(node);
	}
	public void inAIdSet(AIdSet node)
	{
		defaultIn(node);
	}
	public void inAIdsIdList(AIdsIdList node)
	{
		defaultIn(node);
	}
	public void inAInclusiveOrAndExp(AInclusiveOrAndExp node)
	{
		defaultIn(node);
	}
	public void inAIntegralType(AIntegralType node)
	{
		defaultIn(node);
	}
	public void inALeftShiftExp(ALeftShiftExp node)
	{
		defaultIn(node);
	}
	public void inALessEqualRelExp(ALessEqualRelExp node)
	{
		defaultIn(node);
	}
	public void inALessEqualTOp(ALessEqualTOp node)
	{
		defaultIn(node);
	}
	public void inALessRelExp(ALessRelExp node)
	{
		defaultIn(node);
	}
	public void inALessTOp(ALessTOp node)
	{
		defaultIn(node);
	}
	public void inALiteralPrimaryExp(ALiteralPrimaryExp node)
	{
		defaultIn(node);
	}
	public void inAMinusAddExp(AMinusAddExp node)
	{
		defaultIn(node);
	}
	public void inAMinusOp(AMinusOp node)
	{
		defaultIn(node);
	}
	public void inAMinusUnaryExp(AMinusUnaryExp node)
	{
		defaultIn(node);
	}
	public void inAModMultExp(AModMultExp node)
	{
		defaultIn(node);
	}
	public void inAModOp(AModOp node)
	{
		defaultIn(node);
	}
	public void inAMultAddExp(AMultAddExp node)
	{
		defaultIn(node);
	}
	public void inANeqEqExp(ANeqEqExp node)
	{
		defaultIn(node);
	}
	public void inANotEqualTOp(ANotEqualTOp node)
	{
		defaultIn(node);
	}
	public void inAOctIntLiteral(AOctIntLiteral node)
	{
		defaultIn(node);
	}
	public void inAOctLongLiteral(AOctLongLiteral node)
	{
		defaultIn(node);
	}
	public void inAOne2oneSet(AOne2oneSet node)
	{
		defaultIn(node);
	}
	public void inAOperator(AOperator node)
	{
		defaultIn(node);
	}
	public void inAOperatorOperatorTest(AOperatorOperatorTest node)
	{
		defaultIn(node);
	}
	public void inAOrConditionalExp(AOrConditionalExp node)
	{
		defaultIn(node);
	}
	public void inAOrInclusiveOrExp(AOrInclusiveOrExp node)
	{
		defaultIn(node);
	}
	public void inAOrOrExp(AOrOrExp node)
	{
		defaultIn(node);
	}
	public void inAParenPrimaryExp(AParenPrimaryExp node)
	{
		defaultIn(node);
	}
	public void inAPatternPattern(APatternPattern node)
	{
		defaultIn(node);
	}
	public void inAPlusAddExp(APlusAddExp node)
	{
		defaultIn(node);
	}
	public void inAPlusOp(APlusOp node)
	{
		defaultIn(node);
	}
	public void inAPlusUnaryExp(APlusUnaryExp node)
	{
		defaultIn(node);
	}
	public void inAPrimaryUnaryNotPlusMinusExp(APrimaryUnaryNotPlusMinusExp node)
	{
		defaultIn(node);
	}
	public void inAQuestionConditionalExp(AQuestionConditionalExp node)
	{
		defaultIn(node);
	}
	public void inARealType(ARealType node)
	{
		defaultIn(node);
	}
	public void inARelEqExp(ARelEqExp node)
	{
		defaultIn(node);
	}
	public void inAShiftRelExp(AShiftRelExp node)
	{
		defaultIn(node);
	}
	public void inASignedRightShiftExp(ASignedRightShiftExp node)
	{
		defaultIn(node);
	}
	public void inATest(ATest node)
	{
		defaultIn(node);
	}
	public void inATestOperatorTest(ATestOperatorTest node)
	{
		defaultIn(node);
	}
	public void inATimesMultExp(ATimesMultExp node)
	{
		defaultIn(node);
	}
	public void inATimesOp(ATimesOp node)
	{
		defaultIn(node);
	}
	public void inATokenSet(ATokenSet node)
	{
		defaultIn(node);
	}
	public void inATokenSetTokenTokenSet(ATokenSetTokenTokenSet node)
	{
		defaultIn(node);
	}
	public void inATokenTokenTokenSet(ATokenTokenTokenSet node)
	{
		defaultIn(node);
	}
	public void inAUnaryExpMultExp(AUnaryExpMultExp node)
	{
		defaultIn(node);
	}
	public void inAUnaryNotPlusMinusUnaryExp(AUnaryNotPlusMinusUnaryExp node)
	{
		defaultIn(node);
	}
	public void inAUnit(AUnit node)
	{
		defaultIn(node);
	}
	public void inAUnsignedRightShiftExp(AUnsignedRightShiftExp node)
	{
		defaultIn(node);
	}
	public void inAXorExclusiveOrExp(AXorExclusiveOrExp node)
	{
		defaultIn(node);
	}
	public void inAXorInclusiveOrExp(AXorInclusiveOrExp node)
	{
		defaultIn(node);
	}
	public void inStart(Start node)
	{
		defaultIn(node);
	}
	public void outAAbstractFunction(AAbstractFunction node)
	{
		defaultOut(node);
	}
	public void outAAddExpShiftExp(AAddExpShiftExp node)
	{
		defaultOut(node);
	}
	public void outAAndAndExp(AAndAndExp node)
	{
		defaultOut(node);
	}
	public void outAAndBitAndExp(AAndBitAndExp node)
	{
		defaultOut(node);
	}
	public void outAAndExclusiveOrExp(AAndExclusiveOrExp node)
	{
		defaultOut(node);
	}
	public void outAAndOrExp(AAndOrExp node)
	{
		defaultOut(node);
	}
	public void outAAnyAbstractDef(AAnyAbstractDef node)
	{
		defaultOut(node);
	}
	public void outAAnyAnyId(AAnyAnyId node)
	{
		defaultOut(node);
	}
	public void outAAnyPattern(AAnyPattern node)
	{
		defaultOut(node);
	}
	public void outABitComplementUnaryNotPlusMinusExp(ABitComplementUnaryNotPlusMinusExp node)
	{
		defaultOut(node);
	}
	public void outAComplementUnaryNotPlusMinusExp(AComplementUnaryNotPlusMinusExp node)
	{
		defaultOut(node);
	}
	public void outADecIntLiteral(ADecIntLiteral node)
	{
		defaultOut(node);
	}
	public void outADecLongLiteral(ADecLongLiteral node)
	{
		defaultOut(node);
	}
	public void outADefaultToken(ADefaultToken node)
	{
		defaultOut(node);
	}
	public void outADivMultExp(ADivMultExp node)
	{
		defaultOut(node);
	}
	public void outADivOp(ADivOp node)
	{
		defaultOut(node);
	}
	public void outADoubleLiteral(ADoubleLiteral node)
	{
		defaultOut(node);
	}
	public void outAEqBitAndExp(AEqBitAndExp node)
	{
		defaultOut(node);
	}
	public void outAEqEqExp(AEqEqExp node)
	{
		defaultOut(node);
	}
	public void outAEqualTOp(AEqualTOp node)
	{
		defaultOut(node);
	}
	public void outAExp(AExp node)
	{
		defaultOut(node);
	}
	public void outAExpAbstractDef(AExpAbstractDef node)
	{
		defaultOut(node);
	}
	public void outAFloatLiteral(AFloatLiteral node)
	{
		defaultOut(node);
	}
	public void outAGreaterEqualRelExp(AGreaterEqualRelExp node)
	{
		defaultOut(node);
	}
	public void outAGreaterEqualTOp(AGreaterEqualTOp node)
	{
		defaultOut(node);
	}
	public void outAGreaterRelExp(AGreaterRelExp node)
	{
		defaultOut(node);
	}
	public void outAGreaterTOp(AGreaterTOp node)
	{
		defaultOut(node);
	}
	public void outAHexIntLiteral(AHexIntLiteral node)
	{
		defaultOut(node);
	}
	public void outAHexLongLiteral(AHexLongLiteral node)
	{
		defaultOut(node);
	}
	public void outAIdAnyId(AIdAnyId node)
	{
		defaultOut(node);
	}
	public void outAIdIdList(AIdIdList node)
	{
		defaultOut(node);
	}
	public void outAIdPrimaryExp(AIdPrimaryExp node)
	{
		defaultOut(node);
	}
	public void outAIdSet(AIdSet node)
	{
		defaultOut(node);
	}
	public void outAIdsIdList(AIdsIdList node)
	{
		defaultOut(node);
	}
	public void outAInclusiveOrAndExp(AInclusiveOrAndExp node)
	{
		defaultOut(node);
	}
	public void outAIntegralType(AIntegralType node)
	{
		defaultOut(node);
	}
	public void outALeftShiftExp(ALeftShiftExp node)
	{
		defaultOut(node);
	}
	public void outALessEqualRelExp(ALessEqualRelExp node)
	{
		defaultOut(node);
	}
	public void outALessEqualTOp(ALessEqualTOp node)
	{
		defaultOut(node);
	}
	public void outALessRelExp(ALessRelExp node)
	{
		defaultOut(node);
	}
	public void outALessTOp(ALessTOp node)
	{
		defaultOut(node);
	}
	public void outALiteralPrimaryExp(ALiteralPrimaryExp node)
	{
		defaultOut(node);
	}
	public void outAMinusAddExp(AMinusAddExp node)
	{
		defaultOut(node);
	}
	public void outAMinusOp(AMinusOp node)
	{
		defaultOut(node);
	}
	public void outAMinusUnaryExp(AMinusUnaryExp node)
	{
		defaultOut(node);
	}
	public void outAModMultExp(AModMultExp node)
	{
		defaultOut(node);
	}
	public void outAModOp(AModOp node)
	{
		defaultOut(node);
	}
	public void outAMultAddExp(AMultAddExp node)
	{
		defaultOut(node);
	}
	public void outANeqEqExp(ANeqEqExp node)
	{
		defaultOut(node);
	}
	public void outANotEqualTOp(ANotEqualTOp node)
	{
		defaultOut(node);
	}
	public void outAOctIntLiteral(AOctIntLiteral node)
	{
		defaultOut(node);
	}
	public void outAOctLongLiteral(AOctLongLiteral node)
	{
		defaultOut(node);
	}
	public void outAOne2oneSet(AOne2oneSet node)
	{
		defaultOut(node);
	}
	public void outAOperator(AOperator node)
	{
		defaultOut(node);
	}
	public void outAOperatorOperatorTest(AOperatorOperatorTest node)
	{
		defaultOut(node);
	}
	public void outAOrConditionalExp(AOrConditionalExp node)
	{
		defaultOut(node);
	}
	public void outAOrInclusiveOrExp(AOrInclusiveOrExp node)
	{
		defaultOut(node);
	}
	public void outAOrOrExp(AOrOrExp node)
	{
		defaultOut(node);
	}
	public void outAParenPrimaryExp(AParenPrimaryExp node)
	{
		defaultOut(node);
	}
	public void outAPatternPattern(APatternPattern node)
	{
		defaultOut(node);
	}
	public void outAPlusAddExp(APlusAddExp node)
	{
		defaultOut(node);
	}
	public void outAPlusOp(APlusOp node)
	{
		defaultOut(node);
	}
	public void outAPlusUnaryExp(APlusUnaryExp node)
	{
		defaultOut(node);
	}
	public void outAPrimaryUnaryNotPlusMinusExp(APrimaryUnaryNotPlusMinusExp node)
	{
		defaultOut(node);
	}
	public void outAQuestionConditionalExp(AQuestionConditionalExp node)
	{
		defaultOut(node);
	}
	public void outARealType(ARealType node)
	{
		defaultOut(node);
	}
	public void outARelEqExp(ARelEqExp node)
	{
		defaultOut(node);
	}
	public void outAShiftRelExp(AShiftRelExp node)
	{
		defaultOut(node);
	}
	public void outASignedRightShiftExp(ASignedRightShiftExp node)
	{
		defaultOut(node);
	}
	public void outATest(ATest node)
	{
		defaultOut(node);
	}
	public void outATestOperatorTest(ATestOperatorTest node)
	{
		defaultOut(node);
	}
	public void outATimesMultExp(ATimesMultExp node)
	{
		defaultOut(node);
	}
	public void outATimesOp(ATimesOp node)
	{
		defaultOut(node);
	}
	public void outATokenSet(ATokenSet node)
	{
		defaultOut(node);
	}
	public void outATokenSetTokenTokenSet(ATokenSetTokenTokenSet node)
	{
		defaultOut(node);
	}
	public void outATokenTokenTokenSet(ATokenTokenTokenSet node)
	{
		defaultOut(node);
	}
	public void outAUnaryExpMultExp(AUnaryExpMultExp node)
	{
		defaultOut(node);
	}
	public void outAUnaryNotPlusMinusUnaryExp(AUnaryNotPlusMinusUnaryExp node)
	{
		defaultOut(node);
	}
	public void outAUnit(AUnit node)
	{
		defaultOut(node);
	}
	public void outAUnsignedRightShiftExp(AUnsignedRightShiftExp node)
	{
		defaultOut(node);
	}
	public void outAXorExclusiveOrExp(AXorExclusiveOrExp node)
	{
		defaultOut(node);
	}
	public void outAXorInclusiveOrExp(AXorInclusiveOrExp node)
	{
		defaultOut(node);
	}
	public void outStart(Start node)
	{
		defaultOut(node);
	}
}
