package gof_design_patterns.behavioral.mediator;

public class MediatorDemo {

    public static void main(String[] args) {

        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
        robert.sendMessage("How are you?");
        john.sendMessage("I am fine.");
    }
}
