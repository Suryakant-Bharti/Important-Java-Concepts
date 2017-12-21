// Connecting a method call to the method body is known as binding.
// There are two types of binding :
// 1. static/early/compile-time binding (method overloading, happens in same class)
// 2. dynamic/late/run-time binding (method overriding, happens in different class)

class Animal{  
 void eat(){System.out.println("animal is eating...");}  
}  
  
class Dog extends Animal{  
 void eat(){System.out.println("dog is eating...");}  
  
 public static void main(String args[]){  
  Animal a=new Dog();  
  a.eat();  
 }  
}  