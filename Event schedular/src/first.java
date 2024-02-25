import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;


public class first extends JFrame {

		public static void main(String[] args) {
			new first();
		
	}

	public first() {
		getContentPane().setBackground(new Color(153, 255, 204));
 setSize(500,500);
 setVisible(true);
 getContentPane().setLayout(null);
 
 JButton btnNewButton_1 = new JButton(" REMINDER");
 btnNewButton_1.setBackground(new Color(153, 204, 255));
 btnNewButton_1.setFont(new Font("Sitka Text", Font.BOLD, 14));
 btnNewButton_1.addActionListener(new ActionListener() {
 	public void actionPerformed(ActionEvent arg0) {
 		dispose();
 		new reminder();
 	}
 });
 btnNewButton_1.setBounds(46, 79, 126, 95);
 getContentPane().add(btnNewButton_1);
 
 JButton btnNewButton = new JButton("EVENT");
 btnNewButton.setBackground(new Color(153, 204, 255));
 btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 14));
 btnNewButton.addActionListener(new ActionListener() {
 	public void actionPerformed(ActionEvent arg0) {
 	    dispose();
 		new event();
 	}
 });
 btnNewButton.setBounds(172, 205, 126, 95);
 getContentPane().add(btnNewButton);
 
 JButton btnNewButton_2 = new JButton("TASKS");
 btnNewButton_2.setBackground(new Color(153, 204, 255));
 btnNewButton_2.setFont(new Font("Sitka Text", Font.BOLD, 14));
 btnNewButton_2.addActionListener(new ActionListener() {
 	public void actionPerformed(ActionEvent arg0) {
 	    dispose();
 		new tasks();
 	}
 });
 btnNewButton_2.setBounds(297, 336, 126, 95);
 getContentPane().add(btnNewButton_2);
 
 JLabel lblGreetingRemin = new JLabel("Greeting Reminder");
 lblGreetingRemin.setFont(new Font("Sitka Heading", Font.BOLD, 24));
 lblGreetingRemin.setBounds(145, 11, 227, 40);
 getContentPane().add(lblGreetingRemin);
	}
}
