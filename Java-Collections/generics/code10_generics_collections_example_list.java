import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsTester {
   public static void main(String[] args) {

      List<Integer> integerList = new ArrayList<Integer>();
  
      integerList.add(Integer.valueOf(10));
      integerList.add(Integer.valueOf(11));

      List<String> stringList = new ArrayList<String>();
  
      stringList.add("Hello World");
      stringList.add("Hi World");
 

      System.out.printf("Integer Value :%d\n", integerList.get(0));
      System.out.printf("String Value :%s\n", stringList.get(0));

      for(Integer data: integerList) {
         System.out.printf("Integer Value :%d\n", data);
      }

      Iterator<String> stringIterator = stringList.iterator();

      while(stringIterator.hasNext()) {
         System.out.printf("String Value :%s\n", stringIterator.next());
      }
   }  
}