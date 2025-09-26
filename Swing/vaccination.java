package Swing;
import javax.swing.*;
import java.awt.*;


public class vaccination {
	    public static void main(String[] args) {
	        JFrame frame = new JFrame("Vaccination Form");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 300);
	        frame.setLocationRelativeTo(null); 
	        
	        JPanel panel = new JPanel();
	        panel.setLayout(new GridLayout(6, 2, 10, 10)); 
	        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

	       
	        panel.add(new JLabel("Name:"));
	        JTextField nameField = new JTextField();
	        panel.add(nameField);

	        
	        panel.add(new JLabel("Dose:"));
	        JPanel dosePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	        JCheckBox dose1 = new JCheckBox("1st Dose");
	        JCheckBox dose2 = new JCheckBox("2nd Dose");
	        dosePanel.add(dose1);
	        dosePanel.add(dose2);
	        panel.add(dosePanel);

	        
	        panel.add(new JLabel("Vaccine:"));
	        JPanel vaccinePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	        JRadioButton covishield = new JRadioButton("Covishield");
	        JRadioButton covaxin = new JRadioButton("Covaxin");
	        JRadioButton sputnik = new JRadioButton("Sputnik V");

	        
	        ButtonGroup vaccineGroup = new ButtonGroup();
	        vaccineGroup.add(covishield);
	        vaccineGroup.add(covaxin);
	        vaccineGroup.add(sputnik);

	        vaccinePanel.add(covishield);
	        vaccinePanel.add(covaxin);
	        vaccinePanel.add(sputnik);
	        panel.add(vaccinePanel);

	        
	        panel.add(new JLabel(""));

	        
	        JButton submitButton = new JButton("Submit");
	        panel.add(submitButton);
	        frame.add(panel);
	        frame.setVisible(true);
	    }
	}



