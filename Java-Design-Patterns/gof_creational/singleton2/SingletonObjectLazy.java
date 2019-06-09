package gof_design_patterns.creational.singleton2;

public class SingletonObjectLazy {

    //LATE INITIALIZATION SINGLETON
    //Can be final or volatile, both will serve the purpose
    private static volatile SingletonObjectLazy instance;

    private static final Object LOCK = new Object();

    private SingletonObjectLazy(){}

    public static SingletonObjectLazy getInstance()
    {
        if(instance == null)
        {
            synchronized (LOCK) //better use SingletonObjectLazy.class
            {
                if(instance == null)
                {
                    instance = new SingletonObjectLazy();
                }
            }
        }
        return instance;
    }

    public void showMessage()
    {
        System.out.println("MESSAGE");
    }
}
