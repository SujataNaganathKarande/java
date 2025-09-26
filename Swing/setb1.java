package Swing;


	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class setb1 extends JFrame implements ActionListener {
	    JTextField usernameField;
	    JPasswordField passwordField;
	    JButton loginButton, resetButton;
	    int attempts = 0;

	    public setb1() {
	        setTitle("Login Form");
	        setSize(300, 200);
	        setLayout(new GridLayout(3, 2));

	        // Components
	        add(new JLabel("Username:"));
	        usernameField = new JTextField();
	        add(usernameField);

	        add(new JLabel("Password:"));
	        passwordField = new JPasswordField();
	        add(passwordField);

	        loginButton = new JButton("Login");
	        resetButton = new JButton("Reset");
	        add(loginButton);
	        add(resetButton);

	        loginButton.addActionListener(this);
	        resetButton.addActionListener(this);

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
	    }

	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == loginButton) {
	            String user = usernameField.getText();
	            String pass = new String(passwordField.getPassword());

	            if (user.equals("admin") && pass.equals("1234")) {
	                JOptionPane.showMessageDialog(this, "Login successful");
	                attempts = 0; // reset attempts
	            } else {
	                attempts++;
	                if (attempts >= 3) {
	                    JOptionPane.showMessageDialog(this, "Login Failed");
	                    loginButton.setEnabled(false); // disable login
	                } else {
	                    JOptionPane.showMessageDialog(this, "Username or Password is incorrect");
	                }
	            }
	        } else if (e.getSource() == resetButton) {
	            usernameField.setText("");
	            passwordField.setText("");
	        }
	    }

	    public static void main(String[] args) {
	        new setb1();
	    }
	}


