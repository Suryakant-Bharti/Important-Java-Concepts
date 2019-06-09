package gof_design_patterns.creational.builder;

public class Person {

    private int age;
    private String firstname;
    private String middlename;
    private String lastname;
    private String fathername;
    private String mothername;

    public Person(int age, String firstname, String middlename, String lastname, String fathername, String mothername) {
        this.age = age;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.fathername = fathername;
        this.mothername = mothername;
    }

    public static class Builder {
        private int age;
        private String firstname;
        private String middlename;
        private String lastname;
        private String fathername;
        private String mothername;

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder setMiddlename(String middlename) {
            this.middlename = middlename;
            return this;
        }

        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setFathername(String fathername) {
            this.fathername = fathername;
            return this;
        }

        public Builder setMothername(String mothername) {
            this.mothername = mothername;
            return this;
        }

        Person build()
        {
            return new Person(this.age, this.firstname, this.middlename, this.lastname, this.fathername, this.mothername);
        }
    }

    public void showMessage()
    {
        System.out.println("Values: " + this.age + this.firstname + this.middlename + this.lastname + this.fathername + this.mothername);
    }
}
