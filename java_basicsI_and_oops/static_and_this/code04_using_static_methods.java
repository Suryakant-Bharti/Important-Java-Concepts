// Program of static method 
// A static method belongs to the class rather than object of a class.
// A static method can be invoked without the need for creating an instance of a class.
// static method can access static data member and can change the value of it. 

//Program of changing the common property of all objects(static field).  
  
class Student9{  
     int rollno;  
     String name;  
     static String college = "ITS";  
       
     static void change(){  
     college = "BBDIT";  
     }  
  
     Student9(int r, String n){  
     rollno = r;  
     name = n;  
     }  
  
     void display (){System.out.println(rollno+" "+name+" "+college);}  
  
    public static void main(String args[]){  
    Student9.change();  
  
    Student9 s1 = new Student9 (111,"Karan");  
    Student9 s2 = new Student9 (222,"Aryan");  
    Student9 s3 = new Student9 (333,"Sonoo");  
  
    s1.display();  
    s2.display();  
    s3.display();  
    }  
}  