package edu.ksu.cis.bandera.jjjc.symboltable;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Bandera, a Java(TM) analysis and transformation toolkit           *
 * Copyright (C) 1999, 2000   Robby (robby@cis.ksu.edu)              *
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
import edu.ksu.cis.bandera.jjjc.exception.*;

public abstract class Type implements Named, Typed {
	protected Name name;
/**
 * 
 * @return boolean
 * @param otherType java.lang.Object
 */
public boolean equals(Object otherType) {
	if (otherType instanceof Type)
		return isValidIdentityConversion((Type) otherType);
	else
		return false;
}
/**
 * 
 * @return java.lang.String
 */
public abstract String getFullyQualifiedName();
/**
 * 
 * @return edu.ksu.cis.bandera.jjjc.symboltable.Type
 */
public Type getType() {
	return this;
}
/**
 * 
 * @return boolean
 * @param otherType edu.ksu.cis.bandera.jjjc.symboltable.Type
 */
public boolean isValidCastingConversion(Type otherType) {
	return isValidIdentityConversion(otherType) ||	isValidWideningConversion(otherType)
			|| isValidNarrowingConversion(otherType);
}
/**
 * 
 * @return boolean
 * @param otherType edu.ksu.cis.bandera.jjjc.symboltable.Type
 */
public boolean isValidIdentityConversion(Type otherType) {
	return this.getFullyQualifiedName().trim().equals(otherType.getFullyQualifiedName().trim());
}
/**
 * 
 * @return boolean
 * @param otherType edu.ksu.cis.bandera.jjjc.symboltable.Type
 */
public boolean isValidMethodInvocationConversion(Type otherType) {
	return isValidIdentityConversion(otherType) || isValidWideningConversion(otherType);
}
/**
 * 
 * @return boolean
 * @param otherType edu.ksu.cis.bandera.jjjc.symboltable.Type
 */
public abstract boolean isValidNarrowingConversion(Type otherType);
/**
 * 
 * @return boolean
 * @param otherType edu.ksu.cis.bandera.jjjc.symboltable.Type
 */
public abstract boolean isValidWideningConversion(Type otherType);
/**
 * 
 * @return java.lang.String
 */
public String toString() {
	return getFullyQualifiedName();
}
}
