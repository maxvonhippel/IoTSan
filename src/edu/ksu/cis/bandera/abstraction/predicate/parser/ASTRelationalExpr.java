package edu.ksu.cis.bandera.abstraction.predicate.parser;

/* Generated By:JJTree: Do not edit this line. ASTRelationalExpr.java */
public class ASTRelationalExpr extends SimpleNode {
  // Added attribute begin
  private SimpleNode n1, n2;
  // Added code end

  public ASTRelationalExpr(int id) {
	super(id);
  }  
  public ASTRelationalExpr(PredicateParser p, int id) {
	super(p, id);
  }  
  public SimpleNode getOp1() { return n1; }  
  public SimpleNode getOp2() { return n2; }  
  /** Accept the visitor. **/
  public Object jjtAccept(PredicateParserVisitor visitor, Object data) {
	return visitor.visit(this, data);
  }  
  public static Node jjtCreate(int id) {
	  return new ASTRelationalExpr(id);
  }  
  public static Node jjtCreate(PredicateParser p, int id) {
	  return new ASTRelationalExpr(p, id);
  }  
  // Added attribute end

  // Added code begin
  public void setOp1(SimpleNode node1) { n1 = node1; }  
  public void setOp2(SimpleNode node2) { n2 = node2; }  
}
