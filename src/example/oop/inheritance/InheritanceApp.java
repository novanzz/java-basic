package example.oop.inheritance;

public class InheritanceApp {
    public static void main(String[] args) {
        var employee = new Employee("Ramadhan");
        employee.sayHello("Novan");

        var manager = new Manager("Novan");
        manager.sayHello("Ramadhan");
        manager.sayHi();

        manager.company = "Mastersystem";
        manager.myCompany();

    }
}
