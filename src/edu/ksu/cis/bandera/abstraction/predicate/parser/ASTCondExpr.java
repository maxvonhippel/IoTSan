package edu.ksu.cis.bandera.abstraction.predicate.parser;

/* Generated By:JJTree: Do not edit this line. ASTCondExpr.java */
public class ASTCondExpr extends SimpleNode {
  // Added attribute begin
  private SimpleNode testExpr, thenExpr, elseExpr;
  // Added code end

  public ASTCondExpr(int id) {
	super(id);
  }  
  public ASTCondExpr(PredicateParser p, int id) {
	super(p, id);
  }  
  public SimpleNode getElseExpr() { return elseExpr; }  
  public SimpleNode getTestExpr() { return testExpr; }  
  public SimpleNode getThenExpr() { return thenExpr; }  
  /** Accept the visitor. **/
  public Object jjtAccept(PredicateParserVisitor visitor, Object data) {
	return visitor.visit(this, data);
  }  
  public static Node jjtCreate(int id) {
	  return new ASTCondExpr(id);
  }  
  public static Node jjtCreate(PredicateParser p, int id) {
	  return new ASTCondExpr(p, id);
  }  
  public void setElseExpr(SimpleNode e) { elseExpr = e; }  
  // Added attribute end

  // Added code begin
  public void setTestExpr(SimpleNode t) { testExpr = t; }  
  public void setThenExpr(SimpleNode e) { thenExpr = e; }  
}
