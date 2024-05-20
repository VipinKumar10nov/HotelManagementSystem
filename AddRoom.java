/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import javafx.scene.paint.Color;
import javax.swing.*;

/**
 *
 * @author Asus
 */
public class AddRoom extends JFrame {
    AddRoom()
    {
      // getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(330,200,940,470);
        setVisible(true);
    }
    
    public static void main( String[] args)
    {
        new AddRoom();
    }
}
