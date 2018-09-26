package edu.ksu.cis.bandera.dspin;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Bandera, a Java(TM) analysis and transformation toolkit           *
 * Copyright (C) 1998, 1999   James Corbett (corbett@hawaii.edu)     *
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
import java.io.*;
import java.util.*;
import edu.ksu.cis.bandera.bir.Collection;

import edu.ksu.cis.bandera.bir.*;
import edu.ksu.cis.bandera.spin.*;

/**
 * TypeSwitch to initialize a variable of a BIR type in PROMELA.
 */

public class DSpinTypeInit extends AbstractTypeSwitch {

	DSpinTrans spinTrans;
	PrintWriter out;

	public DSpinTypeInit(DSpinTrans spinTrans, PrintWriter out) {
	this.spinTrans = spinTrans;
	this.out = out;
	}
	public void caseArray(Array type, Object o)
	{
	String name = varName(o);
	int size = type.getSize().getValue();
	spinTrans.println(name + ".length = " + size + ";");
	for (int i = 0; i < size; i++) 
	    type.getBaseType().apply(this, name + ".element[" + i + "]");
	}
	public void caseBool(Bool type, Object o) 
	{
	simpleInit(type, o);
	}
	public void caseCollection(Collection type, Object o)
	{
	// Initialization handled on allocation
	}
	public void caseEnumerated(Enumerated type, Object o) 
	{
	simpleInit(type, o);
	}
	public void caseField(Field type, Object o)
	{
	type.getType().apply(this, varName(o) + "." + type.getName());
	}
	public void caseLock(Lock type, Object o)
	{	
	String name = varName(o);
	spinTrans.println(name + ".lock!LOCK;");
	// We'll trust SPIN to set vars to 0 initially
	// spinTrans.println(name + ".owner = 0;");
	// if (type.isWaiting())
	//    spinTrans.println(name + ".waiting = 0;");
	// if (type.isReentrant())
	//    spinTrans.println(name + ".count = 0;");
	}
	public void caseRange(Range type, Object o) 
	{
	simpleInit(type, o);
	}
	public void caseRecord(Record type, Object o)
	{
	// o should be StateVar (we're not called from a collection)
	int refIndex = spinTrans.refIndex((StateVar)o);
	spinTrans.println(varName(o) + ".refIndex = " + refIndex + ";");
	Vector fields = type.getFields();
	for (int i = 0; i < fields.size(); i++) 
	    ((Field)fields.elementAt(i)).apply(this, o);
	}
	public void caseRef(Ref type, Object o)
	{
	String name = varName(o);
	// Refs in dSPIN automatically initialized to null
	// spinTrans.println(name + " = null;");
	}
	public void defaultCase(Object obj) {
	throw new RuntimeException("Construct not handled: " + obj);
	}
	Expr initValue(Type type, Object context) {
	return (context instanceof String) ?
	    type.defaultVal() : ((StateVar)context).getInitVal();
	}
	void simpleInit(Type type, Object o) 
	{
	initValue(type,o).apply(spinTrans);
	CaseNode value = (CaseNode)spinTrans.getResult();
	ExprNode leaf = (ExprNode) value.getCase(DSpinTrans.normal);
	if (! leaf.expr1.equals("0"))
	    spinTrans.println(varName(o) + " = " + leaf.expr1 + ";");
	}
	String varName(Object context) {
	return (context instanceof String) ? 
	    (String) context : ((StateVar)context).getName();
	}
}
