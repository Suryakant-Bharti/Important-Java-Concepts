package java_design_patterns.gof_structural.bridge;

public class Produce implements Workshop {
    @Override
    public void work() {
        System.out.println("Produced.");
    }
}
