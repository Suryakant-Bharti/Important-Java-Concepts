package Java-Design-Patterns.gof_creational.abstractfactory;

public abstract class AbstractFactory {
    abstract Bank getBank(String bankName);
    abstract Loan getLoan(String laonName);
}
