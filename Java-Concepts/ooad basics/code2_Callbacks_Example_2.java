package pkg1;
 
/**
* The main class, JavaApp1.java, to implement the interface NewInterface - callback() method. 
* It will create and call NewClass object. 
* Then, the NewClass object will callback it's callback() method in turn.
 */
public class JavaApp1 implements NewInterface{
     
    NewClass newClass;
 
    public static void main(String[] args) {
         
        System.out.println("test...");
         
        JavaApp1 myApp = new JavaApp1();
        myApp.doSomething();
 
    }
     
    private void doSomething(){
        newClass = new NewClass(this);
        newClass.calledFromMain();
    }
 
    @Override
    public void callback() {
        System.out.println("callback");
    }
 
}

// ---------- MAKE BELOW CLASSES IN DIFFERNET FILES ---------------

// Define the interface, NewInterface.java.

package pkg1;
 
public interface NewInterface {
    void callback();
}


// Create a new class, NewClass.java. It will call the callback method in main class.

package pkg1;
 
public class NewClass {
     
    private NewInterface mainClass;
     
    public NewClass(NewInterface mClass){
        mainClass = mClass;
    }
     
    public void calledFromMain(){
        //Do somthing...
         
        //call back main
        mainClass.callback();
    }
}

