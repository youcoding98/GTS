/* Generated By:JJTree: Do not edit this line. ASTCase.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.bupt.ast;


public
class ASTCase extends SimpleNode {
  public ASTCase(int id) {
    super(id);
  }

  public ASTCase(Go p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(GoVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=8af8007c698489c3fea3cd6efaff0f1a (do not edit this line) */
