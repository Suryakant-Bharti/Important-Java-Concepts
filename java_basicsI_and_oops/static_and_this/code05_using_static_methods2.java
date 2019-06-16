// Program of static method 
// A static method belongs to the class rather than object of a class.
// A static method can be invoked without the need for creating an instance of a class.
// static method can access static data member and can change the value of it. 
  
//Program to get cube of a given number by static method  
  
class Calculate{  
  static int cube(int x){  
  return x*x*x;  
  }  
  
  public static void main(String args[]){  
  int result=Calculate.cube(5);  
  System.out.println(result);  
  }  
}  