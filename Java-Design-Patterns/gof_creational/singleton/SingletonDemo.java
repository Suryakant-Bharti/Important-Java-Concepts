package gof_design_patterns.creational.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        SingletonObjectEarly s1 = SingletonObjectEarly.getInstance();
        s1.showMessage();
    }
}
