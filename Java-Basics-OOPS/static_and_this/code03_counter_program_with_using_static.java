// Java static property is shared to all objects.
// It makes your program memory efficient (i.e it saves memory).
// Program of static variable  
// The static variable gets memory only once in class area at the time of class loading.
  
class Counter2{  
static int count=0;  //will get memory only once and retain its value  
  
Counter2(){  
count++;  
System.out.println(count);  
}  
  
public static void main(String args[]){  
  
Counter2 c1=new Counter2();  
Counter2 c2=new Counter2();  
Counter2 c3=new Counter2();  
  
 }  
}   