package example.oop.abstracts;

public abstract class Animal {

    public String name;

    public  String gender;

    Animal(String gender) {
        this.gender = gender;
    }

//    example of abastract methods
    public abstract void run();
}