package hotel.management.system;


import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener {
    
    JTextField username;
    JPasswordField password;
    JButton login, cancel;
    
    Login()  {
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        
        JLabel user = new JLabel("Username");
        user.setBounds(40, 20, 100, 30);
        add(user);
        
        username = new JTextField();
        username.setBounds(150, 20, 150, 30);
        add(username);
        
        JLabel pwd = new JLabel("Password");
        pwd.setBounds(40, 70, 100, 30);
        add(pwd);
        
        password = new JPasswordField();
        password.setBounds(150, 70, 150, 30);
        add(password);
        
        login = new JButton("Login");
        login.setBounds(40, 150, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        
        cancel = new JButton("Cancel");
        cancel.setBounds(180, 150, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Photos/second.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2) ;
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 200,200);
        add(image);
        
        setBounds(400, 200, 600, 300);
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae)  {
        if (ae.getSource() == login)  {
            String user = username.getText();
            String pwd = password.getText();
            
            setVisible(false);
            new Dashboard();
            
            try {
               /* Conn c = new Conn();
                
                String query = "select * from login where username = '" + user + "' and passsword = '" + pwd + "' ";
                
                ResultSet rs = c.s.executeQuery(query);
                */
                 String query = "select * from login where username = '" + user + "' and passsword = '" + pwd + "' ";
                 Connection con=Conn.getConnection();
                 Statement stmt=con.createStatement();
                 ResultSet rs=stmt.executeQuery(query);
                if (rs.next())  {
                    setVisible(false);
                    new Dashboard();
                } else  {
                     JOptionPane.showMessageDialog(null, "Invalid username or password");
                     this.setVisible(false);
                }
            
            } catch (Exception e) {
               e.printStackTrace();
            }
        } else if (ae.getSource() == cancel)  {
            setVisible(false);
        }
    
    }
    
    public static void main(String[] args){
        new Login();
    }
}

