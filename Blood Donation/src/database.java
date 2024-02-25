import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;


public class database {
  static Connection conn=null;
  
  
  public static Connection dbConnector()
  {
    try {
      Class.forName("org.sqlite.JDBC");
      conn=DriverManager.getConnection("jdbc:sqlite:C:\\j2se\\javaProjects\\BloodDonation\\Resources\\BloodDonation.sqlite");
      
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null,"Database Not Found ");
    }
    return conn;
  }
}
