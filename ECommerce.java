class ECommerce {

    public static void main(String[] args) {

        Electronics e = new Electronics("Laptop", 60000);
        Clothing c = new Clothing("T-Shirt", 1000);
        Grocery g = new Grocery("Rice", 800);

        e.displayProduct();
        e.productAction();

        c.displayProduct();
        c.productAction();

        g.displayProduct();
        g.productAction();
    }
}

interface Product {
    void displayProduct();
    void productAction();
}

class ProductDetails {

    String name;
    double price;

    ProductDetails(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Electronics extends ProductDetails implements Product {

    Electronics(String name, double price) {
        super(name, price);
    }

    public void displayProduct() {
        System.out.println("Electronics Product");
        System.out.println("Name: " + name);
        System.out.println("Price: Rs. " + price);
    }

    public void productAction() {
        System.out.println("Electronics product added to cart.");
    }
}

class Clothing extends ProductDetails implements Product {

    Clothing(String name, double price) {
        super(name, price);
    }

    public void displayProduct() {
        System.out.println("Clothing Product");
        System.out.println("Name: " + name);
        System.out.println("Price: Rs. " + price);
    }

    public void productAction() {
        System.out.println("Clothing product added to cart.");
    }
}

class Grocery extends ProductDetails implements Product {

    Grocery(String name, double price) {
        super(name, price);
    }

    public void displayProduct() {
        System.out.println("Grocery Product");
        System.out.println("Name: " + name);
        System.out.println("Price: Rs. " + price);
    }

    public void productAction() {
        System.out.println("Grocery product added to cart.");
    }
}