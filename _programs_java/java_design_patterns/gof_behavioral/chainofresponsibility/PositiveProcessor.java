package java_design_patterns.gof_behavioral.chainofresponsibility;

public class PositiveProcessor implements Chain {

    Chain nextInChain;

    @Override
    public void setNext(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void process(Number request) {
        if(request.getNumber() > 0)
            System.out.println("PositiveProcessor : " + request.getNumber());
        else
            nextInChain.process(request);
    }
}
