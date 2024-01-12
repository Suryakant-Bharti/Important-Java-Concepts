package java_design_patterns.gof_structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();

        Shape s1 = new RedShapeDecorator(new Circle());
        Shape s2 = new RedShapeDecorator(new Rectangle());

        System.out.println("\n---------------");
        c1.draw();
        System.out.println("\n---------------");
        r1.draw();
        System.out.println("\n---------------");
        s1.draw();
        System.out.println("\n---------------");
        s2.draw();
    }
}
