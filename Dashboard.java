package hotel.management.system;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;

public class Dashboard  extends JFrame implements ActionListener {
    
    Dashboard()  {
        setBounds(30, 30, 1200, 600);
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Photos/third.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1200,600);
        add(image);
        
        JLabel text = new JLabel("INDIAN RESORT");
        text.setBounds(700, 60, 1000, 50);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Tahoma", Font.PLAIN, 50));
        image.add(text);
        	
		
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 0, 1200, 30);
	image.add(mb);
		
        JMenu hotal = new JMenu("HOTEL MANAGEMENT");
        hotal.setForeground(Color.BLUE);
	mb.add(hotal);
		
        JMenuItem reception = new JMenuItem("RECEPTION");
        //reception.addActionListener(this);
	hotal.add(reception);
		
	JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.RED);
	mb.add(admin);
        
        JMenuItem addemployee = new JMenuItem("ADD EMPLOYEE");
        addemployee.addActionListener(this);
	admin.add(addemployee);
        
        JMenuItem addroom = new JMenuItem("ADD ROOMS");
        addroom.addActionListener(this);
	admin.add(addroom);
           
         setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae)  {
        if (ae.getActionCommand().equals("ADD EMPLOYEE"))  {
           new AddEmployee();
        }
        else if (ae.getActionCommand().equals("ADD ROOMS"))
        {
        new AddRoom();
        }
    
    }
    
    public static void main(String[] args)  {
     new Dashboard();
    }
    
}
