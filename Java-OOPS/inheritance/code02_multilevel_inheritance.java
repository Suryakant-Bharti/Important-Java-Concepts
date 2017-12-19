class Animal{  
void eat(){System.out.println("eating...");}  
}  

class Dog extends Animal{  
void bark(){System.out.println("barking...");}  
}  

class BabyDog extends Dog{  
void weep(){System.out.println("weeping...");}  
} 
 
class TestInheritance2{  
public static void main(String args[]){  
BabyDog d=new BabyDog();  
d.weep();  
d.bark();  
d.eat();  
}}  