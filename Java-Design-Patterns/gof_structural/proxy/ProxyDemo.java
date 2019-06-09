package gof_design_patterns.structural.proxy;

public class ProxyDemo {

    public static void main(String[] args) {

        Image image = new ProxyImage("test_10MB.jpg");

        //Image will be loaded from disk
        image.display();

        //image will not be loaded from disk
        image.display();
    }
}