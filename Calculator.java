import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {

    private JTextField num1TextField, num2TextField, resultTextField;
    private JButton addButton, subtractButton, multiplyButton, divideButton;


    public Calculator() {
        setTitle("MyCalculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);


        JPanel mainPanel = new JPanel(new GridLayout(4, 2));
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4));

        JLabel num1Label = new JLabel("Number 1:");
        num1TextField = new JTextField();
        JLabel num2Label = new JLabel("Number 2:");
        num2TextField = new JTextField();
        JLabel resultLabel = new JLabel("Result:");
        resultTextField = new JTextField();
        resultTextField.setEditable(false);

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");

        mainPanel.add(num1Label);
        mainPanel.add(num1TextField);
        mainPanel.add(num2Label);
        mainPanel.add(num2TextField);
        mainPanel.add(resultLabel);
        mainPanel.add(resultTextField);
        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);

        add(mainPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        setVisible(true);
    }

    public void performCalculation(String operator) {
        double num1 = Double.parseDouble(num1TextField.getText());
        double num2 = Double.parseDouble(num2TextField.getText());
        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }

        resultTextField.setText(Double.toString(result));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            performCalculation("+");
        } else if (e.getSource() == subtractButton) {
            performCalculation("-");
        } else if (e.getSource() == multiplyButton) {
            performCalculation("*");
        } else if (e.getSource() == divideButton) {
            performCalculation("/");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}