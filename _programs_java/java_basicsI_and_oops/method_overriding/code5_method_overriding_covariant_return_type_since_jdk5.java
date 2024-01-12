// It is possible to override method by changing the return type if subclass overrides any method
// whose return type is Non-Primitive but it changes its return type to subclass type.

// Both methods have different return type but it is method overriding. 
// This is known as covariant return type.

class A{  
A get(){return this;}  
}  
  
class B1 extends A{  
B1 get(){return this;}  
void message(){System.out.println("welcome to covariant return type");}  
  
public static void main(String args[]){  
new B1().get().message();  
}  
}  