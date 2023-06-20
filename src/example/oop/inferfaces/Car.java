package example.oop.inferfaces;

public interface Car extends HasBrand, IsMaintenance {

  void drive();

  int getTier();

  default boolean isSUV() {
    return false;
  }

}