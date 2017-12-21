class Bike9{  
 final int speedlimit=90;//final variable  
 
 void run(){  
  speedlimit=400;  
 }  

 public static void main(String args[]){  
 Bike9 obj=new  Bike9();  
 obj.run();  // ERROR : COMPILE TIME ERROR
 }  
}//end of class  