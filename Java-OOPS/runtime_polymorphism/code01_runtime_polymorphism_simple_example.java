// Runtime polymorphism or Dynamic Method Dispatch is a process in which 
// a call to an overridden method is resolved at runtime rather than compile-time.
// In this process, an overridden method is called through the reference variable of a superclass. 
// The determination of the method to be called is based on the object being referred to by the reference variable.

class Bike{  
  void run(){System.out.println("running");}  
}  
class Splender extends Bike{  
  void run(){System.out.println("running safely with 60km");}  
  
  public static void main(String args[]){  
    Bike b = new Splender();//upcasting  
    b.run();  
  }  
}  