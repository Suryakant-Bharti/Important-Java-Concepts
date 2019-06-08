// This porgram gives COMPILE TIME ERROR

class A{  
void msg(){System.out.println("Hello");}  
}  

class B{  
void msg(){System.out.println("Welcome");}  
}  

class C extends A,B{  //suppose if it were possible  
   
 Public Static void main(String args[]){  
   C obj=new C();  
   obj.msg();  //Now which msg() method would be invoked?  
}  
}