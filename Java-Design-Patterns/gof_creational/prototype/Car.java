package gof_design_patterns.creational.prototype;

public class Car implements Prototype {

    private String company;
    private String model;

    public Car(String company, String model) {
        this.company = company;
        this.model = model;
    }

    public void showMessage()
    {
        System.out.println("CAR: " + company + " " + model);
    }

    @Override
    public Prototype getClone() {
        return new Car(company, model);
    }
}
