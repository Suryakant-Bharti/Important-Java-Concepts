package gof_design_patterns.creational.factory;

public class CommercialPlan extends Plan {

    @Override
    protected void setRate() {
        rate = 2.5;
    }
}
