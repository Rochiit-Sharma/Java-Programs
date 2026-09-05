import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator1 extends JFrame implements ActionListener {

    JLabel num1Label, num2Label, resultLabel;
    JTextField num1Field, num2Field, resultField;

    JButton addButton, subtractButton, clearButton;

    Calculator1() {

        // Frame settings
        setTitle("Simple Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        // First number
        num1Label = new JLabel("Enter First Number:");
        num1Field = new JTextField();

        // Second number
        num2Label = new JLabel("Enter Second Number:");
        num2Field = new JTextField();

        // Result
        resultLabel = new JLabel("Result:");
        resultField = new JTextField();

        // Make result field non-editable
        resultField.setEditable(false);

        // Buttons
        addButton = new JButton("Addition");
        subtractButton = new JButton("Subtraction");
        clearButton = new JButton("Clear");

        // Add action listeners
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Add components to frame
        add(num1Label);
        add(num1Field);

        add(num2Label);
        add(num2Field);

        add(resultLabel);
        add(resultField);

        add(addButton);
        add(subtractButton);

        // Center the window
        setLocationRelativeTo(null);

        // Display the window
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // Addition
        if (e.getSource() == addButton) {

            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());

                double result = num1 + num2;

                resultField.setText(String.valueOf(result));

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                    this,
                    "Please enter valid numbers!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }

        // Subtraction
        else if (e.getSource() == subtractButton) {

            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());

                double result = num1 - num2;

                resultField.setText(String.valueOf(result));

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                    this,
                    "Please enter valid numbers!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }

        // Clear
        else if (e.getSource() == clearButton) {

            num1Field.setText("");
            num2Field.setText("");
            resultField.setText("");
        }
    }

    public static void main(String[] args) {

        new Calculator1();
    }
}