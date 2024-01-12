// Connecting a method call to the method body is known as binding.
// There are two types of binding :
// 1. static/early/compile-time binding (method overloading, happens in same class)
// 2. dynamic/late/run-time binding (method overriding, happens in different class)

dynamic binding (also known as late binding).

class Animal{}  
class Dog extends Animal{  
 public static void main(String args[]){  
  int i = 5;            // variable Type is int
  Animal a;             // Reference Type is Anumal
  a = new Dog();        // Object Type is Dog
 }  
}  
