// When reference variable of Parent class refers to 
// the object of Child class, it is known as upcasting.

class Bike{  
  void run(){System.out.println("running");}  
}  
class Yamaha extends Bike{  
  void run(){System.out.println("running safely with 60km");}  
  
  public static void main(String args[]){  
    Bike b = new Yamaha();   //upcasting  
    b.run();  
  }  
}  