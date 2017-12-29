// This relationship between two objects is known as the association in OOPS software design 
// and depicted by an arrow in UML.

// Aggregation is when one class is associated with other class 
// but both can exist independently

// Since School Has Students and Teachers, the relationship between them is Association.

// Java program to illustrate
//the concept of Aggregation.
import java.io.*;
import java.util.*;
 
// student class
class Student 
{
    String name;
    int id ;
    String dept;
     
    Student(String name, int id, String dept) 
    {
         
        this.name = name;
        this.id = id;
        this.dept = dept;
         
    }
}
 
import java.io.*;

// Engine class which will 
// be used by car. so 'Car'
// class will have a field 
// of Engine type.
class Engine 
{
	// starting an engine.
	public void work()
	{	
		System.out.println("Engine of car has been started ");	
	}
	
}

// Engine class
public class Car 
{
	
	// For a car to move, 
	// it need to have a engine.
	private final Engine engine; 

	
	Car()
	{
	 		this.engine = new Engine(); //Composition
	}
	
	// car start moving by starting engine
	public void move() 
	{
		
		if(engine != null)
		{
			engine.work();
			System.out.println("Car is moving ");
		}
	}
}

class GFG 
{
	public static void main (String[] args) 
	{	
		Car car = new Car();
		car.move();	
	}
}