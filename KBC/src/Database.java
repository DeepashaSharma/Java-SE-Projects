import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;


public class Database {
	static Connection conn=null;
	
	
	public static Connection dbConnector()
	{
		try {
			Class.forName("org.sqlite.JDBC");
			conn=DriverManager.getConnection("jdbc:sqlite:E:\\j2se\\javaProjects\\KBC\\Resources\\KBC.sqlite");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Database Not Found ");
		}
		return conn;
	}
}
