public class StudentMarks {

    public static void main(String[] args) {

        // Marks stored as String
        String mark1 = "75";
        String mark2 = "82";
        String mark3 = "90";

        // Convert String to Integer
        Integer m1 = Integer.valueOf(mark1);
        Integer m2 = Integer.valueOf(mark2);
        Integer m3 = Integer.valueOf(mark3);

        // Calculate total
        int total = m1 + m2 + m3;

        System.out.println("Mark 1: " + m1);
        System.out.println("Mark 2: " + m2);
        System.out.println("Mark 3: " + m3);
        System.out.println("Total Marks: " + total);
    }
}