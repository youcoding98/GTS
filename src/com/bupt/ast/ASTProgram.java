/* Generated By:JJTree: Do not edit this line. ASTProgram.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=true,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.bupt.ast;


public
class ASTProgram extends SimpleNode {
  public ASTProgram(int id) {
    super(id);
  }

  public ASTProgram(Go p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(GoVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=12d617e156cb1875d1b318def9c34af0 (do not edit this line) */
