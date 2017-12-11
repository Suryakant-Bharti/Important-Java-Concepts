import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

   public static void main( String args[] ) {
      // String to be scanned to find the pattern.
      String line = "This order was placed for QT3000! OK?";
      String pattern = "(.*)(\\d+)(.*)";

      // Create a Pattern object
      Pattern r = Pattern.compile(pattern);

      // Now create matcher object.
      Matcher m = r.matcher(line);
      
      int groupCount = m.groupCount();
      
      System.out.println("Group Count = " + groupCount );
      
      if (m.find( )) {
         System.out.println("Found value: " + m.group(0) );
         System.out.println("Found value: " + m.group(1) );
         System.out.println("Found value: " + m.group(2) );
         System.out.println("Found value: " + m.group(3) );
      }else {
         System.out.println("NO MATCH");
      }
   }
}