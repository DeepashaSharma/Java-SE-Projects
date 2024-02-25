import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;


public class database {
	static Connection conn=null;
	
	
	public static Connection dbConnector()
	{
		try {
			Class.forName("org.sqlite.JDBC");
			conn=DriverManager.getConnection("jdbc:sqlite:E:\\j2se\\javaProjects\\Event schedular\\Resources\\Eventschedularreminder.sqlite");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Database Not Found ");
		}
		return conn;
	}
}
