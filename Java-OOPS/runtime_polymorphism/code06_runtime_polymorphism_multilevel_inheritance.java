// Runtime polymorphism or Dynamic Method Dispatch is a process in which 
// a call to an overridden method is resolved at runtime rather than compile-time.
// In this process, an overridden method is called through the reference variable of a superclass. 
// The determination of the method to be called is based on the object being referred to by the reference variable.

class Animal{  
void eat(){System.out.println("eating");}  
}  
class Dog extends Animal{  
void eat(){System.out.println("eating bread");}  
}  
class BabyDog extends Dog{  
void eat(){System.out.println("drinking milk");}  
public static void main(String args[]){  
Animal a1,a2,a3;  
a1=new Animal();  
a2=new Dog();  
a3=new BabyDog();  
a1.eat();  
a2.eat();  
a3.eat();  
}  
}  