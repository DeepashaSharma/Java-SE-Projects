import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Register extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

		public static void main(String[] args) {
			new Register();
	}
	public Register() {
		getContentPane().setBackground(new Color(255, 255, 255));
 setSize(700,700);
 getContentPane().setLayout(null);
 
 JButton btnNewButton = new JButton("Exit\r\n");
 btnNewButton.setFont(new Font("Sitka Small", Font.BOLD, 25));
 btnNewButton.setForeground(new Color(255, 255, 255));
 btnNewButton.setBackground(new Color(153, 0, 0));
 btnNewButton.addActionListener(new ActionListener() {
 	
	public void actionPerformed(ActionEvent arg0) {
 	new B();
 	dispose();
	}
 });
 
 JRadioButton rdbtnAdmin = new JRadioButton("Admin");
 rdbtnAdmin.setForeground(Color.WHITE);
 rdbtnAdmin.setFont(new Font("Sitka Small", Font.BOLD, 16));
 rdbtnAdmin.setBackground(new Color(153, 0, 0));
 rdbtnAdmin.setBounds(546, 97, 88, 23);
 getContentPane().add(rdbtnAdmin);
 btnNewButton.setBounds(399, 582, 132, 41);
 getContentPane().add(btnNewButton);
 
 JLabel lblRegistrationFor = new JLabel("Registration for");
 lblRegistrationFor.setForeground(new Color(255, 255, 255));
 lblRegistrationFor.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
 lblRegistrationFor.setBounds(36, 90, 173, 32);
 getContentPane().add(lblRegistrationFor);
 
 JLabel lblName = new JLabel("Name");
 lblName.setForeground(new Color(255, 255, 255));
 lblName.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
 lblName.setBounds(36, 133, 71, 23);
 getContentPane().add(lblName);
 
 JLabel lblContactNo = new JLabel("Contact no");
 lblContactNo.setForeground(new Color(255, 255, 255));
 lblContactNo.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
 lblContactNo.setBounds(36, 167, 110, 33);
 getContentPane().add(lblContactNo);
 
 JLabel lblAddress = new JLabel("City\r\n");
 lblAddress.setForeground(new Color(255, 255, 255));
 lblAddress.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
 lblAddress.setBounds(36, 211, 46, 32);
 getContentPane().add(lblAddress);
 
 JLabel lblNewLabel = new JLabel("State");
 lblNewLabel.setForeground(new Color(255, 255, 255));
 lblNewLabel.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
 lblNewLabel.setBounds(36, 261, 71, 24);
 getContentPane().add(lblNewLabel);
 
 JLabel lblEmailId = new JLabel("Email Id");
 lblEmailId.setForeground(new Color(255, 255, 255));
 lblEmailId.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
 lblEmailId.setBounds(38, 296, 108, 30);
 getContentPane().add(lblEmailId);
 
 JLabel lblDateOfBirth = new JLabel("Date of Birth");
 lblDateOfBirth.setForeground(new Color(255, 255, 255));
 lblDateOfBirth.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
 lblDateOfBirth.setBounds(36, 341, 140, 22);
 getContentPane().add(lblDateOfBirth);
 
 JLabel lblGender = new JLabel("Gender");
 lblGender.setForeground(new Color(255, 255, 255));
 lblGender.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
 lblGender.setBounds(36, 383, 108, 31);
 getContentPane().add(lblGender);
 
 JLabel lblUserName = new JLabel("User name");
 lblUserName.setForeground(new Color(255, 255, 255));
 lblUserName.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
 lblUserName.setBounds(36, 431, 138, 25);
 getContentPane().add(lblUserName);
 
 JLabel lblPassword = new JLabel("Password");
 lblPassword.setForeground(new Color(255, 255, 255));
 lblPassword.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
 lblPassword.setBounds(38, 481, 108, 29);
 getContentPane().add(lblPassword);
 
 JLabel lblConfirm = new JLabel("Confirm password");
 lblConfirm.setForeground(new Color(255, 255, 255));
 lblConfirm.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
 lblConfirm.setBounds(38, 521, 192, 28);
 getContentPane().add(lblConfirm);
 
 JRadioButton rdbtnNewRadioButton = new JRadioButton("Blood Bank\r\n");
 rdbtnNewRadioButton.setForeground(new Color(255, 255, 255));
 rdbtnNewRadioButton.setBackground(new Color(153, 0, 0));
 rdbtnNewRadioButton.setFont(new Font("Sitka Small", Font.BOLD, 16));
 rdbtnNewRadioButton.setBounds(229, 95, 126, 23);
 getContentPane().add(rdbtnNewRadioButton);
 
 JRadioButton rdbtnDonar = new JRadioButton("Donar");
 rdbtnDonar.setForeground(new Color(255, 255, 255));
 rdbtnDonar.setBackground(new Color(153, 0, 0));
 rdbtnDonar.setFont(new Font("Sitka Small", Font.BOLD, 16));
 rdbtnDonar.setBounds(357, 96, 88, 23);
 getContentPane().add(rdbtnDonar);
 
 JRadioButton rdbtnPatience = new JRadioButton("Patience");
 rdbtnPatience.setForeground(new Color(255, 255, 255));
 rdbtnPatience.setBackground(new Color(153, 0, 0));
 rdbtnPatience.setFont(new Font("Sitka Small", Font.BOLD, 16));
 rdbtnPatience.setBounds(447, 96, 97, 23);
 getContentPane().add(rdbtnPatience);
 
 JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Male");
 rdbtnNewRadioButton_1.setForeground(new Color(255, 255, 255));
 rdbtnNewRadioButton_1.setBackground(new Color(153, 0, 0));
 rdbtnNewRadioButton_1.setFont(new Font("Sitka Small", Font.BOLD, 16));
 rdbtnNewRadioButton_1.setBounds(229, 387, 79, 23);
 getContentPane().add(rdbtnNewRadioButton_1);
 
 JRadioButton rdbtnFemale = new JRadioButton("Female");
 rdbtnFemale.setForeground(new Color(255, 255, 255));
 rdbtnFemale.setBackground(new Color(153, 0, 0));
 rdbtnFemale.setFont(new Font("Sitka Small", Font.BOLD, 16));
 rdbtnFemale.setBounds(310, 387, 97, 23);
 getContentPane().add(rdbtnFemale);
  
 
 JLabel lblNewLabel_1 = new JLabel("Registration Form");
 lblNewLabel_1.setForeground(new Color(255, 255, 255));
 lblNewLabel_1.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 50));
 lblNewLabel_1.setBounds(100, 11, 516, 71);
 getContentPane().add(lblNewLabel_1);
 
 JButton btnNewButton_1 = new JButton("Submit");
 btnNewButton_1.setFont(new Font("Sitka Small", Font.BOLD, 25));
 btnNewButton_1.setForeground(new Color(255, 255, 255));
 btnNewButton_1.setBackground(new Color(153, 0, 0));
 btnNewButton_1.setBounds(158, 582, 148, 41);
 getContentPane().add(btnNewButton_1);
 
 textField = new JTextField();
 textField.setBounds(229, 136, 236, 20);
 getContentPane().add(textField);
 textField.setColumns(10);
 
 textField_1 = new JTextField();
 textField_1.setColumns(10);
 textField_1.setBounds(229, 175, 236, 20);
 getContentPane().add(textField_1);
 
 textField_2 = new JTextField();
 textField_2.setColumns(10);
 textField_2.setBounds(229, 219, 236, 20);
 getContentPane().add(textField_2);
 
 textField_3 = new JTextField();
 textField_3.setColumns(10);
 textField_3.setBounds(229, 262, 236, 20);
 getContentPane().add(textField_3);
 
 textField_4 = new JTextField();
 textField_4.setColumns(10);
 textField_4.setBounds(229, 303, 236, 20);
 getContentPane().add(textField_4);
 
 textField_5 = new JTextField();
 textField_5.setColumns(10);
 textField_5.setBounds(229, 344, 236, 20);
 getContentPane().add(textField_5);
 
 textField_6 = new JTextField();
 textField_6.setColumns(10);
 textField_6.setBounds(229, 435, 236, 20);
 getContentPane().add(textField_6);
 
 textField_7 = new JTextField();
 textField_7.setColumns(10);
 textField_7.setBounds(229, 481, 236, 20);
 getContentPane().add(textField_7);
 
 textField_8 = new JTextField();
 textField_8.setColumns(10);
 textField_8.setBounds(229, 527, 236, 20);
 getContentPane().add(textField_8);
 
 JLabel lblNewLabel_2 = new JLabel(new ImageIcon("E:\\j2se\\javaProjects\\Blood bank management system\\images\\img25.jpg"));
 lblNewLabel_2.setForeground(new Color(255, 255, 255));
 lblNewLabel_2.setBounds(0, 0, 684, 661);
 getContentPane().add(lblNewLabel_2);;
 setVisible(true);
	}
}
