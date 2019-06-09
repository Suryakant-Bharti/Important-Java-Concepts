package gof_design_patterns.behavioral.strategy;

public class UpiStrategy implements MoneyTransferStrategy {

    String upiId;

    public UpiStrategy(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void transfer(int amount) {
        System.out.println("\nMoney transferred successfully through UPI.\nDetails:");
        System.out.println("Amount: " + amount + "\nRecipient UPI ID: " + upiId);
    }
}
