// Java static property is shared to all objects.
// It makes your program memory efficient (i.e it saves memory).
// Program of without static variable  
  
class Counter{  
int count=0;  //will get memory when instance is created  
  
Counter(){  
count++;  
System.out.println(count);  
}  
  
public static void main(String args[]){  
  
Counter c1=new Counter();  
Counter c2=new Counter();  
Counter c3=new Counter();  
  
 }  
}   