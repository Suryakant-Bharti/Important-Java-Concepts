package gof_design_patterns.creational.factory;

public class DomesticPlan extends Plan {

    @Override
    protected void setRate() {
        rate = 7.5;
    }
}
