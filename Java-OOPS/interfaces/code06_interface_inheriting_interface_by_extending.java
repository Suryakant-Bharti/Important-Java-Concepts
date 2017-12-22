// There are two ways to achieve abstraction in java
// Abstract class (0 to 100%) and Interface (100%)

// Inheriting multiple interfaces with same methods has no ambiguity problem
// unlike inheriting multiple classes. 
// That is why multiple inheritance is not allowed in Java through classes

interface Printable{  
void print();  
}  
interface Showable extends Printable{  
void show();  
}  
class TestInterface4 implements Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome");}  
  
public static void main(String args[]){  
TestInterface4 obj = new TestInterface4();  
obj.print();  
obj.show();  
 }  
} 