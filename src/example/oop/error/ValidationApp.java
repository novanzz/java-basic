package example.oop.error;

public class ValidationApp {

  public static void main(String[] args) {

//    LoginRequest loginRequest = new LoginRequest(null, "Secret");
    LoginRequest loginRequest = new LoginRequest("Novan", "Secret");

    try {
      ValidationUtil.validate(loginRequest);
      System.out.println("Data valid");
    } catch (ValidationException | NullPointerException exception) {
      System.out.println("Data tidak valid : " + exception.getMessage());
    } finally {
      System.out.println("Selalu di eksekusi");
    }


    LoginRequest loginRequest2 = new LoginRequest(null, null);
    ValidationUtil.validateRuntime(loginRequest2);
    System.out.println("Sukses");

  }
}
