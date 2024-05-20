package hotel.management.system;


import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
//import javax.swing.ImageIcon;

public class AddEmployee  extends JFrame{
    AddEmployee()  {
        setLayout(null);
        
        JLabel name = new JLabel("NAME");
        name.setBounds(60, 30, 120, 30);
        name.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(name);
        
        JTextField tfname = new JTextField();
        tfname.setBounds(200, 30, 150, 30);
        add(tfname);
        
        JLabel age = new JLabel("Age");
        age.setBounds(60, 80, 120, 30);
        age.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(age);
        
        JTextField tfage = new JTextField();
        tfage.setBounds(200, 80, 150, 30);
        add(tfage);
        
        JLabel gender = new JLabel("Gender");
        gender.setBounds(60, 130, 120, 30);
        gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(gender);
        
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(200, 130,70, 30);
        male.setFont(new Font("Tahoma", Font.PLAIN, 14));
        male.setBackground(Color.WHITE);
        add(male);
        
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(280, 130,70, 30);
        female.setFont(new Font("Tahoma", Font.PLAIN, 14));
        female.setBackground(Color.WHITE);
        add(female);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        
        JLabel job = new JLabel("JOB");
        job.setBounds(60, 180, 120, 30);
        job.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(job);
        
        String str[] = {"Manager", "Accountant", "Chefs", "Kitchen Staff", "Room Servvice", "Waiter", "Housekeeping"};
        JComboBox jbox  = new JComboBox(str);
        jbox.setBounds(200, 180, 150, 30);
        jbox.setBackground(Color.WHITE);
        add(jbox);
        
       /* JLabel job = new JLabel("JOB");
        job.setBounds(60, 180, 120, 30);
        job.setFont(new Font("Tahoma", Font.PLAIN, 17));
        add(job);*/
       
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("C:/javaCoding/Vipin/login.jpg"));
//        JLabel image = new JLabel(i1);
//        image.setBounds(380,60,450,450);
//        add(image);
        
        getContentPane().setBackground(Color.WHITE);
        
        setBounds(210, 90, 850, 540);
        setVisible(true);
    
    }
    
    public static void main(String[] args)  {
        new AddEmployee();
    
    }
}
