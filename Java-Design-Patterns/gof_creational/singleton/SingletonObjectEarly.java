package Java-Design-Patterns.gof_creational.singleton;

public class SingletonObjectEarly {

    //EARLY INITIALIZATION SINGLETON
    static private final SingletonObjectEarly instance = new SingletonObjectEarly();

    private SingletonObjectEarly(){}

    static public SingletonObjectEarly getInstance()
    {
        return instance;
    }

    public void showMessage()
    {
        System.out.println("MESSAGE");
    }
}
