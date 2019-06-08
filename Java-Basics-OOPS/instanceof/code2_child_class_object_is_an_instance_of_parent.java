// instanceof operator is used to test whether the object is an 
// instance of the specified type (class or subclass or interface).
// The instanceof in java is also known as type comparison operator
// because it compares the instance with type.

class Animal{}  
class Dog1 extends Animal{//Dog inherits Animal  
  
 public static void main(String args[]){  
 Dog1 d=new Dog1();  
 System.out.println(d instanceof Animal);//true  
 }  
}  