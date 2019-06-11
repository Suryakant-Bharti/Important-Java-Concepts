package Java-Design-Patterns.gof_behavioral.visitor;

public interface Visitor {
    void visit(FOO foo);
    void visit(BAR bar);
    void visit(BAZ baz);
}
