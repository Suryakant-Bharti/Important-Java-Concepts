// We can create multiple objects by one type only as we do in case of primitives.

class Rectangle{  
 int length;  
 int width;  
 void insert(int l,int w){  
  length=l;  
  width=w;  
 }  
 void calculateArea(){System.out.println(length*width);}  
}  

class TestRectangle2{  
 public static void main(String args[]){  
  Rectangle r1=new Rectangle(),r2=new Rectangle(); //creating two objects  
  r1.insert(11,5);  
  r2.insert(3,15);  
  r1.calculateArea();  
  r2.calculateArea();  
}  
}  