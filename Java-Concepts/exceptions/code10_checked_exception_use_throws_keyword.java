// Exception Handling is mainly used to handle the checked exceptions. 
// If there occurs any unchecked exception such as NullPointerException, 
// it is programmers fault that he is not performing check up before the code being used.

//  Checked exceptions can be propagated by throws keyword

import java.io.IOException;  
class Testthrows1{  
  void m()throws IOException{  
    throw new IOException("device error");//checked exception  
  }  
  void n()throws IOException{  
    m();  
  }  
  void p(){  
   try{  
    n();  
   }catch(Exception e){System.out.println("exception handled");}  
  }  
  public static void main(String args[]){  
   Testthrows1 obj=new Testthrows1();  
   obj.p();  
   System.out.println("normal flow...");  
  }  
}  