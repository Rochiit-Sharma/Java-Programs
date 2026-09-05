
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeRegistration {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Employee Registration Form");

        JLabel idLabel = new JLabel("Employee ID:");
        JLabel nameLabel = new JLabel("Name:");
        JLabel deptLabel = new JLabel("Department:");
        JLabel salaryLabel = new JLabel("Salary:");

        JTextField idField = new JTextField();
        JTextField nameField = new JTextField();
        JTextField deptField = new JTextField();
        JTextField salaryField = new JTextField();

        JButton submitButton = new JButton("Submit");
        JButton clearButton = new JButton("Clear");

        frame.setLayout(new GridLayout(5, 2, 10, 10));

        frame.add(idLabel);
        frame.add(idField);

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(deptLabel);
        frame.add(deptField);

        frame.add(salaryLabel);
        frame.add(salaryField);

        frame.add(submitButton);
        frame.add(clearButton);

        // Submit Button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String id = idField.getText();
                String name = nameField.getText();
                String department = deptField.getText();
                String salary = salaryField.getText();

                JOptionPane.showMessageDialog(
                        frame,
                        "Employee Details\n\n" +
                        "Employee ID: " + id +
                        "\nName: " + name +
                        "\nDepartment: " + department +
                        "\nSalary: " + salary
                );
            }
        });

        // Clear Button
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                idField.setText("");
                nameField.setText("");
                deptField.setText("");
                salaryField.setText("");
            }
        });

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
