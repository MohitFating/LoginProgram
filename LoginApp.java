package Java;
import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) {
        // Hardcoded username and password
        String username = "admin";
        String password = "password";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your username: ");
        String inputUsername = scanner.nextLine();

        System.out.println("Please enter your password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password. Login failed.");
        }

        scanner.close();
    }
}
