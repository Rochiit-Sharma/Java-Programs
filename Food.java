class Food {

    public static void main(String[] args) {

        Food food = new Food();

        // Inner class object
        OrderDetails order = food.new OrderDetails();
        order.displayOrder();

        // Anonymous class for delivery status
        DeliveryStatus status1 = new DeliveryStatus() {
            public void updateStatus() {
                System.out.println("Delivery Status: Order Confirmed");
            }
        };

        DeliveryStatus status2 = new DeliveryStatus() {
            public void updateStatus() {
                System.out.println("Delivery Status: Order Out for Delivery");
            }
        };

        DeliveryStatus status3 = new DeliveryStatus() {
            public void updateStatus() {
                System.out.println("Delivery Status: Order Delivered");
            }
        };

        status1.updateStatus();
        status2.updateStatus();
        status3.updateStatus();
    }

    // Inner class
    class OrderDetails {
        void displayOrder() {
            System.out.println("Food Order Details:");
            System.out.println("Customer: Rochiit");
            System.out.println("Food: Pizza");
            System.out.println("Quantity: 2");
            System.out.println("Amount: Rs. 500");
        }
    }

    // Interface for anonymous classes
    interface DeliveryStatus {
        void updateStatus();
    }
}