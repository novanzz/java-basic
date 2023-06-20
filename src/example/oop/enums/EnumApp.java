package example.oop.enums;

public class EnumApp {
  public static void main(String[] args) {

    var customer = new Customer();
    customer.setName("Novan");
    customer.setLevel(Level.PREMIUM);

    System.out.println(customer.getName());
    System.out.println(customer.getLevel());
    System.out.println(customer.getLevel().getDescription());
    System.out.println(customer.getLevel().getNote());

    String levelName = Level.VIP.name();
    System.out.println(levelName);

    Level level = Level.valueOf("PREMIUM");
    System.out.println(level);

    System.out.println("Print Level");
    for (var value : Level.values()) {
      System.out.println(value);
    }


  }
}
