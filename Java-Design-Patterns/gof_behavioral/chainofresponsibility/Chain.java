package Java-Design-Patterns.gof_behavioral.chainofresponsibility;

interface Chain {
    void setNext(Chain nextInChain);
    void process(Number request);
}