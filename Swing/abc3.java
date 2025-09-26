package Swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class abc3 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Text Analyzer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null); 
        
        JTextArea textArea = new JTextArea(10, 40);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        
        JLabel countLabel = new JLabel("Words: 0 | Characters: 0");

       
        JButton countButton = new JButton("Count Words");

        
        countButton.addActionListener(e -> {
            String text = textArea.getText().trim();
            int charCount = text.length();
            int wordCount = text.isEmpty() ? 0 : text.split("\\s+").length;
            countLabel.setText("Words: " + wordCount + " | Characters: " + charCount);
        });

        
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel.add(scrollPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(countButton, BorderLayout.WEST);
        bottomPanel.add(countLabel, BorderLayout.CENTER);

        panel.add(bottomPanel, BorderLayout.SOUTH);

       
        frame.add(panel);
        frame.setVisible(true);
    }
}



