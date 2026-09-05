abstract class FoodOrder {

    double foodPrice;

    FoodOrder(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    abstract double calculateBill();

    void displayBill() {
        System.out.println("Food Price: Rs. " + foodPrice);
        System.out.println("Total Bill: Rs. " + calculateBill());
    }
}

class DineInOrder extends FoodOrder {

    DineInOrder(double foodPrice) {
        super(foodPrice);
    }

    double calculateBill() {
        double serviceCharge = foodPrice * 0.10;
        return foodPrice + serviceCharge;
    }
}

class TakeAwayOrder extends FoodOrder {

    TakeAwayOrder(double foodPrice) {
        super(foodPrice);
    }

    double calculateBill() {
        double packingCharge = 50;
        return foodPrice + packingCharge;
    }
}

class FoodOrderSystem {

    public static void main(String[] args) {

        DineInOrder dineIn = new DineInOrder(500);
        TakeAwayOrder takeAway = new TakeAwayOrder(500);

        System.out.println("Dine-In Order:");
        dineIn.displayBill();

        System.out.println();

        System.out.println("Take-Away Order:");
        takeAway.displayBill();
    }
}