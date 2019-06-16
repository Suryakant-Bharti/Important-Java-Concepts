package java_design_patterns.gof_creational.abstractfactory;

public class LoanFactory extends AbstractFactory {
    @Override
    Bank getBank(String bankName) {
        return null;
    }

    @Override
    Loan getLoan(String loanName) {
        if(loanName == null)
            return null;

        else if(loanName.equalsIgnoreCase("HomeLoan"))
            return new HomeLoan();

        else if(loanName.equalsIgnoreCase("BusinessLoan"))
            return new BusinessLoan();

        else if(loanName.equalsIgnoreCase("EducationLoan"))
            return new EducationLoan();

        else return null;
    }
}
