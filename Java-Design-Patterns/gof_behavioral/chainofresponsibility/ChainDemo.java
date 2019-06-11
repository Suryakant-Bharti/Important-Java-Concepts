package Java-Design-Patterns.gof_behavioral.chainofresponsibility;

public class ChainDemo {

    public static void main(String[] args) {

        //Configure Chain of Responsibility
        Chain c1 = new NegativeProcessor();
        Chain c2 = new Java.ZeroProcessor();
        Chain c3 = new Java.PositiveProcessor();

        c1.setNext(c2);
        c2.setNext(c3);

        //Calling Chain of Responsibility
        c1.process(new Number(40));
        c1.process(new Number(-10));
        c1.process(new Number(0));
        c1.process(new Number(32));

    }
}