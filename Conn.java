package hotel.management.system;


import java.sql.*;
import javax.swing.JOptionPane;

public class Conn {
    
  
   public static Connection getConnection()  {
     
       try  {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:vipin/vipin@localhost:1521:XE", "System", "1234");
	String query = "insert into vipin.Employee values('"+id+"','"+name+"','"+dept+"','"+city+"')";
        Statement st = conn.createStatement();

	int rowsInserted = st.executeUpdate(query);

	if (rowsInserted!=0)
	{
	     JOptionPane.showMessageDialog(this,"Data Inserted successFilly!");
        }
	st.close();
	conn.close();
	}
	catch (SQLException e)
        {
        	e.printStackTrace();
		JOptionPane.showMessageDialog(this,"Error insert data:"+e.getMessage());
	}
        return conn;
    }   
    
}
