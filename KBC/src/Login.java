import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends JFrame {

	private JTextField textField;
	private JPasswordField passwordField;
	Connection conn;
	public static void main(String[] args) {
       new Login();
	}
	public Login() {
		getContentPane().setBackground(new Color(204, 204, 255));
		conn=Database.dbConnector();
		setSize(800,700);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(190, 133, 143, 38);
		getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPassword.setBounds(197, 231, 136, 38);
		getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(392, 145, 187, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(392, 243, 187, 26);
		getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(255, 204, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 
		        try {
		          int count=0;
		          String query="select * from Registration where Name=? and Password=?";
		          PreparedStatement pst=conn.prepareStatement(query);
		          pst.setString(1, textField.getText());
		          pst.setString(2, passwordField.getText());
		          
		          ResultSet res=pst.executeQuery();
		          while(res.next())
		          {
		            count=res.getInt(1);
		            
		            
		          }
		          if(count==0)JOptionPane.showMessageDialog(null,"Incorrect Credentials");
		          else
		          {
		            new Scene();
		          }
		          
		        } catch (Exception e) {
		        	JOptionPane.showMessageDialog(null,""+e);
		        }
		        
		       
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(190, 349, 114, 38);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setBackground(new Color(255, 204, 255));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				new Registration();
			}
		});
		btnNewButton_1.setBounds(433, 349, 114, 38);
		getContentPane().add(btnNewButton_1);
		setVisible(true);
	}
}
 