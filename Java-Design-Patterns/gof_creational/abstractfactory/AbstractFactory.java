package gof_design_patterns.creational.abstractfactory;

public abstract class AbstractFactory {
    abstract Bank getBank(String bankName);
    abstract Loan getLoan(String laonName);
}
