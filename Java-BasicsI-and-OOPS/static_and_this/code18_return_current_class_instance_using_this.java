// Program of this keyword: 
// We can return this keyword as an statement from the method. 
// In such case, return type of the method must be the class type (non-primitive).

class A{  
A getA(){  
return this;  
}  
void msg(){System.out.println("Hello java");}  
}  

class Test1{  
public static void main(String args[]){  
new A().getA().msg();  
}  
}  