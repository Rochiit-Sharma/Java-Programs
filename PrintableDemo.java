interface Printable {

    void printDetails();
}

class Student implements Printable {

    String name = "Rochiit";
    int rollNo = 101;

    public void printDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

class Employee implements Printable {

    String name = "Rahul";
    int salary = 40000;

    public void printDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs. " + salary);
    }
}

class PrintableDemo {

    public static void main(String[] args) {

        Student s = new Student();
        Employee e = new Employee();

        s.printDetails();

        System.out.println();

        e.printDetails();
    }
}