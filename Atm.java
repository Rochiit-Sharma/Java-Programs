import java.util.Scanner;

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

public class Atm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        System.out.println("===== ATM MACHINE =====");
        System.out.println("Available Balance: ₹" + balance);

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            if (amount <= 0) {
                throw new InvalidAmountException(
                    "Withdrawal amount must be greater than 0."
                );
            }

            if (amount > balance) {
                throw new InvalidAmountException(
                    "Insufficient balance."
                );
            }

            if (amount % 100 != 0) {
                throw new InvalidAmountException(
                    "Amount must be in multiples of 100."
                );
            }

            balance = balance - amount;

            System.out.println("Withdrawal successful!");
            System.out.println("Withdrawn Amount: ₹" + amount);
            System.out.println("Remaining Balance: ₹" + balance);

        } catch (InvalidAmountException e) {
            System.out.println("Invalid Withdrawal: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a number.");
        }

        sc.close();
    }
}