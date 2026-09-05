public class MobilePhoneInventory {

    public static void main(String[] args) {

        // Object using default constructor
        MobilePhoneInventory m1 = new MobilePhoneInventory();

        // Object using parameterized constructor
        MobilePhoneInventory m2 = new MobilePhoneInventory("Samsung", "Galaxy S25", 79999);

        // Duplicate object using copy constructor
        MobilePhoneInventory m3 = new MobilePhoneInventory(m2);

        System.out.println("Mobile 1:");
        m1.display();

        System.out.println("Mobile 2:");
        m2.display();

        System.out.println("Duplicate Mobile Record:");
        m3.display();
    }

    String brand;
    String model;
    double price;

    // Default Constructor
    MobilePhoneInventory() {
        brand = "Unknown";
        model = "Unknown";
        price = 0;
    }

    // Parameterized Constructor
    MobilePhoneInventory(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Copy Constructor
    MobilePhoneInventory(MobilePhoneInventory m) {
        this.brand = m.brand;
        this.model = m.model;
        this.price = m.price;
    }

    // Display method
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println();
    }
}