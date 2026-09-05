import java.util.Scanner;

class InvalidPINException extends Exception {
    public InvalidPINException(String message) {
        super(message);
    }
}

public class PinVerification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int correctPIN = 1234;

        try {
            System.out.print("Enter your ATM PIN: ");
            int pin = sc.nextInt();

            if (pin != correctPIN) {
                throw new InvalidPINException("Invalid PIN entered!");
            }

            System.out.println("PIN verified successfully!");

        } catch (InvalidPINException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("PIN verification process completed.");
            sc.close();
        }
    }
}