package java_design_patterns.gof_behavioral.chainofresponsibility;

interface Chain {
    void setNext(Chain nextInChain);
    void process(Number request);
}