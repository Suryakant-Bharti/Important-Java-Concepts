// Encapsulation in java is a process of wrapping code and data together into a single unit
// By providing only setter or getter method, you can make the class read-only or write-only.

// ------------------- FILE 1 --------------------

//save as Student.java  
package com.javatpoint;  
public class Student{  
private String name;  
   
public String getName(){  
return name;  
}  
public void setName(String name){  
this.name=name  
}  
}  

// ------------------- FILE 2 --------------------

//save as Test.java  
package com.javatpoint;  
class Test{  
public static void main(String[] args){  
Student s=new Student();  
s.setName("vijay");  
System.out.println(s.getName());  
}  
}  