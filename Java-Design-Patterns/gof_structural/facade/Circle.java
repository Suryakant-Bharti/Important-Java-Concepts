package Java-Design-Patterns.gof_structural.facade;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
