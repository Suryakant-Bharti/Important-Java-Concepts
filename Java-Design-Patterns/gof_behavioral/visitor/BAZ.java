package gof_design_patterns.behavioral.visitor;

public class BAZ implements Element {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getBAZ() {
        return "BAZ";
    }
}
