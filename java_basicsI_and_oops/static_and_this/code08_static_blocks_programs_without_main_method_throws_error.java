// Program of static block
// Is used to initialize the static data member.
// It is executed before main method at the time of classloading.

// It was possible to execute programs without the main method (before JDK7) as shown below
// But it is not allowed since JDK7 and throws ERROR
  
class A3{  
  static{  
  System.out.println("static block is invoked");  // ERROR : Main methos not found
  System.exit(0);  
  }  
}  