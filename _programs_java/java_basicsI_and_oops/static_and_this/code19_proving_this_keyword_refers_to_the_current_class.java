// Program of this keyword: 
// Let's prove that this keyword refers to the current class instance variable. 
// In this program, we are printing the reference variable and this, output of both variables are same.

class A5{  
void m(){  
System.out.println(this);  //prints same reference ID  
}  

public static void main(String args[]){  
A5 obj=new A5();  
System.out.println(obj);  //prints the reference ID  
obj.m();  
}  
}