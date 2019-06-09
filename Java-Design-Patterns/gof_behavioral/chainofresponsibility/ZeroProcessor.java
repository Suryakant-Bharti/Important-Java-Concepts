package gof_design_patterns.behavioral.chainofresponsibility;

public class ZeroProcessor implements Chain {

    Chain nextInChain;

    @Override
    public void setNext(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void process(Number request) {
        if(request.getNumber() == 0)
            System.out.println("ZeroProcessor : " + request.getNumber());
        else
            nextInChain.process(request);
    }
}
