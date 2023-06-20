package example.oop.inheritance;

class Manager extends Employee {

    String company;

    Manager(String name) {
        super(name);
    }

    Manager(String name, String company) {
        super(name);
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", Iam Manager, My Name Is " + this.name);
    }

    void sayHi() {
        System.out.println("Hi, Iam Manager, My Name Is " + this.name);
    }

    void myCompany() {
        System.out.println("Im Manager and My Company Is " + this.company);
    }
}
