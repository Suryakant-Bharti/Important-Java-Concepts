package java_design_patterns.gof_creational.abstractfactory;

public class EducationLoan extends Loan {

    @Override
    void setInterestRate(double rate){
        this.rate = rate;
    }
}
