package Java-Design-Patterns.gof_behavioral.strategy;

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
