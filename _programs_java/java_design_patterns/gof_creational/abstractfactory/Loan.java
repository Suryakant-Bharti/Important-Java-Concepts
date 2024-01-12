package java_design_patterns.gof_creational.abstractfactory;

public abstract class Loan {
    double rate;

    abstract void setInterestRate(double rate);

    double calculateLoanPayment(double loanAmount, int tenure)
    {
        //Replace with real formula [not our concern now]
        double loanPayment = loanAmount*tenure*rate;

        return loanPayment;
    }
}
