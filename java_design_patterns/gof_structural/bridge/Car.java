package java_design_patterns.gof_structural.bridge;

public class Car extends Vehicle {

    public Car(Workshop workShop1, Workshop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.print("Car ");
        workShop1.work();
        System.out.print("Car ");
        workShop2.work();
    }
}
