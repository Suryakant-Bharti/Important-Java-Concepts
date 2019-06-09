package gof_design_patterns.creational.prototype;

public class PrototypeDemo {

    public static void main(String args[])
    {
        Car c1 = new Car("Honda", "Civic");
        Car c2 = (Car) c1.getClone();

        c1.showMessage();
        c2.showMessage();
    }

}
