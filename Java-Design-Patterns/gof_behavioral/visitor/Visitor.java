package gof_design_patterns.behavioral.visitor;

public interface Visitor {
    void visit(FOO foo);
    void visit(BAR bar);
    void visit(BAZ baz);
}
