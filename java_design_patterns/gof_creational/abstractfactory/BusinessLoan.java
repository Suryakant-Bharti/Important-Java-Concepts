package java_design_patterns.gof_creational.abstractfactory;

public class BusinessLoan extends Loan {

    @Override
    void setInterestRate(double rate){
        this.rate = rate;
    }
}
