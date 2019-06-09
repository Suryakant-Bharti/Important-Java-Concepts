// Program of this keyword: 
// We can pass the this keyword in the constructor also. 
// It is useful if we have to use one object in multiple classes.

class B{  
  A4 obj;  
  B(A4 obj){  
    this.obj=obj;  
  }  
  void display(){  
    System.out.println(obj.data);//using data member of A4 class  
  }  
}  
  
class A4{  
  int data=10;  
  A4(){  
   B b=new B(this);  
   b.display();  
  }
    
  public static void main(String args[]){  
   A4 a=new A4();  
  }  
}