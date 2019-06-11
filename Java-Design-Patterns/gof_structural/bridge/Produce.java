package Java-Design-Patterns.gof_structural.bridge;

public class Produce implements Workshop {
    @Override
    public void work() {
        System.out.println("Produced.");
    }
}
