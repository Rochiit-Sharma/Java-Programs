class Vehicle {

    public static void main(String[] args) {

        Vehicle v = new Vehicle();

        // Inner class object
        VehicleDetails details = v.new VehicleDetails();
        details.displayDetails();

        // Anonymous class
        VehicleAction action = new VehicleAction() {
            public void performAction() {
                System.out.println("Vehicle is starting...");
            }
        };

        action.performAction();
    }

    // Inner class
    class VehicleDetails {
        void displayDetails() {
            System.out.println("Vehicle Details:");
            System.out.println("Brand: Toyota");
            System.out.println("Model: Fortuner");
            System.out.println("Year: 2025");
        }
    }

    // Interface for anonymous class
    interface VehicleAction {
        void performAction();
    }
}
