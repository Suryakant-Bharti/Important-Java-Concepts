package gof_design_patterns.creational.singleton2;

public class SingletonLazyDemo {

    public static void main(String[] args)
    {
        SingletonObjectLazy s1 = SingletonObjectLazy.getInstance();
        s1.showMessage();
    }
}
