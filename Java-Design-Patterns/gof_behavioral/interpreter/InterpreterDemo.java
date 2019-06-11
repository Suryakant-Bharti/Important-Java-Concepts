package Java-Design-Patterns.gof_behavioral.interpreter;

public class InterpreterDemo {
    public static void main(String[] args)
    {
        Expression person1 = new TerminalExpression("Rahul");
        Expression person2 = new TerminalExpression("Alok");
        Expression isSingle = new OrExpression(person1, person2);

        Expression vikram = new TerminalExpression("Sunny");
        Expression committed = new TerminalExpression("Committed");
        Expression isCommitted = new AndExpression(vikram, committed);

        System.out.println(isSingle.interpreter("Rahul"));
        System.out.println(isSingle.interpreter("Alok"));
        System.out.println(isSingle.interpreter("Mohit"));

        System.out.println(isCommitted.interpreter("Committed, Sunny"));
        System.out.println(isCommitted.interpreter("Single, Sunny"));

    }
}
