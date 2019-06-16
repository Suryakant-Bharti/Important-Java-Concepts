//Initializing object simply means storing data into object.
class Student{  
 int id;  
 String name;  
}  
class TestStudent3{  
 public static void main(String args[]){  
  
  //Creating objects  
  Student s1=new Student();  
  Student s2=new Student();  
  
  //Initializing objects  
  s1.id=101;  
  s1.name="Sonoo";  
  s2.id=102;  
  s2.name="Amit";  
  
  //Printing data  
  System.out.println(s1.id+" "+s1.name);  
  System.out.println(s2.id+" "+s2.name);  
 }  
}  