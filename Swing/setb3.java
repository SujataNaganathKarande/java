package Swing;
    import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class setb3 {
	    public static void main(String[] args) {
	       
	        JFrame frame = new JFrame("Assignment 4 - GUI Example");
	        frame.setSize(400, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new GridLayout(4, 2, 10, 10)); // Grid layout with 4 rows and 2 columns

	       
	        JLabel nameLabel = new JLabel("Name:");
	        JTextField nameField = new JTextField();

	        JLabel emailLabel = new JLabel("Email:");
	        JTextField emailField = new JTextField();

	        JLabel passwordLabel = new JLabel("Password:");
	        JPasswordField passwordField = new JPasswordField();

	        JButton submitButton = new JButton("Submit");
	        JButton resetButton = new JButton("Reset");

	        
	        submitButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String name = nameField.getText();
	                String email = emailField.getText();
	                String password = new String(passwordField.getPassword());
	                JOptionPane.showMessageDialog(frame, "Submitted:\nName: " + name + "\nEmail: " + email);
	            }
	        });

	        resetButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                nameField.setText("");
	                emailField.setText("");
	                passwordField.setText("");
	            }
	        });

	       
	        frame.add(nameLabel);
	        frame.add(nameField);
	        frame.add(emailLabel);
	        frame.add(emailField);
	        frame.add(passwordLabel);
	        frame.add(passwordField);
	        frame.add(submitButton);
	        frame.add(resetButton);

	       
	        frame.setVisible(true);
	    }
	}


