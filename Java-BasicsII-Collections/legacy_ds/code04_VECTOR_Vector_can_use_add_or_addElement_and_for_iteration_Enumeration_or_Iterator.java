import java.util.*;    
class TestVector1{    
 public static void main(String args[]){    
  
  Vector<String> v=new Vector<String>();//creating vector
  v.add("umesh");  //method of Collection
  v.addElement("irfan");  //method of Vector
  v.addElement("kumar");

  System.out.println("USING ENUMERATION TO ITERATE:");
  Enumeration e=v.elements();
  while(e.hasMoreElements()){
   System.out.println(e.nextElement());
  }

  System.out.println("USING ITERATOR TO ITERATE:");
  Iterator itr=v.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next()); 
  } 
 }    
}    