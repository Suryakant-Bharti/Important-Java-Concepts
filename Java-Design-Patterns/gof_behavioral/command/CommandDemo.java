package gof_design_patterns.behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {

        Stock stock1 = new Stock("Google", 10);

        BuyStock buyStock = new BuyStock(stock1);
        SellStock sellStock = new SellStock(stock1);

        Broker broker = new Broker();

        broker.addOrder(buyStock);
        broker.addOrder(buyStock);
        broker.addOrder(sellStock);

        broker.placeOrders();

    }
}
