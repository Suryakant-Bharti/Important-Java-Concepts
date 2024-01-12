// Constructor in java is a special type of method that is used to initialize the object.
// A constructor that have no parameter is known as default constructor.

class Student3{  
 int id;  
 String name;  
  
 void display(){System.out.println(id+" "+name);}  
  
 public static void main(String args[]){  

  Student3 s1=new Student3();  
  Student3 s2=new Student3();  

  s1.display();  
  s2.display();  
 }  
}