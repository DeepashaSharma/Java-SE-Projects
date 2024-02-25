import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.Icon;
import java.awt.Font;


public class B extends JFrame {

		public static void main(String[] args) {
			new B();
	}

	public B() {
		getContentPane().setBackground(new Color(255, 255, 255));
		setSize(700,700);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Register\r\n");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
		btnNewButton.setBackground(new Color(178, 34, 34));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			new Register();
			dispose();
			}
			
		});
		btnNewButton.setBounds(210, 282, 232, 34);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(178, 34, 34));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			new Login();
			dispose();
			}
		});
		
		btnNewButton_1.setBounds(210, 327, 232, 34);
		getContentPane().add(btnNewButton_1);
		
		JLabel label = new JLabel(new ImageIcon("E:\\j2se\\javaProjects\\Blood bank management system\\images\\img12.jpg"));
		label.setBounds(10, 130, 190, 243);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel(new ImageIcon("E:\\j2se\\javaProjects\\Blood bank management system\\images\\img12.jpg"));
		label_1.setBounds(484, 237, 190, 243);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel(new ImageIcon("E:\\j2se\\javaProjects\\Blood bank management system\\images\\img13.jpg"));
		label_2.setBounds(201, 437, 259, 213);
		getContentPane().add(label_2);
		
		JButton btnA = new JButton("Inquiry");
		btnA.setForeground(new Color(255, 255, 255));
		btnA.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
		btnA.setBackground(new Color(178, 34, 34));
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnA.setBounds(210, 237, 232, 34);
		getContentPane().add(btnA);
		
		JButton btnAboutUs = new JButton("About Us");
		btnAboutUs.setForeground(new Color(255, 255, 255));
		btnAboutUs.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
		btnAboutUs.setBackground(new Color(178, 34, 34));
		btnAboutUs.setBounds(210, 189, 232, 34);
		getContentPane().add(btnAboutUs);
		
		JButton btnHome = new JButton("Home");
		btnHome.setFont(new Font("Sitka Subheading", Font.BOLD, 22));
		btnHome.setForeground(new Color(255, 255, 255));
		btnHome.setBackground(new Color(178, 34, 34));
		btnHome.setBounds(210, 144, 232, 34);
		getContentPane().add(btnHome);
		
		JLabel lblNewLabel = new JLabel(new ImageIcon("E:\\j2se\\javaProjects\\Blood bank management system\\images\\i3.jpg"));
		lblNewLabel.setBounds(0, 0, 349, 104);
		getContentPane().add(lblNewLabel);
		
		JLabel label_3 = new JLabel(new ImageIcon("E:\\j2se\\javaProjects\\Blood bank management system\\images\\i3.jpg"));
		label_3.setBounds(343, 0, 341, 104);
		getContentPane().add(label_3);
		setVisible(true);
	}
}
