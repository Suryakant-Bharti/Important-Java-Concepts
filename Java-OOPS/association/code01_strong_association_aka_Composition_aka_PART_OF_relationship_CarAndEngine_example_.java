// This relationship between two objects is known as the association in OOPS software design 
// and depicted by an arrow in UML.

// Composition is when one class owns other class 
// and the other class can not meaningfully exist, when it's owner destroyed

// Since Engine is-part-of Car, the relationship between them is Composition.

public class Car {
    //final will make sure engine is initialized
    private final Engine engine;  
       
    public Car(){
       engine  = new Engine();
    }
}

class Engine {
    private String type;
}