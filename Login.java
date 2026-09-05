import java.util.Scanner;

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class Login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctPassword = "12345";

        try {
            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (!password.equals(correctPassword)) {
                throw new InvalidPasswordException("Invalid password!");
            }

            System.out.println("Login successful!");

        } catch (InvalidPasswordException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Login process completed.");
            sc.close();
        }
    }
}