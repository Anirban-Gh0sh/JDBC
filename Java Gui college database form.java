import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentForm1 extends JFrame {
    private JTextField regNoField;
    private JTextField nameField;
    private JTextField phoneField;
    private JTextField genderField;
    private JTextField cityField;

    public StudentForm1() {
        // Set window properties
        setTitle("Student Form");
        setSize(400, 300);
        setResizable(true);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // Create components
        JLabel headingLabel = new JLabel("COLLEGE OF ENGINEERING BHUBANESWAR");
        JLabel detailsLabel = new JLabel("Enter student details:");
        JLabel regNoLabel = new JLabel("Registration No:");
        JLabel nameLabel = new JLabel("Name:");
        JLabel phoneLabel = new JLabel("Phone Number:");
        JLabel genderLabel = new JLabel("Gender:");
        JLabel cityLabel = new JLabel("City:");

        regNoField = new JTextField(20);
        nameField = new JTextField(20);
        phoneField = new JTextField(20);
        genderField = new JTextField(20);
        cityField = new JTextField(20);

        JButton submitButton = new JButton("Submit");
        JButton refreshButton = new JButton("Refresh");

        // Create panels and set layouts
        JPanel headingPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel detailsPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        // Add components to the panels
        headingPanel.add(headingLabel);
        detailsPanel.add(detailsLabel);
        formPanel.add(regNoLabel);
        formPanel.add(regNoField);
        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(phoneLabel);
        formPanel.add(phoneField);
        formPanel.add(genderLabel);
        formPanel.add(genderField);
        formPanel.add(cityLabel);
        formPanel.add(cityField);
        buttonPanel.add(submitButton);
        buttonPanel.add(refreshButton);

        // Add panels to the frame
        add(headingPanel, BorderLayout.NORTH);
        add(detailsPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Set margin for labels
        Insets labelInsets = new Insets(10, 10, 10, 10);
        regNoLabel.setBorder(BorderFactory.createEmptyBorder(labelInsets.top, labelInsets.left, labelInsets.bottom, labelInsets.right));
        nameLabel.setBorder(BorderFactory.createEmptyBorder(labelInsets.top, labelInsets.left, labelInsets.bottom, labelInsets.right));
        phoneLabel.setBorder(BorderFactory.createEmptyBorder(labelInsets.top, labelInsets.left, labelInsets.bottom, labelInsets.right));
        genderLabel.setBorder(BorderFactory.createEmptyBorder(labelInsets.top, labelInsets.left, labelInsets.bottom, labelInsets.right));
        cityLabel.setBorder(BorderFactory.createEmptyBorder(labelInsets.top, labelInsets.left, labelInsets.bottom, labelInsets.right));

        // Button action listeners
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String regNo = regNoField.getText();
                String name = nameField.getText();
                String phone = phoneField.getText();
                String gender = genderField.getText();
                String city = cityField.getText();

                // Store the data into variables (do whatever you want with the data here)
                // Example: you can print the values
                System.out.println("Registration No: " + regNo);
                System.out.println("Name: " + name);
                System.out.println("Phone Number: " + phone);
                System.out.println("Gender: " + gender);
                System.out.println("City: " + city);
            }
        });

        refreshButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Clear all the text fields
                regNoField.setText("");
                nameField.setText("");
                phoneField.setText("");
                genderField.setText("");
                cityField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                StudentForm1 form = new StudentForm1();
                form.setVisible(true);
            }
        });
    }
}

