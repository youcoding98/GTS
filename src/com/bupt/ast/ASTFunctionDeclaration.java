/* Generated By:JJTree: Do not edit this line. ASTFunctionDeclaration.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.bupt.ast;


public
class ASTFunctionDeclaration extends SimpleNode {
  public ASTFunctionDeclaration(int id) {
    super(id);
  }

  public ASTFunctionDeclaration(Go p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(GoVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=b88b2489af23aea4306a707f7bdd3ce4 (do not edit this line) */
