public class GenericsTester {
   public static void main(String[] args) {
      Box<Integer> box = new Box<Integer>();
      
      box.set(Integer.valueOf(10));
      System.out.printf("Integer Value :%d\n", box.getData());
      
      
      Box rawBox = new Box();
      
      //No warning
      rawBox = box;
      System.out.printf("Integer Value :%d\n", rawBox.getData());
      
      //Warning for unchecked invocation to set(T)
      rawBox.set(Integer.valueOf(10));
      System.out.printf("Integer Value :%d\n", rawBox.getData());
      
      //Warning for unchecked conversion
      box = rawBox;
      System.out.printf("Integer Value :%d\n", box.getData());
   }
}

class Box<T> {
   private T t; 

   public void set(T t) {
      this.t = t;
   }

   public T getData() {
      return t;
   } 
}