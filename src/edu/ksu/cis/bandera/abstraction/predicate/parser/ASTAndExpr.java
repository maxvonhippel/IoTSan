package edu.ksu.cis.bandera.abstraction.predicate.parser;

/* Generated By:JJTree: Do not edit this line. ASTAndExpr.java */
public class ASTAndExpr extends ASTBinOpExpr {
  public ASTAndExpr(int id) {
	super(id);
  }  
  public ASTAndExpr(PredicateParser p, int id) {
	super(p, id);
  }  
  /** Accept the visitor. **/
  public Object jjtAccept(PredicateParserVisitor visitor, Object data) {
	return visitor.visit(this, data);
  }  
  public static Node jjtCreate(int id) {
	  return new ASTAndExpr(id);
  }  
  public static Node jjtCreate(PredicateParser p, int id) {
	  return new ASTAndExpr(p, id);
  }  
}
