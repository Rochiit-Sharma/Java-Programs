import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class PatientFile {

    public static void main(String[] args) {

        try {
            // Writing patient details to file
            FileWriter writer = new FileWriter("patient.txt");

            writer.write("Patient Details:\n");
            writer.write("Patient ID: 101\n");
            writer.write("Name: Rahul\n");
            writer.write("Age: 25\n");
            writer.write("Diagnosis: Fever\n");

            writer.close();

            // Reading patient details from file
            FileReader reader = new FileReader("patient.txt");

            int ch;

            System.out.println("Patient Details from File:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}