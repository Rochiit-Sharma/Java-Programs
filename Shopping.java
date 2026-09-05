import java.util.Scanner;

class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

public class Shopping {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product name: ");
            String product = sc.nextLine();

            System.out.print("Enter product quantity: ");
            int quantity = sc.nextInt();

            if (quantity <= 0) {
                throw new InvalidQuantityException(
                    "Invalid quantity! Quantity must be greater than zero."
                );
            }

            System.out.println("Order placed successfully!");
            System.out.println("Product: " + product);
            System.out.println("Quantity: " + quantity);

        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Error: Please enter a valid number.");
        }

        sc.close();
    }
}
