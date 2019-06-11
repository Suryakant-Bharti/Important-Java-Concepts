package Java-Design-Patterns.gof_creational.abstractfactory;

public class AbstractFactoryDemo {

    public static void main (String args []) {

        FactoryCreator factoryCreator = new FactoryCreator();

        AbstractFactory bankFactory = factoryCreator.getFactory("BankFactory");
        AbstractFactory loanFactory = factoryCreator.getFactory("LoanFactory");

        Bank bank = bankFactory.getBank("SBI");
        Loan loan = loanFactory.getLoan("HomeLoan");

        loan.setInterestRate(5);
        double loanPayment = loan.calculateLoanPayment(1000,5);

        System.out.println(loanPayment);
    }

}
