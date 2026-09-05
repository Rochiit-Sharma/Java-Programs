import java.util.Scanner;

// Custom Exception
class NotEligibleException extends Exception {
    public NotEligibleException(String message) {
        super(message);
    }
}

public class Voting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new NotEligibleException(
                    "You are not eligible to vote. Age must be 18 or above."
                );
            }

            System.out.println("You are eligible to vote!");

        } catch (NotEligibleException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Voting eligibility check completed.");
            sc.close();
        }
    }
}