public class Student {

    public static void main(String[] args) {

        Student s1 = new Student("Sham", 100);
        Student s2 = new Student("Rochiit", 101);

        System.out.println("Student 1:");
        s1.display();

        System.out.println("Student 2:");
        s2.display();
    }

    String name;
    int rollNo;

    // Default Constructor
    Student() {
        name = "Unknown";
        rollNo = 0;
    }

    // Parameterized Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Display method
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println();
    }
}
