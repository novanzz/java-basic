package example.oop.inheritance;

class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", Iam Employee, My Name Is " + this.name);
    }
}

