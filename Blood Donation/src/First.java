import java.sql.Connection;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;


public class First extends JFrame {
     Connection conn;
	public static void main(String[] args) {
	new First();
	}

	public First() {
		//conn=database.dbConnector();
       setSize(400,400);
       getContentPane().setLayout(null);
       
       JButton btnNewButton = new JButton("DONAR");
       btnNewButton.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent arg0) {
          new Donar();  
       	}
       });
       btnNewButton.setBackground(new Color(0, 255, 255));
       btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
       btnNewButton.setBounds(80, 74, 230, 23);
       getContentPane().add(btnNewButton);
       
       JButton btnNewButton_2 = new JButton("BLOOD BANK");
       btnNewButton_2.setBackground(Color.CYAN);
       btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
       btnNewButton_2.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent arg0) {
       	}
       });
       btnNewButton_2.setBounds(80, 226, 230, 23);
       getContentPane().add(btnNewButton_2);
       
       JButton btnNewButton_1 = new JButton("RECEIVER");
       btnNewButton_1.setBackground(Color.CYAN);
       btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
       btnNewButton_1.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent arg0) {
           new Receiver();       	}
       });
       btnNewButton_1.setBounds(80, 147, 230, 23);
       getContentPane().add(btnNewButton_1);
       
       JLabel background = new JLabel(new ImageIcon("C:\\j2se\\javaProjects\\BloodDonation\\Images\\bd5.jpg"));
       background.setBackground(Color.WHITE);
       background.setBounds(0, 0, 384, 361);
       getContentPane().add(background);
       setVisible(true);
       }
}
