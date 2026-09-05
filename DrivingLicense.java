import java.util.Scanner;

// Custom Exception
class NotEligibleException extends Exception {
    public NotEligibleException(String message) {
        super(message);
    }
}

public class DrivingLicense {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new NotEligibleException(
                    "You are not eligible for a driving license. Age must be 18 or above."
                );
            }

            System.out.println("You are eligible for a driving license.");

        } catch (NotEligibleException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}