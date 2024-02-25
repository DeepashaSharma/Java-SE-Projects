import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class select extends JFrame {

		public static void main(String[] args) {
	    new select();
		}
	public select() {
	setSize(700,700);
	getContentPane().setLayout(null);
	
	JButton btnNewButton = new JButton("Admin\r\n");
	btnNewButton.setFont(new Font("Sitka Small", Font.BOLD, 25));
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		new Admin();
		dispose();
		}
	});
	btnNewButton.setBounds(31, 122, 378, 39);
	getContentPane().add(btnNewButton);
	
	JButton btnNewButton_1 = new JButton("Blood bank");
	btnNewButton_1.setFont(new Font("Sitka Small", Font.BOLD, 25));
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		new Bloodbank();
		dispose();
		}
	});
	btnNewButton_1.setBounds(75, 198, 378, 39);
	getContentPane().add(btnNewButton_1);
	
	JButton btnNewButton_2 = new JButton("Donar");
	btnNewButton_2.setFont(new Font("Sitka Small", Font.BOLD, 25));
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			new Donar();
			dispose();
		}
	});
	btnNewButton_2.setBounds(125, 274, 378, 39);
	getContentPane().add(btnNewButton_2);
	
	JButton btnNewButton_3 = new JButton("Patient");
	btnNewButton_3.setFont(new Font("Sitka Small", Font.BOLD, 25));
	btnNewButton_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		new Patient();
		dispose();
		}
	});
	btnNewButton_3.setBounds(171, 351, 378, 39);
	getContentPane().add(btnNewButton_3);
	
	JButton btnNewButton_4 = new JButton("Exit");
	btnNewButton_4.setFont(new Font("Sitka Small", Font.BOLD, 25));
	btnNewButton_4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		new Login();
		dispose();
		}
	});
	btnNewButton_4.setBounds(223, 428, 378, 39);
	getContentPane().add(btnNewButton_4);
	setVisible(true);
	}
}
