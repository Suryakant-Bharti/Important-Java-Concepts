package Java-Design-Patterns.gof_behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {

        Java.Stock stock1 = new Java.Stock("Google", 10);

        Java.BuyStock buyStock = new Java.BuyStock(stock1);
        Java.SellStock sellStock = new Java.SellStock(stock1);

        Broker broker = new Broker();

        broker.addOrder(buyStock);
        broker.addOrder(buyStock);
        broker.addOrder(sellStock);

        broker.placeOrders();

    }
}
