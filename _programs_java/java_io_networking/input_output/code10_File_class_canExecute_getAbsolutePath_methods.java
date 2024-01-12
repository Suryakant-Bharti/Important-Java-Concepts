package com.pak;
import java.io.File;

public class FileDemo {
   
   public static void main(String[] args) {
      File f = null;
      String[] strs = {"test1.txt", "test2.txt"};
      try {
         // for each string in string array 
         for(String s:strs ) {
            // create new file
            f = new File(s);
            
            // true if the file is executable
            boolean bool = f.canExecute();
            
            // find the absolute path
            String a = f.getAbsolutePath(); 
            
            // prints absolute path
            System.out.print(a);
            
            // prints
            System.out.println(" is executable: "+ bool);
         } 
      } catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
      }
   }
}