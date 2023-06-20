package example.oop.inferfaces;

public class Avanza implements Car{

  public void drive() {
    System.out.println("Avanza is drive");
  }

  public int getTier() {
    return 4;
  }

  public String getBrand() {
    return "Toyota";
  }

  public boolean isMaintenance() {
    return false;
  }
}
