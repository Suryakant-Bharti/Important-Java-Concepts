package Java-Design-Patterns.gof_creational.factory;

public abstract class Plan {

    double rate;

    protected abstract void setRate();

    public double calculateBill(int units)
    {
        return rate*units;
    }
}

