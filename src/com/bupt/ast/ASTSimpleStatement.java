/* Generated By:JJTree: Do not edit this line. ASTSimpleStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.bupt.ast;


public
class ASTSimpleStatement extends SimpleNode {
  public ASTSimpleStatement(int id) {
    super(id);
  }

  public ASTSimpleStatement(Go p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(GoVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=dc7179e8c465e24b66b176405b9a1eff (do not edit this line) */
