package Java-Design-Patterns.gof_structural.flyweight;

public class Circle implements Shape{

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle: [Color : " + color + "," +
                " x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
