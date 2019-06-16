package java_design_patterns.gof_behavioral.visitor;

public class BAZ implements Element {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getBAZ() {
        return "BAZ";
    }
}
