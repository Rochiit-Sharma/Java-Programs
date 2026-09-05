class Employee {

    String name = "Rochiit";
    int salary = 3000000;

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: Rs. " + salary);
    }
}

class Manager extends Employee {

    String department = "IT";

    void displayManagerDetails() {

        System.out.println("Manager Details:");
        System.out.println("Employee Name: " + super.name);
        System.out.println("Employee Salary: Rs. " + super.salary);
        System.out.println("Department: " + department);
    }
}

class ManagerDetails {

    public static void main(String[] args) {

        Manager m = new Manager();

        m.displayManagerDetails();
    }
}