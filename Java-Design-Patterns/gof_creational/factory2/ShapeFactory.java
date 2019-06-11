package Java-Design-Patterns.gof_creational.factory2;

public class ShapeFactory {
    Shape getShape(String shapeName)
    {
        if (shapeName == null)
            return null;
        else if(shapeName.equalsIgnoreCase("SQUARE"))
            return new Square();
        else if(shapeName.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else if(shapeName.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else
            return null;
    }
}
