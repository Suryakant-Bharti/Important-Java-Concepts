package java_design_patterns.gof_creational.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        SingletonObjectEarly s1 = SingletonObjectEarly.getInstance();
        s1.showMessage();
    }
}
