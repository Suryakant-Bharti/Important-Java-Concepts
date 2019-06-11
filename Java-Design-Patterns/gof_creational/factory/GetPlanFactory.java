package Java-Design-Patterns.gof_creational.factory;

public class GetPlanFactory {
    public Plan getPlan(String planName)
    {
        if(planName==null)
            return null;

        else if(planName.equalsIgnoreCase("COMMERCIAL"))
            return new CommercialPlan();

        else if(planName.equalsIgnoreCase("INSTITUTIONAL"))
            return new CommercialPlan();

        else if(planName.equalsIgnoreCase("DOMESTIC"))
            return new CommercialPlan();

        else return null;
    }
}
