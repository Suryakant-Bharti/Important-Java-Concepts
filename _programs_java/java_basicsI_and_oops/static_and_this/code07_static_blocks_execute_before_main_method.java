// Program of static block
// Is used to initialize the static data member.
// It is executed before main method at the time of classloading.
  
class A2{  
  
  static{System.out.println("static block is invoked");}  // This will execute first
  
  public static void main(String args[]){  
   System.out.println("Hello main");  
  }  
}     