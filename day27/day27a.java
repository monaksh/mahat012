package mahat012.day27;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class day27a{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
        frame.setLayout(new GridLayout(5, 6));

        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();
        JLabel resultLabel = new JLabel("Result: ");

        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");
        JButton multiplyButton = new JButton("Multiply");
        JButton divideButton = new JButton("Divide");
        JButton clearButton = new JButton("Clear");

        addButton.addActionListener(e -> performOperation(num1Field, num2Field, resultLabel, "+"));
        subtractButton.addActionListener(e -> performOperation(num1Field, num2Field, resultLabel, "-"));
        multiplyButton.addActionListener(e -> performOperation(num1Field, num2Field, resultLabel, "*"));
        divideButton.addActionListener(e -> performOperation(num1Field, num2Field, resultLabel, "/"));

        clearButton.addActionListener(e -> {
            num1Field.setText("");
            num2Field.setText("");
            resultLabel.setText("Result: ");
        });

        frame.add(new JLabel("Number 1:"));
        frame.add(num1Field);
        frame.add(new JLabel("Number 2:"));
        frame.add(num2Field);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);
        frame.add(clearButton);
        frame.add(resultLabel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void performOperation(JTextField num1Field, JTextField num2Field, JLabel resultLabel, String operation) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;

            switch (operation) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/":
                    if (num2 == 0) {
                        resultLabel.setText("Error: Division by Zero");
                        return;
                    }
                    result = num1 / num2;
                    break;
            }
            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException e) {
            resultLabel.setText("Error: Invalid Input");
        }
    }
} 
