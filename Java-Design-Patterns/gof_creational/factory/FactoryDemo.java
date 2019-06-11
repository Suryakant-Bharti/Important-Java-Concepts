package Java-Design-Patterns.gof_creational.factory;

public class FactoryDemo {
    public static void main(String args[])
    {
        GetPlanFactory factory = new GetPlanFactory();

        Plan plan = factory.getPlan("INSTITUTIONAL");
        plan.setRate();

        int units = 25;
        double bill = plan.calculateBill(units);
        System.out.println(bill);
    }
}
