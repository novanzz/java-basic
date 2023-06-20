package example.oop.error;

public class LoginRequest {
    String username;
    String password;

    public LoginRequest() {
        System.out.println("Membuat object LoginRequest");
    }

    public LoginRequest(String username) {
        this.username = username;
    }

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
