class Simple{  
public static void main(String[] args){  
byte a=10;  
byte b=10;  
//byte c=a+b;//Compile Time Error: because a+b=20 will be int  
byte c=(byte)(a+b);  
System.out.println(c);  
}}  