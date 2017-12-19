// Java static property is shared to all objects.
// It makes your program memory efficient (i.e it saves memory).
// Program of static variable  
// The static variable gets memory only once in class area at the time of class loading.
  
class Student8{  
   int rollno;  
   String name;  
   static String college ="ITS";  
     
   Student8(int r,String n){  
   rollno = r;  
   name = n;  
   }  
 void display (){System.out.println(rollno+" "+name+" "+college);}  
  
 public static void main(String args[]){  
 Student8 s1 = new Student8(111,"Karan");  
 Student8 s2 = new Student8(222,"Aryan");  
   
 s1.display();  
 s2.display();  
 }  
}  