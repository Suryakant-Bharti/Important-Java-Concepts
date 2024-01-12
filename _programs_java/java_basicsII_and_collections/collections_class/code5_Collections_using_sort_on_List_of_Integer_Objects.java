import java.util.*;  
class TestSort2{  
public static void main(String args[]){  
  
ArrayList al=new ArrayList();  
al.add(Integer.valueOf(201));  
al.add(Integer.valueOf(101));  
al.add(230);  //internally will be converted into objects as Integer.valueOf(230)  
  
Collections.sort(al);  
  
Iterator itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
 }  
}  
} 