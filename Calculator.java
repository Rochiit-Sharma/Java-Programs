public class Calculator {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        // Addition of integers
        int result1 = c.add(10, 20);

        // Addition of decimals
        double result2 = c.add(10.5, 20.5);

        System.out.println("Addition of integers: " + result1);
        System.out.println("Addition of decimals: " + result2);

        System.out.println("Total Calculations: " + calculationCount);
    }

    static int calculationCount = 0;

    // Overloaded method for integers
    int add(int a, int b) {
        calculationCount++;
        return a + b;
    }

    // Overloaded method for decimals
    double add(double a, double b) {
        calculationCount++;
        return a + b;
    }
}