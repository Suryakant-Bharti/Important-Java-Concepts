package gof_design_patterns.behavioral.strategy;

public class NeftStrategy implements MoneyTransferStrategy {

    String accountNumber;
    String ifscCode;

    public NeftStrategy(String accountNumber, String ifscCode) {
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
    }

    @Override
    public void transfer(int amount) {
        System.out.println("\nMoney transferred successfully through NEFT.\nDetails:");
        System.out.println("Amount: " + amount + "\nRecipient AccountNumber: " + accountNumber + "\nIFSC: " + ifscCode);
    }
}
