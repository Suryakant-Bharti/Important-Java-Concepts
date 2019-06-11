package Java-Design-Patterns.gof_behavioral.chainofresponsibility;

public class NegativeProcessor implements Chain {

    Chain nextInChain;

    @Override
    public void setNext(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void process(Number request) {
        if(request.getNumber() < 0)
            System.out.println("NegativeProcessor : " + request.getNumber());
        else
            nextInChain.process(request);
    }
}
