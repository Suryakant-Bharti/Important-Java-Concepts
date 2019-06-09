package gof_design_patterns.behavioral.visitor;

public class BAR implements Element {
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getBAR() {
        return "BAR";
    }
}
