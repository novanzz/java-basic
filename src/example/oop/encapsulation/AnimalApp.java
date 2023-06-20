package example.oop.encapsulation;

public class AnimalApp {
    public static void main(String[] args) {
        var animal = new Animal();
        animal.setName("Moza");
        animal.setPrice(1000);
        animal.setRare(true);

        System.out.println(animal.getName());
        System.out.println(animal.getPrice());
        System.out.println(animal.isRare());
    }
}
