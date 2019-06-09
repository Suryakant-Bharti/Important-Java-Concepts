package gof_design_patterns.creational.abstractfactory;

public class FactoryCreator {
    AbstractFactory getFactory(String factoryName)
    {
        if (factoryName == null)
            return null;

        else if(factoryName.equalsIgnoreCase("LoanFactory"))
            return new LoanFactory();

        else if(factoryName.equalsIgnoreCase("BankFactory"))
            return new BankFactory();

        else
            return null;
    }
}
