package example.oop.abstracts;

public class Cat extends Animal {

    Cat(String gender){
        super(gender);
    }

    public void run() {
        System.out.println("Cat " + name + " is run" + " gender is " + gender);
    }

}