// Autogenerated AST node
package org.python.pydev.parser.jython.ast;

import org.python.pydev.parser.jython.SimpleNode;
import java.util.Arrays;

public final class For extends stmtType {
    public exprType target;
    public exprType iter;
    public stmtType[] body;
    public suiteType orelse;

    public For(exprType target, exprType iter, stmtType[] body, suiteType orelse) {
        this.target = target;
        this.iter = iter;
        this.body = body;
        this.orelse = orelse;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((target == null) ? 0 : target.hashCode());
        result = prime * result + ((iter == null) ? 0 : iter.hashCode());
        result = prime * result + Arrays.hashCode(body);
        result = prime * result + ((orelse == null) ? 0 : orelse.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        For other = (For) obj;
        if (target == null) {
            if (other.target != null)
                return false;
        } else if (!target.equals(other.target))
            return false;
        if (iter == null) {
            if (other.iter != null)
                return false;
        } else if (!iter.equals(other.iter))
            return false;
        if (!Arrays.equals(body, other.body))
            return false;
        if (orelse == null) {
            if (other.orelse != null)
                return false;
        } else if (!orelse.equals(other.orelse))
            return false;
        return true;
    }

    @Override
    public For createCopy() {
        return createCopy(true);
    }

    @Override
    public For createCopy(boolean copyComments) {
        stmtType[] new0;
        if (this.body != null) {
            new0 = new stmtType[this.body.length];
            for (int i = 0; i < this.body.length; i++) {
                new0[i] = (stmtType) (this.body[i] != null ? this.body[i].createCopy(copyComments) : null);
            }
        } else {
            new0 = this.body;
        }
        For temp = new For(target != null ? (exprType) target.createCopy(copyComments) : null,
                iter != null ? (exprType) iter.createCopy(copyComments) : null, new0,
                orelse != null ? (suiteType) orelse.createCopy(copyComments) : null);
        temp.beginLine = this.beginLine;
        temp.beginColumn = this.beginColumn;
        if (this.specialsBefore != null && copyComments) {
            for (Object o : this.specialsBefore) {
                if (o instanceof commentType) {
                    commentType commentType = (commentType) o;
                    temp.getSpecialsBefore().add(commentType.createCopy(copyComments));
                }
            }
        }
        if (this.specialsAfter != null && copyComments) {
            for (Object o : this.specialsAfter) {
                if (o instanceof commentType) {
                    commentType commentType = (commentType) o;
                    temp.getSpecialsAfter().add(commentType.createCopy(copyComments));
                }
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("For[");
        sb.append("target=");
        sb.append(dumpThis(this.target));
        sb.append(", ");
        sb.append("iter=");
        sb.append(dumpThis(this.iter));
        sb.append(", ");
        sb.append("body=");
        sb.append(dumpThis(this.body));
        sb.append(", ");
        sb.append("orelse=");
        sb.append(dumpThis(this.orelse));
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitFor(this);
    }

    @Override
    public void traverse(VisitorIF visitor) throws Exception {
        if (target != null) {
            target.accept(visitor);
        }
        if (iter != null) {
            iter.accept(visitor);
        }
        if (body != null) {
            for (int i = 0; i < body.length; i++) {
                if (body[i] != null) {
                    body[i].accept(visitor);
                }
            }
        }
        if (orelse != null) {
            orelse.accept(visitor);
        }
    }

}
