package edu.ksu.cis.bandera.jjjc.analysis;

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
import ca.mcgill.sable.util.*;
import edu.ksu.cis.bandera.jjjc.node.*;

public interface Analysis extends Switch
{
	void caseAAbstractMethodDeclaration(AAbstractMethodDeclaration node);
	void caseAAbstractMethodDeclarationInterfaceMemberDeclaration(AAbstractMethodDeclarationInterfaceMemberDeclaration node);
	void caseAAbstractModifier(AAbstractModifier node);
	void caseAAdditiveExpShiftExp(AAdditiveExpShiftExp node);
	void caseAAndBinaryOperator(AAndBinaryOperator node);
	void caseAAndExpAndExp(AAndExpAndExp node);
	void caseAAndExpExclusiveOrExp(AAndExpExclusiveOrExp node);
	void caseAArgumentListArgumentList(AArgumentListArgumentList node);
	void caseAArrayAccessExp(AArrayAccessExp node);
	void caseAArrayAccessLeftHandSide(AArrayAccessLeftHandSide node);
	void caseAArrayAccessPrimaryNoNewArray(AArrayAccessPrimaryNoNewArray node);
	void caseAArrayCreationExpPrimary(AArrayCreationExpPrimary node);
	void caseAArrayInitializer(AArrayInitializer node);
	void caseAArrayReferenceType(AArrayReferenceType node);
	void caseAArrayVariableInitializer(AArrayVariableInitializer node);
	void caseAAssertionCompilationUnit(AAssertionCompilationUnit node);
	void caseAAssignAssignmentOperator(AAssignAssignmentOperator node);
	void caseAAssignedVariableDeclarator(AAssignedVariableDeclarator node);
	void caseAAssignment(AAssignment node);
	void caseAAssignmentAssignmentExp(AAssignmentAssignmentExp node);
	void caseAAssignmentExp(AAssignmentExp node);
	void caseAAssignmentStmtExp(AAssignmentStmtExp node);
	void caseABinaryExp(ABinaryExp node);
	void caseABitAndAssignAssignmentOperator(ABitAndAssignAssignmentOperator node);
	void caseABitAndBinaryOperator(ABitAndBinaryOperator node);
	void caseABitComplementUnaryExpNotPlusMinus(ABitComplementUnaryExpNotPlusMinus node);
	void caseABitComplementUnaryOperator(ABitComplementUnaryOperator node);
	void caseABitOrAssignAssignmentOperator(ABitOrAssignAssignmentOperator node);
	void caseABitOrBinaryOperator(ABitOrBinaryOperator node);
	void caseABitXorAssignAssignmentOperator(ABitXorAssignAssignmentOperator node);
	void caseABitXorBinaryOperator(ABitXorBinaryOperator node);
	void caseABlock(ABlock node);
	void caseABlockClassBodyDeclaration(ABlockClassBodyDeclaration node);
	void caseABlockMethodBody(ABlockMethodBody node);
	void caseABlockStmt(ABlockStmt node);
	void caseABlockStmtWithoutTrailingSubstmt(ABlockStmtWithoutTrailingSubstmt node);
	void caseABooleanLiteralLiteral(ABooleanLiteralLiteral node);
	void caseABooleanPrimitiveType(ABooleanPrimitiveType node);
	void caseABreakStmt(ABreakStmt node);
	void caseABreakStmtStmtWithoutTrailingSubstmt(ABreakStmtStmtWithoutTrailingSubstmt node);
	void caseAByteIntegralType(AByteIntegralType node);
	void caseABytePrimitiveType(ABytePrimitiveType node);
	void caseACaseSwitchLabel(ACaseSwitchLabel node);
	void caseACastExpUnaryExpNotPlusMinus(ACastExpUnaryExpNotPlusMinus node);
	void caseACatchClause(ACatchClause node);
	void caseACharacterLiteralLiteral(ACharacterLiteralLiteral node);
	void caseACharIntegralType(ACharIntegralType node);
	void caseACharPrimitiveType(ACharPrimitiveType node);
	void caseAClassBody(AClassBody node);
	void caseAClassClassBodyDeclaration(AClassClassBodyDeclaration node);
	void caseAClassDeclaration(AClassDeclaration node);
	void caseAClassDeclarationBlockedStmt(AClassDeclarationBlockedStmt node);
	void caseAClassDeclarationClassMemberDeclaration(AClassDeclarationClassMemberDeclaration node);
	void caseAClassDeclarationInterfaceMemberDeclaration(AClassDeclarationInterfaceMemberDeclaration node);
	void caseAClassInstanceCreationExpPrimaryNoNewArray(AClassInstanceCreationExpPrimaryNoNewArray node);
	void caseAClassInstanceCreationExpStmtExp(AClassInstanceCreationExpStmtExp node);
	void caseAClassMemberDeclarationClassBodyDeclaration(AClassMemberDeclarationClassBodyDeclaration node);
	void caseAClassOrInterfaceType(AClassOrInterfaceType node);
	void caseAClassOrInterfaceTypeArrayCreationExp(AClassOrInterfaceTypeArrayCreationExp node);
	void caseAClassOrInterfaceTypeExp(AClassOrInterfaceTypeExp node);
	void caseAClassOrInterfaceTypeReferenceType(AClassOrInterfaceTypeReferenceType node);
	void caseAClassType(AClassType node);
	void caseAClassTypeClassTypeList(AClassTypeClassTypeList node);
	void caseAClassTypeDeclaration(AClassTypeDeclaration node);
	void caseAClassTypeListClassTypeList(AClassTypeListClassTypeList node);
	void caseACompilationUnit(ACompilationUnit node);
	void caseAComplementUnaryExpNotPlusMinus(AComplementUnaryExpNotPlusMinus node);
	void caseAComplementUnaryOperator(AComplementUnaryOperator node);
	void caseAConditionalAndExpConditionalAndExp(AConditionalAndExpConditionalAndExp node);
	void caseAConditionalAndExpConditionalOrExp(AConditionalAndExpConditionalOrExp node);
	void caseAConditionalExpAssignmentExp(AConditionalExpAssignmentExp node);
	void caseAConditionalOrExpConditionalExp(AConditionalOrExpConditionalExp node);
	void caseAConditionalOrExpConditionalOrExp(AConditionalOrExpConditionalOrExp node);
	void caseAConstantDeclaration(AConstantDeclaration node);
	void caseAConstantDeclarationInterfaceMemberDeclaration(AConstantDeclarationInterfaceMemberDeclaration node);
	void caseAConstantExp(AConstantExp node);
	void caseAConstructorBody(AConstructorBody node);
	void caseAConstructorClassBodyDeclaration(AConstructorClassBodyDeclaration node);
	void caseAConstructorDeclaration(AConstructorDeclaration node);
	void caseAConstructorDeclarator(AConstructorDeclarator node);
	void caseAContinueStmt(AContinueStmt node);
	void caseAContinueStmtStmtWithoutTrailingSubstmt(AContinueStmtStmtWithoutTrailingSubstmt node);
	void caseADecimalIntegerLiteral(ADecimalIntegerLiteral node);
	void caseADecrementUnaryOperator(ADecrementUnaryOperator node);
	void caseADefaultSwitchLabel(ADefaultSwitchLabel node);
	void caseADim(ADim node);
	void caseADimExp(ADimExp node);
	void caseADivAssignAssignmentOperator(ADivAssignAssignmentOperator node);
	void caseADivBinaryOperator(ADivBinaryOperator node);
	void caseADivMultiplicativeExp(ADivMultiplicativeExp node);
	void caseADoStmt(ADoStmt node);
	void caseADoStmtStmtWithoutTrailingSubstmt(ADoStmtStmtWithoutTrailingSubstmt node);
	void caseADoubleFloatingPointType(ADoubleFloatingPointType node);
	void caseADoublePrimitiveType(ADoublePrimitiveType node);
	void caseAEmptyMethodBody(AEmptyMethodBody node);
	void caseAEmptyStmt(AEmptyStmt node);
	void caseAEmptyStmtStmtWithoutTrailingSubstmt(AEmptyStmtStmtWithoutTrailingSubstmt node);
	void caseAEmptyTypeDeclaration(AEmptyTypeDeclaration node);
	void caseAEqBinaryOperator(AEqBinaryOperator node);
	void caseAEqEqualityExp(AEqEqualityExp node);
	void caseAEqualityExpAndExp(AEqualityExpAndExp node);
	void caseAExclusiveOrExpExclusiveOrExp(AExclusiveOrExpExclusiveOrExp node);
	void caseAExclusiveOrExpInclusiveOrExp(AExclusiveOrExpInclusiveOrExp node);
	void caseAExpArgumentList(AExpArgumentList node);
	void caseAExpCastExp(AExpCastExp node);
	void caseAExpListForInit(AExpListForInit node);
	void caseAExpStmt(AExpStmt node);
	void caseAExpStmtStmtWithoutTrailingSubstmt(AExpStmtStmtWithoutTrailingSubstmt node);
	void caseAExpVariableInitializer(AExpVariableInitializer node);
	void caseAExtendsExtendsInterfaces(AExtendsExtendsInterfaces node);
	void caseAExtendsInterfacesExtendsInterfaces(AExtendsInterfacesExtendsInterfaces node);
	void caseAFalseBooleanLiteral(AFalseBooleanLiteral node);
	void caseAFieldAccessExp(AFieldAccessExp node);
	void caseAFieldAccessLeftHandSide(AFieldAccessLeftHandSide node);
	void caseAFieldAccessPrimaryNoNewArray(AFieldAccessPrimaryNoNewArray node);
	void caseAFieldClassBodyDeclaration(AFieldClassBodyDeclaration node);
	void caseAFieldDeclaration(AFieldDeclaration node);
	void caseAFieldDeclarationClassMemberDeclaration(AFieldDeclarationClassMemberDeclaration node);
	void caseAFinally(AFinally node);
	void caseAFinallyOneTryStmt(AFinallyOneTryStmt node);
	void caseAFinalModifier(AFinalModifier node);
	void caseAFloatFloatingPointType(AFloatFloatingPointType node);
	void caseAFloatingPointLiteralLiteral(AFloatingPointLiteralLiteral node);
	void caseAFloatingPointTypeNumericType(AFloatingPointTypeNumericType node);
	void caseAFloatPrimitiveType(AFloatPrimitiveType node);
	void caseAFormalParameter(AFormalParameter node);
	void caseAFormalParameterFormalParameterList(AFormalParameterFormalParameterList node);
	void caseAFormalParameterListFormalParameterList(AFormalParameterListFormalParameterList node);
	void caseAForStmt(AForStmt node);
	void caseAForStmtNoShortIf(AForStmtNoShortIf node);
	void caseAForStmtNoShortIfStmtNoShortIf(AForStmtNoShortIfStmtNoShortIf node);
	void caseAForStmtStmt(AForStmtStmt node);
	void caseAForUpdate(AForUpdate node);
	void caseAGtBinaryOperator(AGtBinaryOperator node);
	void caseAGteqBinaryOperator(AGteqBinaryOperator node);
	void caseAGteqRelationalExp(AGteqRelationalExp node);
	void caseAGtRelationalExp(AGtRelationalExp node);
	void caseAHexIntegerLiteral(AHexIntegerLiteral node);
	void caseAIdVariableDeclarator(AIdVariableDeclarator node);
	void caseAIfStmt(AIfStmt node);
	void caseAIfThenElseStmt(AIfThenElseStmt node);
	void caseAIfThenElseStmtNoShortIf(AIfThenElseStmtNoShortIf node);
	void caseAIfThenElseStmtNoShortIfStmtNoShortIf(AIfThenElseStmtNoShortIfStmtNoShortIf node);
	void caseAIfThenElseStmtStmt(AIfThenElseStmtStmt node);
	void caseAIfThenStmt(AIfThenStmt node);
	void caseAIfThenStmtStmt(AIfThenStmtStmt node);
	void caseAInclusiveOrExpConditionalAndExp(AInclusiveOrExpConditionalAndExp node);
	void caseAInclusiveOrExpInclusiveOrExp(AInclusiveOrExpInclusiveOrExp node);
	void caseAIncrementUnaryOperator(AIncrementUnaryOperator node);
	void caseAInitClassInterfaceArrayCreationExp(AInitClassInterfaceArrayCreationExp node);
	void caseAInitClassInterfaceExp(AInitClassInterfaceExp node);
	void caseAInitPrimitiveArrayCreationExp(AInitPrimitiveArrayCreationExp node);
	void caseAInitPrimitiveExp(AInitPrimitiveExp node);
	void caseAInstanceofExp(AInstanceofExp node);
	void caseAInstanceofRelationalExp(AInstanceofRelationalExp node);
	void caseAIntegerLiteralLiteral(AIntegerLiteralLiteral node);
	void caseAIntegralTypeNumericType(AIntegralTypeNumericType node);
	void caseAInterfaceBody(AInterfaceBody node);
	void caseAInterfaceClassBodyDeclaration(AInterfaceClassBodyDeclaration node);
	void caseAInterfaceDeclaration(AInterfaceDeclaration node);
	void caseAInterfaceDeclarationClassMemberDeclaration(AInterfaceDeclarationClassMemberDeclaration node);
	void caseAInterfaceDeclarationInterfaceMemberDeclaration(AInterfaceDeclarationInterfaceMemberDeclaration node);
	void caseAInterfaces(AInterfaces node);
	void caseAInterfaceType(AInterfaceType node);
	void caseAInterfaceTypeDeclaration(AInterfaceTypeDeclaration node);
	void caseAInterfaceTypeInterfaceTypeList(AInterfaceTypeInterfaceTypeList node);
	void caseAInterfaceTypeListInterfaceTypeList(AInterfaceTypeListInterfaceTypeList node);
	void caseAIntIntegralType(AIntIntegralType node);
	void caseAIntPrimitiveType(AIntPrimitiveType node);
	void caseALabeledStmt(ALabeledStmt node);
	void caseALabeledStmtNoShortIf(ALabeledStmtNoShortIf node);
	void caseALabeledStmtNoShortIfStmtNoShortIf(ALabeledStmtNoShortIfStmtNoShortIf node);
	void caseALabeledStmtStmt(ALabeledStmtStmt node);
	void caseALabelStmt(ALabelStmt node);
	void caseALiteralExp(ALiteralExp node);
	void caseALiteralPrimaryNoNewArray(ALiteralPrimaryNoNewArray node);
	void caseALocalVariableDeclaration(ALocalVariableDeclaration node);
	void caseALocalVariableDeclarationForInit(ALocalVariableDeclarationForInit node);
	void caseALocalVariableDeclarationInBlockedStmt(ALocalVariableDeclarationInBlockedStmt node);
	void caseALocalVariableDeclarationStmt(ALocalVariableDeclarationStmt node);
	void caseALocalVariableDeclarationStmtBlockedStmt(ALocalVariableDeclarationStmtBlockedStmt node);
	void caseALongIntegralType(ALongIntegralType node);
	void caseALongPrimitiveType(ALongPrimitiveType node);
	void caseALParPrimaryNoNewArray(ALParPrimaryNoNewArray node);
	void caseALtBinaryOperator(ALtBinaryOperator node);
	void caseALteqBinaryOperator(ALteqBinaryOperator node);
	void caseALteqRelationalExp(ALteqRelationalExp node);
	void caseALtRelationalExp(ALtRelationalExp node);
	void caseAMethodClassBodyDeclaration(AMethodClassBodyDeclaration node);
	void caseAMethodDeclaration(AMethodDeclaration node);
	void caseAMethodDeclarationClassMemberDeclaration(AMethodDeclarationClassMemberDeclaration node);
	void caseAMethodDeclarator(AMethodDeclarator node);
	void caseAMethodInvocationPrimaryNoNewArray(AMethodInvocationPrimaryNoNewArray node);
	void caseAMethodInvocationStmtExp(AMethodInvocationStmtExp node);
	void caseAMinusAdditiveExp(AMinusAdditiveExp node);
	void caseAMinusAssignAssignmentOperator(AMinusAssignAssignmentOperator node);
	void caseAMinusBinaryOperator(AMinusBinaryOperator node);
	void caseAMinusUnaryExp(AMinusUnaryExp node);
	void caseAMinusUnaryOperator(AMinusUnaryOperator node);
	void caseAModAssignAssignmentOperator(AModAssignAssignmentOperator node);
	void caseAModBinaryOperator(AModBinaryOperator node);
	void caseAModMultiplicativeExp(AModMultiplicativeExp node);
	void caseAMultiplicativeExpAdditiveExp(AMultiplicativeExpAdditiveExp node);
	void caseANameArrayAccess(ANameArrayAccess node);
	void caseANameArrayType(ANameArrayType node);
	void caseANameCastExp(ANameCastExp node);
	void caseANamedTypeExp(ANamedTypeExp node);
	void caseANameExp(ANameExp node);
	void caseANameLeftHandSide(ANameLeftHandSide node);
	void caseANameMethodInvocation(ANameMethodInvocation node);
	void caseANameMethodInvocationExp(ANameMethodInvocationExp node);
	void caseANamePostfixExp(ANamePostfixExp node);
	void caseANameReferenceType(ANameReferenceType node);
	void caseANativeModifier(ANativeModifier node);
	void caseANeqBinaryOperator(ANeqBinaryOperator node);
	void caseANeqEqualityExp(ANeqEqualityExp node);
	void caseANotPlusMinusUnaryExp(ANotPlusMinusUnaryExp node);
	void caseANullLiteral(ANullLiteral node);
	void caseANullLiteralLiteral(ANullLiteralLiteral node);
	void caseANumericTypePrimitiveType(ANumericTypePrimitiveType node);
	void caseAOctalIntegerLiteral(AOctalIntegerLiteral node);
	void caseAOldAbstractMethodDeclarationInterfaceMemberDeclaration(AOldAbstractMethodDeclarationInterfaceMemberDeclaration node);
	void caseAOldArrayInitializer(AOldArrayInitializer node);
	void caseAOldCaseSwitchLabel(AOldCaseSwitchLabel node);
	void caseAOldCompilationUnit(AOldCompilationUnit node);
	void caseAOldConstantDeclarationInterfaceMemberDeclaration(AOldConstantDeclarationInterfaceMemberDeclaration node);
	void caseAOldConstructorDeclarator(AOldConstructorDeclarator node);
	void caseAOldExp(AOldExp node);
	void caseAOldExpCastExp(AOldExpCastExp node);
	void caseAOldFieldDeclaration(AOldFieldDeclaration node);
	void caseAOldInterfaceDeclaration(AOldInterfaceDeclaration node);
	void caseAOldInterfaces(AOldInterfaces node);
	void caseAOldLocalVariableDeclaration(AOldLocalVariableDeclaration node);
	void caseAOldMethodDeclarator(AOldMethodDeclarator node);
	void caseAOldNameCastExp(AOldNameCastExp node);
	void caseAOldNamedTypePrimaryNoNewArray(AOldNamedTypePrimaryNoNewArray node);
	void caseAOldPrimaryFieldAccess(AOldPrimaryFieldAccess node);
	void caseAOldPrimaryNoNewArrayArrayAccess(AOldPrimaryNoNewArrayArrayAccess node);
	void caseAOldPrimitiveTypeCastExp(AOldPrimitiveTypeCastExp node);
	void caseAOldPrimitiveTypePrimaryNoNewArray(AOldPrimitiveTypePrimaryNoNewArray node);
	void caseAOldQualifiedClassInstanceCreationExp(AOldQualifiedClassInstanceCreationExp node);
	void caseAOldQualifiedConstructorInvocation(AOldQualifiedConstructorInvocation node);
	void caseAOldSimpleClassInstanceCreationExp(AOldSimpleClassInstanceCreationExp node);
	void caseAOldStaticInitializerClassBodyDeclaration(AOldStaticInitializerClassBodyDeclaration node);
	void caseAOldSuper(AOldSuper node);
	void caseAOldSuperConstructorInvocation(AOldSuperConstructorInvocation node);
	void caseAOldThisConstructorInvocation(AOldThisConstructorInvocation node);
	void caseAOldThrows(AOldThrows node);
	void caseAOneBreakStmt(AOneBreakStmt node);
	void caseAOneContinueStmt(AOneContinueStmt node);
	void caseAOneDoStmt(AOneDoStmt node);
	void caseAOneForStmt(AOneForStmt node);
	void caseAOneQualifiedName(AOneQualifiedName node);
	void caseAOneReturnStmt(AOneReturnStmt node);
	void caseAOneSimpleName(AOneSimpleName node);
	void caseAOneSingleTypeImportDeclaration(AOneSingleTypeImportDeclaration node);
	void caseAOneSwitchStmt(AOneSwitchStmt node);
	void caseAOneSynchronizedStmt(AOneSynchronizedStmt node);
	void caseAOneThrowStmt(AOneThrowStmt node);
	void caseAOneTypeImportOnDemandDeclaration(AOneTypeImportOnDemandDeclaration node);
	void caseAOneWhileStmt(AOneWhileStmt node);
	void caseAOrBinaryOperator(AOrBinaryOperator node);
	void caseAOriginalExpStmt(AOriginalExpStmt node);
	void caseAPackageDeclaration(APackageDeclaration node);
	void caseAParExp(AParExp node);
	void caseAPlusAdditiveExp(APlusAdditiveExp node);
	void caseAPlusAssignAssignmentOperator(APlusAssignAssignmentOperator node);
	void caseAPlusBinaryOperator(APlusBinaryOperator node);
	void caseAPlusUnaryExp(APlusUnaryExp node);
	void caseAPlusUnaryOperator(APlusUnaryOperator node);
	void caseAPostDecrementExp(APostDecrementExp node);
	void caseAPostDecrementExpPostfixExp(APostDecrementExpPostfixExp node);
	void caseAPostDecrementExpr(APostDecrementExpr node);
	void caseAPostDecrementExpStmtExp(APostDecrementExpStmtExp node);
	void caseAPostfixExpUnaryExpNotPlusMinus(APostfixExpUnaryExpNotPlusMinus node);
	void caseAPostIncrementExp(APostIncrementExp node);
	void caseAPostIncrementExpPostfixExp(APostIncrementExpPostfixExp node);
	void caseAPostIncrementExpr(APostIncrementExpr node);
	void caseAPostIncrementExpStmtExp(APostIncrementExpStmtExp node);
	void caseAPreDecrementExp(APreDecrementExp node);
	void caseAPreDecrementExpStmtExp(APreDecrementExpStmtExp node);
	void caseAPreDecrementExpUnaryExp(APreDecrementExpUnaryExp node);
	void caseAPreIncrementExp(APreIncrementExp node);
	void caseAPreIncrementExpStmtExp(APreIncrementExpStmtExp node);
	void caseAPreIncrementExpUnaryExp(APreIncrementExpUnaryExp node);
	void caseAPrimaryFieldAccess(APrimaryFieldAccess node);
	void caseAPrimaryMethodInvocation(APrimaryMethodInvocation node);
	void caseAPrimaryMethodInvocationExp(APrimaryMethodInvocationExp node);
	void caseAPrimaryNoNewArrayArrayAccess(APrimaryNoNewArrayArrayAccess node);
	void caseAPrimaryNoNewArrayPrimary(APrimaryNoNewArrayPrimary node);
	void caseAPrimaryPostfixExp(APrimaryPostfixExp node);
	void caseAPrimitiveArrayType(APrimitiveArrayType node);
	void caseAPrimitiveType(APrimitiveType node);
	void caseAPrimitiveTypeArrayCreationExp(APrimitiveTypeArrayCreationExp node);
	void caseAPrimitiveTypeArrayExp(APrimitiveTypeArrayExp node);
	void caseAPrimitiveTypeCastExp(APrimitiveTypeCastExp node);
	void caseAPrimitiveTypePrimaryExp(APrimitiveTypePrimaryExp node);
	void caseAPrivateModifier(APrivateModifier node);
	void caseAProtectedModifier(AProtectedModifier node);
	void caseAPublicModifier(APublicModifier node);
	void caseAQualifiedClassInstanceCreationExp(AQualifiedClassInstanceCreationExp node);
	void caseAQualifiedConstructorInvocation(AQualifiedConstructorInvocation node);
	void caseAQualifiedName(AQualifiedName node);
	void caseAQualifiedNameName(AQualifiedNameName node);
	void caseAQualifiedThisExp(AQualifiedThisExp node);
	void caseAQualifiedThisPrimaryNoNewArray(AQualifiedThisPrimaryNoNewArray node);
	void caseAQuestionConditionalExp(AQuestionConditionalExp node);
	void caseAQuestionExp(AQuestionExp node);
	void caseAReferenceType(AReferenceType node);
	void caseARelationalExpEqualityExp(ARelationalExpEqualityExp node);
	void caseAReturnStmt(AReturnStmt node);
	void caseAReturnStmtStmtWithoutTrailingSubstmt(AReturnStmtStmtWithoutTrailingSubstmt node);
	void caseASemicolonStmt(ASemicolonStmt node);
	void caseAShiftExpRelationalExp(AShiftExpRelationalExp node);
	void caseAShiftLeftAssignAssignmentOperator(AShiftLeftAssignAssignmentOperator node);
	void caseAShiftLeftBinaryOperator(AShiftLeftBinaryOperator node);
	void caseAShiftLeftShiftExp(AShiftLeftShiftExp node);
	void caseAShortIntegralType(AShortIntegralType node);
	void caseAShortPrimitiveType(AShortPrimitiveType node);
	void caseASignedShiftRightAssignAssignmentOperator(ASignedShiftRightAssignAssignmentOperator node);
	void caseASignedShiftRightBinaryOperator(ASignedShiftRightBinaryOperator node);
	void caseASignedShiftRightShiftExp(ASignedShiftRightShiftExp node);
	void caseASimpleClassInstanceCreationExp(ASimpleClassInstanceCreationExp node);
	void caseASimpleName(ASimpleName node);
	void caseASimpleNameName(ASimpleNameName node);
	void caseASingleTypeImportDeclaration(ASingleTypeImportDeclaration node);
	void caseASingleTypeImportDeclarationImportDeclaration(ASingleTypeImportDeclarationImportDeclaration node);
	void caseAStarAssignAssignmentOperator(AStarAssignAssignmentOperator node);
	void caseAStarBinaryOperator(AStarBinaryOperator node);
	void caseAStarMultiplicativeExp(AStarMultiplicativeExp node);
	void caseAStaticInitializer(AStaticInitializer node);
	void caseAStaticInitializerClassBodyDeclaration(AStaticInitializerClassBodyDeclaration node);
	void caseAStaticModifier(AStaticModifier node);
	void caseAStmtBlockedStmt(AStmtBlockedStmt node);
	void caseAStmtExpListForInit(AStmtExpListForInit node);
	void caseAStmtExpListStmtExpList(AStmtExpListStmtExpList node);
	void caseAStmtExpStmtExpList(AStmtExpStmtExpList node);
	void caseAStmtWithoutTrailingSubstmtStmt(AStmtWithoutTrailingSubstmtStmt node);
	void caseAStmtWithoutTrailingSubstmtStmtNoShortIf(AStmtWithoutTrailingSubstmtStmtNoShortIf node);
	void caseAStringLiteralLiteral(AStringLiteralLiteral node);
	void caseASuper(ASuper node);
	void caseASuperConstructorInvocation(ASuperConstructorInvocation node);
	void caseASuperFieldAccess(ASuperFieldAccess node);
	void caseASuperMethodInvocation(ASuperMethodInvocation node);
	void caseASuperMethodInvocationExp(ASuperMethodInvocationExp node);
	void caseASwitchBlockStmtGroup(ASwitchBlockStmtGroup node);
	void caseASwitchStmt(ASwitchStmt node);
	void caseASwitchStmtStmtWithoutTrailingSubstmt(ASwitchStmtStmtWithoutTrailingSubstmt node);
	void caseASynchronizedModifier(ASynchronizedModifier node);
	void caseASynchronizedStmt(ASynchronizedStmt node);
	void caseASynchronizedStmtStmtWithoutTrailingSubstmt(ASynchronizedStmtStmtWithoutTrailingSubstmt node);
	void caseAThisConstructorInvocation(AThisConstructorInvocation node);
	void caseAThisExp(AThisExp node);
	void caseAThisPrimaryNoNewArray(AThisPrimaryNoNewArray node);
	void caseAThrows(AThrows node);
	void caseAThrowStmt(AThrowStmt node);
	void caseAThrowStmtStmtWithoutTrailingSubstmt(AThrowStmtStmtWithoutTrailingSubstmt node);
	void caseATransientModifier(ATransientModifier node);
	void caseATrueBooleanLiteral(ATrueBooleanLiteral node);
	void caseATryFinallyStmt(ATryFinallyStmt node);
	void caseATryOneTryStmt(ATryOneTryStmt node);
	void caseATryStmt(ATryStmt node);
	void caseATryStmtStmtWithoutTrailingSubstmt(ATryStmtStmtWithoutTrailingSubstmt node);
	void caseATypedMethodHeader(ATypedMethodHeader node);
	void caseATypeImportOnDemandDeclarationImportDeclaration(ATypeImportOnDemandDeclarationImportDeclaration node);
	void caseATypeOnDemandImportDeclaration(ATypeOnDemandImportDeclaration node);
	void caseAUnaryExp(AUnaryExp node);
	void caseAUnaryExpMultiplicativeExp(AUnaryExpMultiplicativeExp node);
	void caseAUnsignedShiftRightAssignAssignmentOperator(AUnsignedShiftRightAssignAssignmentOperator node);
	void caseAUnsignedShiftRightBinaryOperator(AUnsignedShiftRightBinaryOperator node);
	void caseAUnsignedShiftRightShiftExp(AUnsignedShiftRightShiftExp node);
	void caseAVariableDeclaratorId(AVariableDeclaratorId node);
	void caseAVariableDeclaratorsVariableDeclarators(AVariableDeclaratorsVariableDeclarators node);
	void caseAVariableDeclaratorVariableDeclarators(AVariableDeclaratorVariableDeclarators node);
	void caseAVariableInitializersVariableInitializers(AVariableInitializersVariableInitializers node);
	void caseAVariableInitializerVariableInitializers(AVariableInitializerVariableInitializers node);
	void caseAVoidExp(AVoidExp node);
	void caseAVoidMethodHeader(AVoidMethodHeader node);
	void caseAVoidPrimaryNoNewArray(AVoidPrimaryNoNewArray node);
	void caseAVolatileModifier(AVolatileModifier node);
	void caseAWhileStmt(AWhileStmt node);
	void caseAWhileStmtNoShortIf(AWhileStmtNoShortIf node);
	void caseAWhileStmtNoShortIfStmtNoShortIf(AWhileStmtNoShortIfStmtNoShortIf node);
	void caseAWhileStmtStmt(AWhileStmtStmt node);
	void caseEOF(EOF node);
	void caseStart(Start node);
	void caseTAbstract(TAbstract node);
	void caseTAnd(TAnd node);
	void caseTAssign(TAssign node);
	void caseTBitAnd(TBitAnd node);
	void caseTBitAndAssign(TBitAndAssign node);
	void caseTBitComplement(TBitComplement node);
	void caseTBitOr(TBitOr node);
	void caseTBitOrAssign(TBitOrAssign node);
	void caseTBitXor(TBitXor node);
	void caseTBitXorAssign(TBitXorAssign node);
	void caseTBoolean(TBoolean node);
	void caseTBreak(TBreak node);
	void caseTByte(TByte node);
	void caseTCase(TCase node);
	void caseTCatch(TCatch node);
	void caseTChar(TChar node);
	void caseTCharacterLiteral(TCharacterLiteral node);
	void caseTClass(TClass node);
	void caseTColon(TColon node);
	void caseTComma(TComma node);
	void caseTComplement(TComplement node);
	void caseTConst(TConst node);
	void caseTContinue(TContinue node);
	void caseTDecimalIntegerLiteral(TDecimalIntegerLiteral node);
	void caseTDefault(TDefault node);
	void caseTDiv(TDiv node);
	void caseTDivAssign(TDivAssign node);
	void caseTDo(TDo node);
	void caseTDocumentationComment(TDocumentationComment node);
	void caseTDot(TDot node);
	void caseTDouble(TDouble node);
	void caseTElse(TElse node);
	void caseTEndOfLineComment(TEndOfLineComment node);
	void caseTEq(TEq node);
	void caseTExtends(TExtends node);
	void caseTFalse(TFalse node);
	void caseTFinal(TFinal node);
	void caseTFinally(TFinally node);
	void caseTFloat(TFloat node);
	void caseTFloatingPointLiteral(TFloatingPointLiteral node);
	void caseTFor(TFor node);
	void caseTGoto(TGoto node);
	void caseTGt(TGt node);
	void caseTGteq(TGteq node);
	void caseTHexIntegerLiteral(THexIntegerLiteral node);
	void caseTId(TId node);
	void caseTIf(TIf node);
	void caseTImplements(TImplements node);
	void caseTImport(TImport node);
	void caseTInstanceof(TInstanceof node);
	void caseTInt(TInt node);
	void caseTInterface(TInterface node);
	void caseTLBrace(TLBrace node);
	void caseTLBracket(TLBracket node);
	void caseTLong(TLong node);
	void caseTLPar(TLPar node);
	void caseTLt(TLt node);
	void caseTLteq(TLteq node);
	void caseTMinus(TMinus node);
	void caseTMinusAssign(TMinusAssign node);
	void caseTMinusMinus(TMinusMinus node);
	void caseTMod(TMod node);
	void caseTModAssign(TModAssign node);
	void caseTNative(TNative node);
	void caseTNeq(TNeq node);
	void caseTNew(TNew node);
	void caseTNull(TNull node);
	void caseTOctalIntegerLiteral(TOctalIntegerLiteral node);
	void caseTOr(TOr node);
	void caseTPackage(TPackage node);
	void caseTPlus(TPlus node);
	void caseTPlusAssign(TPlusAssign node);
	void caseTPlusPlus(TPlusPlus node);
	void caseTPrivate(TPrivate node);
	void caseTProtected(TProtected node);
	void caseTPublic(TPublic node);
	void caseTQuestion(TQuestion node);
	void caseTRBrace(TRBrace node);
	void caseTRBracket(TRBracket node);
	void caseTReturn(TReturn node);
	void caseTRPar(TRPar node);
	void caseTSemicolon(TSemicolon node);
	void caseTShiftLeft(TShiftLeft node);
	void caseTShiftLeftAssign(TShiftLeftAssign node);
	void caseTShort(TShort node);
	void caseTSignedShiftRight(TSignedShiftRight node);
	void caseTSignedShiftRightAssign(TSignedShiftRightAssign node);
	void caseTStar(TStar node);
	void caseTStarAssign(TStarAssign node);
	void caseTStatic(TStatic node);
	void caseTStringLiteral(TStringLiteral node);
	void caseTSuper(TSuper node);
	void caseTSwitch(TSwitch node);
	void caseTSynchronized(TSynchronized node);
	void caseTThis(TThis node);
	void caseTThrow(TThrow node);
	void caseTThrows(TThrows node);
	void caseTTraditionalComment(TTraditionalComment node);
	void caseTTransient(TTransient node);
	void caseTTrue(TTrue node);
	void caseTTry(TTry node);
	void caseTUnsignedShiftRight(TUnsignedShiftRight node);
	void caseTUnsignedShiftRightAssign(TUnsignedShiftRightAssign node);
	void caseTVoid(TVoid node);
	void caseTVolatile(TVolatile node);
	void caseTWhile(TWhile node);
	void caseTWhiteSpace(TWhiteSpace node);
	Object getIn(Node node);
	Object getOut(Node node);
	void setIn(Node node, Object in);
	void setOut(Node node, Object out);
}
