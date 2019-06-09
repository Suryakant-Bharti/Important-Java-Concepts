package gof_design_patterns.creational.builder;

public class BuilderPatternDemo {
    public static void main(String args[])
    {
        Person p = new Person.Builder()
                .setAge(7)
                .setFathername("Sharmaji")
                .setFirstname("Rahul")
                .setAge(19)
                .build();

        p.showMessage();
    }
}
