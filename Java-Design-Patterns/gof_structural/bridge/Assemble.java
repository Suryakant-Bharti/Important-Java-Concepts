package Java-Design-Patterns.gof_structural.bridge;

public class Assemble implements Workshop {
    @Override
    public void work() {
        System.out.println("Assembled.");
    }
}
