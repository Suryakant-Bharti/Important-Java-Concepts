// There are two ways to achieve abstraction in java
// Abstract class (0 to 100%) and Interface (100%)

// Since Java 8, we can have method body in interface. 
// But we need to make it default or static method.

interface Drawable{  
void draw();  
default void msg(){System.out.println("default method");}  
}  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class TestInterfaceDefault{  
public static void main(String args[]){  
Drawable d=new Rectangle();  
d.draw();  
d.msg();  
}}  
} 