// This relationship between two objects is known as the association in OOPS software design 
// and depicted by an arrow in UML.

// Composition is when one class owns other class 
// and the other class can not meaningfully exist, when it's owner destroyed

// Since heart, brain, hands , etc are part of Human, the relationship between them is Composition.

public class Human {
    //final will make sure body part are initialized
    private final Heart myHeart;  
    private final Brain myBrain;  
    private final Hands myHands;  
       
    public Human(){
       myHeart  = new Heart();
       myBrain  = new Brain();
       myHands  = new Hands();
    }
}

class Heart {
    private String attributes;
}

class Brain {
    private String attributes;
}

class Hands {
    private String attributes;
}