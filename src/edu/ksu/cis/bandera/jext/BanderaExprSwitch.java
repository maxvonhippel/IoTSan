package edu.ksu.cis.bandera.jext;

/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Bandera, a Java(TM) analysis and transformation toolkit           *
 * Copyright (C) 1998, 1999   Shawn Laubach (laubach@acm.org)        *
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
import ca.mcgill.sable.soot.jimple.*;

public interface BanderaExprSwitch extends ExprSwitch 
{
  public void caseChooseExpr(ChooseExpr v);  
    public void caseExternalChooseExpr(ExternalChooseExpr v);
/**
 * 
 * @param expr edu.ksu.cis.bandera.jext.ComplementExpr
 */
void caseComplementExpr(ComplementExpr expr);
/**
 * This method was created in VisualAge.
 * @param v edu.ksu.cis.bandera.jext.InExpr
 */
void caseInExpr(InExpr v);
/**
 * 
 * @param v edu.ksu.cis.bandera.jext.LocalExpr
 */
void caseLocalExpr(LocalExpr v);
/**
 * 
 * @param e edu.ksu.cis.bandera.jext.LocationTestExpr
 */
void caseLocationTestExpr(LocationTestExpr e);
/**
 * 
 * @param expr edu.ksu.cis.bandera.jext.LogicalAndExpr
 */
public void caseLogicalAndExpr(LogicalAndExpr expr);
/**
 * 
 * @param expr edu.ksu.cis.bandera.jext.LogicalOrExpr
 */
void caseLogicalOrExpr(LogicalOrExpr expr);
/**
 * 
 * @param exp edu.ksu.cis.bandera.jext.ThreadExpr
 */
void caseThreadExpr(ThreadExpr exp);
}
