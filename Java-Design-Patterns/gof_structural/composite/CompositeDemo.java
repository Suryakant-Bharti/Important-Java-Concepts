package Java-Design-Patterns.gof_structural.composite;

public class CompositeDemo {

    public static void main(String[] args) {

        Employee CEO = new Employee("Bob", "CEO", 100000);

        Employee headDev = new Employee("John", "Head of Development", 80000);
        Employee headMarketing = new Employee("Sarah", "Head of Sales & Marketing", 70000);

        Employee sde1 = new Employee("Laura","Backend Developer", 50000);
        Employee sde2 = new Employee("Rob","FrontEnd Developer", 48000);

        Employee sales1 = new Employee("Maria","Sales Executive", 42000);
        Employee sales2 = new Employee("Harry","Marketing Executive", 40000);
        Employee sales3 = new Employee("Serena","Social Media Executive", 36000);

        CEO.add(headDev);
        CEO.add(headMarketing);

        headDev.add(sde1);
        headDev.add(sde2);

        headMarketing.add(sales1);
        headMarketing.add(sales2);
        headMarketing.add(sales3);

        //print all employees of the organization
        System.out.println(CEO);

        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);

            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
