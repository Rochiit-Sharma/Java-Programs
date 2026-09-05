public class RestaurantBilling {

    public static void main(String[] args) {

        RestaurantBilling r = new RestaurantBilling();

        // Dine-in order
        double dineInBill = r.calculateBill(500);

        // Takeaway order
        double takeawayBill = r.calculateBill(500, 50);

        // Delivery order
        double deliveryBill = r.calculateBill(500, 50, 40);

        System.out.println("Dine-in Bill: " + dineInBill);
        System.out.println("Takeaway Bill: " + takeawayBill);
        System.out.println("Delivery Bill: " + deliveryBill);

        System.out.println("Total Orders: " + totalOrders);
    }

    static int totalOrders = 0;

    // Dine-in bill
    double calculateBill(double foodAmount) {
        totalOrders++;
        return foodAmount;
    }

    // Takeaway bill
    double calculateBill(double foodAmount, double packingCharge) {
        totalOrders++;
        return foodAmount + packingCharge;
    }

    // Delivery bill
    double calculateBill(double foodAmount, double packingCharge, double deliveryCharge) {
        totalOrders++;
        return foodAmount + packingCharge + deliveryCharge;
    }
}