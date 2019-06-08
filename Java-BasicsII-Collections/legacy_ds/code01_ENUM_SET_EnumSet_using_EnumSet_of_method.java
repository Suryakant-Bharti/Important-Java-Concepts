import java.util.*;  

enum days {  
  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
}

public class EnumSetExample {  
  public static void main(String[] args) {  
    
    Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);  
    
    // Traversing elements  
    Iterator<days> iter = set.iterator();  
    while (iter.hasNext())  
      System.out.println(iter.next());  
  }  
}  