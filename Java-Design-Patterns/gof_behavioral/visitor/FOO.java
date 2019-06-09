package gof_design_patterns.behavioral.visitor;

public class FOO implements Element {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getFOO() {
        return "FOO";
    }
}
