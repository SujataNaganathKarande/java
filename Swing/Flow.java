package Swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Flow extends JPanel {

  public Flow() {
    
    add(new JButton("One"));
    add(new JButton("Two"));
    add(new JButton("Three"));
    add(new JButton("Four"));
    add(new JButton("Five"));
    
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Flow");
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

    frame.setSize(600, 85);
    frame.setLocation(300, 300);
    Flow flow = new Flow();
    frame.setContentPane(flow);
    frame.setVisible(true);
  }
}



