import java.util.ArrayList;
import java.util.Scanner;

public class Course {

    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nStudent Course Registration System");
            System.out.println("1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. View Courses");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {

                System.out.print("Enter course name: ");
                String course = sc.nextLine();

                courses.add(course);
                System.out.println("Course added successfully.");

            }
            else if (choice == 2) {

                System.out.print("Enter course name to remove: ");
                String course = sc.nextLine();

                if (courses.remove(course)) {
                    System.out.println("Course removed successfully.");
                }
                else {
                    System.out.println("Course not found.");
                }

            }
            else if (choice == 3) {

                StringBuffer courseList = new StringBuffer();

                if (courses.isEmpty()) {
                    System.out.println("No courses registered.");
                }
                else {
                    for (String course : courses) {
                        courseList.append(course).append("\n");
                    }

                    System.out.println("\nRegistered Courses:");
                    System.out.println(courseList);
                }

            }
            else if (choice == 4) {
                System.out.println("Exiting program...");
            }
            else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}