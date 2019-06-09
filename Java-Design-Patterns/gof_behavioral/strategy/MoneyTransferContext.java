package gof_design_patterns.behavioral.strategy;

public class MoneyTransferContext {

    MoneyTransferStrategy strategy;

    public void setStrategy(MoneyTransferStrategy strategy) {
        this.strategy = strategy;
    }

    public void transfer(int amount){
        strategy.transfer(amount);
    }
}
