package java_design_patterns.gof_creational.factory;

public class DomesticPlan extends Plan {

    @Override
    protected void setRate() {
        rate = 7.5;
    }
}
