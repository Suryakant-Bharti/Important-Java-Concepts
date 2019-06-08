// Runtime polymorphism or Dynamic Method Dispatch is a process in which 
// a call to an overridden method is resolved at runtime rather than compile-time.
// In this process, an overridden method is called through the reference variable of a superclass. 
// The determination of the method to be called is based on the object being referred to by the reference variable.

class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void eat(){System.out.println("eating bread...");}  
}  
class Cat extends Animal{  
void eat(){System.out.println("eating fish...");}  
}  
class Lion extends Animal{  
void eat(){System.out.println("eating meat...");}  
}  
class TestPolymorphism3{  
public static void main(String[] args){  
Animal a;  
a=new Dog();  
a.eat();  
a=new Cat();  
a.eat();  
a=new Lion();  
a.eat();  
}}  