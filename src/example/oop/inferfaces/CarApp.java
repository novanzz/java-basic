package example.oop.inferfaces;

public class CarApp {
  public static void main(String[] args) {

    var avanza = new Avanza();
    System.out.println(avanza.getBrand());
    System.out.println(avanza.getTier());
    System.out.println(avanza.isMaintenance());
    avanza.drive();

  }
}
