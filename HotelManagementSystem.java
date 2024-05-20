package hotel.management.system;
 

import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class HotelManagementSystem extends JFrame implements ActionListener {
    
    HotelManagementSystem(){
    //setSize(1100, 500);
    //setLocation(80, 80);
    setBounds(80,80, 1100, 500);
    setLayout(null);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Photos/first.jpg"));
    JLabel image = new JLabel(i1);
    image.setBounds(0, 0, 1100,500);
    add(image);
    
    JLabel text = new JLabel("HOTEL MANAGEMENT SYSTEM");
    text.setBounds(20, 380, 1000, 90);
    text.setForeground(Color.WHITE);
    text.setFont(new Font("serif", Font.PLAIN, 50));
    image.add(text);
    
    JButton next = new JButton("Next");
    next.setBounds(960, 415, 100, 30);
    next.setBackground(Color.WHITE);
    next.setForeground(Color.MAGENTA);
    next.addActionListener(this);
    next.setFont(new Font("serif", Font.PLAIN, 18));
    image.add(next);
    
    
    setVisible(true);
    
    
    while(true)  {
        text.setVisible(false);
     try {
          Thread.sleep(500);
         } catch(Exception e) {
         e.printStackTrace();
         }
         text.setVisible(true);
         try {
          Thread.sleep(500);
         } catch(Exception e) {
         e.printStackTrace();
         }
      }
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        HotelManagementSystem hm = new HotelManagementSystem();
    }
    
}

