// A class cannot be private or protected except nested class.

// ------------------- FILE 1 --------------------

//save by A.java  
package pack;  
public class A{  
protected void msg(){System.out.println("Hello");}  
}   

// ------------------- FILE 2 --------------------

//save by B.java  
package mypack;  
import pack.*;  
  
class B extends A{  
  public static void main(String args[]){  
   B obj = new B();  
   obj.msg();  
  }  
}  