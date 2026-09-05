import faculty.Faculty;
import student.StudentDetails;

class CollegeManagement {

    public static void main(String[] args) {

        StudentDetails s = new StudentDetails();
        Faculty f = new Faculty();

        s.displayStudent();

        System.out.println();

        f.displayFaculty();
    }
}