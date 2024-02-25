import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Donar extends JFrame {

	
	public static void main(String[] args) {
	 new Donar();	
	}

	public Donar() {
		setSize(600,600);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			new select();
			dispose();
			}
		});
		btnNewButton.setBounds(133, 275, 200, 50);
		getContentPane().add(btnNewButton);
		setVisible(true);
			}

}
