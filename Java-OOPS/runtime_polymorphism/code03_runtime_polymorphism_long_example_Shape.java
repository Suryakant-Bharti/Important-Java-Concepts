// Runtime polymorphism or Dynamic Method Dispatch is a process in which 
// a call to an overridden method is resolved at runtime rather than compile-time.
// In this process, an overridden method is called through the reference variable of a superclass. 
// The determination of the method to be called is based on the object being referred to by the reference variable.

class Shape{  
void draw(){System.out.println("drawing...");}  
}  
class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle...");}  
}  
class Circle extends Shape{  
void draw(){System.out.println("drawing circle...");}  
}  
class Triangle extends Shape{  
void draw(){System.out.println("drawing triangle...");}  
}  
class TestPolymorphism2{  
public static void main(String args[]){  
Shape s;  
s=new Rectangle();  
s.draw();  
s=new Circle();  
s.draw();  
s=new Triangle();  
s.draw();  
}  
}  