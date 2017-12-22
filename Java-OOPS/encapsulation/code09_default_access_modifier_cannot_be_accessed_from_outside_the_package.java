// A class cannot be private or protected except nested class.

// ------------------- FILE 1 --------------------

//save by A.java  
package pack;  
class A{  
  void msg(){System.out.println("Hello");}  
}  

// ------------------- FILE 2 --------------------

//save by B.java  
package mypack;  
import pack.*;  
class B{  
  public static void main(String args[]){  
   A obj = new A();//Compile Time Error  
   obj.msg();//Compile Time Error  
  }  
}  