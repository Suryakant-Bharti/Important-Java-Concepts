package java_design_patterns.gof_behavioral.visitor;

public interface Element {
    void accept(Visitor v);
}
