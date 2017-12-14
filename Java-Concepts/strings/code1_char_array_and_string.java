public class StringDemo {

   public static void main(String args[]) {
      char[] helloArray = { 'H', 'e', 'l', 'l', 'o', '.' };
      String helloString = new String(helloArray);  
      String helloString2 = new String("Hello, I am String2.");  
      System.out.println( helloString );
      System.out.println( helloString2 );
   }
}