/* Generated By:JJTree: Do not edit this line. ASTFunctionBody.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.bupt.ast;


public
class ASTFunctionBody extends SimpleNode {
  public ASTFunctionBody(int id) {
    super(id);
  }

  public ASTFunctionBody(Go p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(GoVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=ddf0746a8cb50fe091b0ad086eeaacdc (do not edit this line) */
