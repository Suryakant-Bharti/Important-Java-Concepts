package gof_design_patterns.behavioral.chainofresponsibility;

interface Chain {
    void setNext(Chain nextInChain);
    void process(Number request);
}