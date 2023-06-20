package example.oop.polymorphism;

public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Novan");
        employee.sayHello("Ramadhan");

        employee = new Manager("Ramadhan");
        employee.sayHello("Novan");

        sayHello(new Employee("Rania"));
        sayHello(new Manager("Rania"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
