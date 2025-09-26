package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class abc {
    public static void main(String[] args) {
       
        JFrame frame = new JFrame("Language Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

       
        String[] languages = {"Java", "Python", "C++", "JavaScript", "Ruby"};
        JComboBox<String> languageComboBox = new JComboBox<>(languages);

       
        JLabel selectedLanguageLabel = new JLabel("Selected Language: None");

       
        JButton showButton = new JButton("Show");

       
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                String selectedLanguage = (String) languageComboBox.getSelectedItem();
                selectedLanguageLabel.setText("Selected Language: " + selectedLanguage);
            }
        });

        // Add components to the frame
        frame.add(new JLabel("Choose a Language:"));
        frame.add(languageComboBox);
        frame.add(showButton);
        frame.add(selectedLanguageLabel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
