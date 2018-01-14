import java.io.*;  
class DePersist{  
 public static void main(String args[])throws Exception{  
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
  Student s=(Student)in.readObject();  
  System.out.println(s.id+" "+s.name+" "+s.age);  
  in.close();  
 }  
}    

/*  SAVE THIS CLASS as Student.java

import java.io.Serializable;  
public class Student implements Serializable{  
 int id;  
 String name;  
 transient int age;  //Now it will not be serialized  
 public Student(int id, String name,int age) {  
  this.id = id;  
  this.name = name;  
  this.age=age;  
 }  
}  