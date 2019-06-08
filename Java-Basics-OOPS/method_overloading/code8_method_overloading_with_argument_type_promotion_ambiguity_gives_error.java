// Method overloading increases the readability of the program.

// THis Program gives COMPILE TIME ERROR

class OverloadingCalculation3{  
  void sum(int a,long b){System.out.println("a method invoked");}  
  void sum(long a,int b){System.out.println("b method invoked");}  
  
  public static void main(String args[]){  
  OverloadingCalculation3 obj=new OverloadingCalculation3();  
  obj.sum(20,20);  //now ambiguity    //  COMPILE TIME ERROR
  }  
} 