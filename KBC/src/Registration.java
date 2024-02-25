import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Registration extends JFrame {
	Connection conn;
	Statement stmt;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;


	public Registration() {
		getContentPane().setBackground(new Color(204, 255, 204));
		conn=Database.dbConnector();
		setSize(800,700);
		getContentPane().setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblId.setBounds(268, 106, 79, 21);
		getContentPane().add(lblId);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblName.setBounds(255, 168, 79, 21);
		getContentPane().add(lblName);
		
		JLabel lblPhoneNo = new JLabel("Phone no.");
		lblPhoneNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPhoneNo.setBounds(255, 225, 79, 21);
		getContentPane().add(lblPhoneNo);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Sitka Small", Font.PLAIN, 15));
		lblEmail.setBounds(255, 277, 79, 21);
		getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(255, 332, 79, 21);
		getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(395, 108, 164, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(395, 170, 164, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(395, 227, 164, 20);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(395, 277, 164, 20);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(395, 334, 164, 20);
		getContentPane().add(textField_4);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 20));
	btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try
				{
					stmt=conn.createStatement();
					String sql="INSERT INTO Registration(Id,Name,PhoneNo,Email,Password)"+"VALUES('"+textField.getText()+"','"+textField_1.getText()+"','"+textField_2.getText()+"','"+textField_3.getText()+"','"+textField_4.getText()+"');";      
					stmt.executeUpdate(sql);
					stmt.close();
					//conn.commit();
					conn.close();
					//dispose();
					JOptionPane.showMessageDialog(null, "You are registered now!");
				}
			     catch(Exception e)
			     {
			    	 JOptionPane.showMessageDialog(null, ""+e);
			     }
			}
		});
		btnSubmit.setBounds(200, 431, 124, 35);
		getContentPane().add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel("      Register");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(323, 52, 146, 29);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    dispose();
				new Login();
			}
		});
		btnNewButton.setBounds(413, 431, 124, 35);
		getContentPane().add(btnNewButton);
		setVisible(true);
	}

}
