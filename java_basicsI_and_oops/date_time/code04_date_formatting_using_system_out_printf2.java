import java.util.Date;
public class DateDemo {

   public static void main(String args[]) {
      // Instantiate a Date object
      Date date = new Date();
  
      // display time and date
      System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
   }
}