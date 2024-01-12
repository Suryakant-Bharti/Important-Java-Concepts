public class IfElseIfNestedExample {  
public static void main(String[] args) {  
    int age = 29;
 
if (age < 13)
{
  System.out.println("You are but a wee child!");
}
else if (age < 19)
{
  System.out.println("You are no longer a child, but a budding teenager.");
}
else
{
  if (age < 65)
  {
    System.out.println("You are an adult!");
  }
  else
  {
    System.out.println("You are now a senior, enjoy the good life friends!");
  }
  System.out.println("Also, since you are over the age of 19, you deserve a drink!");
}  
}  
}  