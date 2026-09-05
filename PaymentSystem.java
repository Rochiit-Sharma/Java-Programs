abstract class Payment {

    abstract void makePayment();

    void paymentMessage() {
        System.out.println("Payment Processing...");
    }
}

class CreditCard extends Payment {

    void makePayment() {
        System.out.println("Payment made using Credit Card.");
    }
}

class UPI extends Payment {

    void makePayment() {
        System.out.println("Payment made using UPI.");
    }
}

class PaymentSystem {

    public static void main(String[] args) {

        CreditCard card = new CreditCard();
        UPI upi = new UPI();

        card.paymentMessage();
        card.makePayment();

        System.out.println();

        upi.paymentMessage();
        upi.makePayment();
    }
}