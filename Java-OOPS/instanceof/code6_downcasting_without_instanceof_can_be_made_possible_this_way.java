// When Subclass type refers to the object of Parent class, it is known as downcasting. 

// If we perform it directly, compiler gives Compilation error. 
// Eg - Dog d=new Animal();  //Compilation error 

// If you perform it by typecasting, ClassCastException is thrown at runtime.
// Dog d=(Dog)new Animal();  //Compiles but ClassCastException is thrown at runtime 

class Animal { }  
class Dog4 extends Animal {  
  static void method(Animal a) {  
       Dog4 d=(Dog4)a;//downcasting  
       System.out.println("ok downcasting performed");  
  }  
   public static void main (String [] args) {  
    Animal a=new Dog4();  
    Dog4.method(a);  
  }  
}  