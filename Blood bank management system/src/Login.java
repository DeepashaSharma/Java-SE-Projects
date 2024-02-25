import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;


public class Login extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

		public static void main(String[] args) {
	 new Login();
		}
	public Login() {
		getContentPane().setBackground(new Color(204, 51, 51));
      setSize(700,700);
      getContentPane().setLayout(null);
      
      JButton btnNewButton = new JButton("Exit\r\n");
      btnNewButton.setForeground(new Color(255, 255, 255));
      btnNewButton.setFont(new Font("Sitka Small", Font.BOLD, 25));
      btnNewButton.setBackground(new Color(204, 51, 51));
      btnNewButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
      	new B();
      	dispose();
      	}
      });
      btnNewButton.setBounds(394, 427, 143, 38);
      getContentPane().add(btnNewButton);
      
      JLabel lblLogin = new JLabel("Login");
      lblLogin.setForeground(new Color(255, 255, 255));
      lblLogin.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 50));
      lblLogin.setBounds(271, 34, 164, 66);
      getContentPane().add(lblLogin);
      
      JLabel lblUsername = new JLabel("Username");
      lblUsername.setForeground(new Color(255, 255, 255));
      lblUsername.setFont(new Font("Sitka Subheading", Font.BOLD, 30));
      lblUsername.setBounds(120, 175, 168, 25);
      getContentPane().add(lblUsername);
      
      JLabel lblPassword = new JLabel("Password");
      lblPassword.setForeground(new Color(255, 255, 255));
      lblPassword.setFont(new Font("Sitka Subheading", Font.BOLD, 30));
      lblPassword.setBounds(120, 271, 143, 38);
      getContentPane().add(lblPassword);
      
      JButton btnNewButton_1 = new JButton("Login\r\n");
      btnNewButton_1.setForeground(new Color(255, 255, 255));
      btnNewButton_1.setFont(new Font("Sitka Small", Font.BOLD, 25));
      btnNewButton_1.setBackground(new Color(204, 51, 51));
      btnNewButton_1.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
      		new select();
      		dispose();
      	}
      });
      btnNewButton_1.setBounds(162, 427, 143, 38);
      getContentPane().add(btnNewButton_1);
      
      textField = new JTextField();
      textField.setBounds(306, 173, 247, 27);
      getContentPane().add(textField);
      textField.setColumns(10);
      
      textField_1 = new JTextField();
      textField_1.setColumns(10);
      textField_1.setBounds(306, 281, 247, 27);
      getContentPane().add(textField_1);
      
      JLabel lblNewLabel = new JLabel(new ImageIcon("E:\\j2se\\javaProjects\\Blood bank management system\\images\\img45.jpg"));
      lblNewLabel.setForeground(new Color(204, 0, 0));
      lblNewLabel.setBounds(53, 120, 582, 426);
      getContentPane().add(lblNewLabel);
      setVisible(true);
	}
}
