package java_design_patterns.gof_behavioral.strategy;

public class StrategyDemo {
    public static void main(String args[]) {

        MoneyTransferContext context = new MoneyTransferContext();

        context.setStrategy(new UpiStrategy("surya@sbi"));
        context.transfer(6000);

        context.setStrategy(new NeftStrategy("110199920004", "SBIN012404"));
        context.transfer(8000);
    }
}