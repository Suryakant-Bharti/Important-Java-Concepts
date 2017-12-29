// This relationship between two objects is known as the association in OOPS software design 
// and depicted by an arrow in UML.

// Aggregation is when one class is associated with other class 
// but both can exist independently

// Since Car Has-A Driver, the relationship between them is Association.

public class Car {
    private Driver driver;
}

class Driver {
    private String attributes;
}