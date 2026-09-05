class Vehicle {

    String vehicleNumber = "MH12AB1234";
    String vehicleModel = "Toyota Fortuner";

    void displayVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Vehicle Model: " + vehicleModel);
    }
}

class CarInsurance extends Vehicle {

    String insuranceType = "Comprehensive";

    void displayInsuranceDetails() {

        System.out.println("Car Insurance Details:");
        System.out.println("Vehicle Number: " + super.vehicleNumber);
        System.out.println("Vehicle Model: " + super.vehicleModel);
        System.out.println("Insurance Type: " + insuranceType);
    }
}

class BikeInsurance extends Vehicle {

    String insuranceType = "Third Party";

    void displayInsuranceDetails() {

        System.out.println("Bike Insurance Details:");
        System.out.println("Vehicle Number: " + super.vehicleNumber);
        System.out.println("Vehicle Model: " + super.vehicleModel);
        System.out.println("Insurance Type: " + insuranceType);
    }
}

class VehicleInsurance {

    public static void main(String[] args) {

        CarInsurance car = new CarInsurance();
        BikeInsurance bike = new BikeInsurance();

        car.displayInsuranceDetails();

        System.out.println();

        bike.displayInsuranceDetails();
    }
}