import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Donar extends JFrame {
	Connection conn;
	Statement stmt;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_4;

	
	public Donar() {
     // conn=database.dbConnector();
      setSize(500,500);
      getContentPane().setLayout(null);
      
      JButton btnNewButton = new JButton("SUBMIT");
      btnNewButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
      	try{
			stmt=conn.createStatement();
			String sql="INSERT INTO BD(Id,DonarName,PhoneNo,Address,DOB,Age,BloodGroup)"+"VALUES('"+textField.getText()+"','"+textField_1.getText()+"','"+textField_2.getText()+"','"+textField_3.getText()+"','"+textField_5.getText()+"','"+textField_6.getText()+"','"+textField_4.getText()+"');";      
			stmt.executeUpdate(sql);
			stmt.close();
			conn.commit();
			conn.close();
			dispose();
			JOptionPane.showMessageDialog(null, "You are registered now!");
		}
	     catch(Exception e)
	     {
	    	 JOptionPane.showMessageDialog(null, ""+e);
	     }

      		
      	
      	}
      });
      
      JLabel lblNewLabel_4 = new JLabel("Blood Group");
      lblNewLabel_4.setForeground(Color.BLUE);
      lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
      lblNewLabel_4.setBounds(30, 344, 125, 25);
      getContentPane().add(lblNewLabel_4);
      
      textField_4 = new JTextField();
      textField_4.setBackground(Color.YELLOW);
      textField_4.setBounds(174, 352, 200, 20);
      getContentPane().add(textField_4);
      textField_4.setColumns(10);
      btnNewButton.setBackground(Color.MAGENTA);
      btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
      btnNewButton.setBounds(119, 409, 146, 23);
      getContentPane().add(btnNewButton);
      
      textField_3 = new JTextField();
      textField_3.setBackground(Color.YELLOW);
      textField_3.setBounds(174, 117, 200, 25);
      getContentPane().add(textField_3);
      textField_3.setColumns(10);
      
      textField_6 = new JTextField();
      textField_6.setBackground(Color.YELLOW);
      textField_6.setBounds(174, 75, 200, 25);
      getContentPane().add(textField_6);
      textField_6.setColumns(10);
      
      textField_5 = new JTextField();
      textField_5.setBackground(Color.YELLOW);
      textField_5.setBounds(174, 161, 200, 25);
      getContentPane().add(textField_5);
      textField_5.setColumns(10);
      
      textField_2 = new JTextField();
      textField_2.setBackground(Color.YELLOW);
      textField_2.setBounds(174, 299, 200, 24);
      getContentPane().add(textField_2);
      textField_2.setColumns(10);
      
      textField_1 = new JTextField();
      textField_1.setBackground(Color.YELLOW);
      textField_1.setBounds(174, 249, 200, 24);
      getContentPane().add(textField_1);
      textField_1.setColumns(10);
      
      textField = new JTextField();
      textField.setBackground(Color.YELLOW);
      textField.setBounds(174, 205, 200, 24);
      getContentPane().add(textField);
      textField.setColumns(10);
      
      JLabel lblNewLabel_3 = new JLabel("REGISTRATION");
      lblNewLabel_3.setForeground(Color.MAGENTA);
      lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 32));
      lblNewLabel_3.setBackground(Color.YELLOW);
      lblNewLabel_3.setBounds(45, 15, 277, 35);
      getContentPane().add(lblNewLabel_3);
      
      JLabel lblAddress = new JLabel("Address");
      lblAddress.setForeground(Color.BLUE);
      lblAddress.setFont(new Font("Tahoma", Font.BOLD, 20));
      lblAddress.setBounds(30, 201, 97, 24);
      getContentPane().add(lblAddress);
      
      JLabel lblNewLabel = new JLabel("Age");
      lblNewLabel.setForeground(Color.BLUE);
      lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
      lblNewLabel.setBounds(30, 295, 80, 24);
      getContentPane().add(lblNewLabel);
      
      JLabel lblNewLabel_2 = new JLabel("New label");
      lblNewLabel_2.setBounds(140, 61, 46, -15);
      getContentPane().add(lblNewLabel_2);
      
      JLabel lblId = new JLabel("ID");
      lblId.setForeground(Color.BLUE);
      lblId.setFont(new Font("Tahoma", Font.BOLD, 20));
      lblId.setBounds(30, 71, 80, 24);
      getContentPane().add(lblId);
      
      JLabel lblDonarName = new JLabel("Donar Name");
      lblDonarName.setForeground(Color.BLUE);
      lblDonarName.setFont(new Font("Tahoma", Font.BOLD, 20));
      lblDonarName.setBounds(30, 113, 125, 25);
      getContentPane().add(lblDonarName);
      
      JLabel lblNewLabel_1 = new JLabel("D.O.B.");
      lblNewLabel_1.setForeground(Color.BLUE);
      lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
      lblNewLabel_1.setBounds(30, 245, 80, 24);
      getContentPane().add(lblNewLabel_1);
      
      JLabel lblPhoneNo = new JLabel("PhoneNo");
      lblPhoneNo.setForeground(Color.BLUE);
      lblPhoneNo.setFont(new Font("Tahoma", Font.BOLD, 20));
      lblPhoneNo.setBounds(30, 157, 111, 24);
      getContentPane().add(lblPhoneNo);
      
      JLabel label_3 = new JLabel("New label");
      label_3.setBounds(235, 163, 46, -31);
      getContentPane().add(label_3);
    
      setVisible(true);
	}

public static void main(String args[] )
{
	new Donar();
	}
}