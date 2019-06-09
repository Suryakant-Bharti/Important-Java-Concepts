package gof_design_patterns.creational.abstractfactory;

public class BankFactory extends AbstractFactory {
    @Override
    Bank getBank(String bankName) {
        if(bankName == null)
            return null;

        else if(bankName.equalsIgnoreCase("HDFC"))
            return new HDFC();

        else if(bankName.equalsIgnoreCase("SBI"))
            return new SBI();

        else if(bankName.equalsIgnoreCase("ICICI"))
            return new ICICI();

        else return null;
    }

    @Override
    Loan getLoan(String loanName) {
        return null;
    }
}
