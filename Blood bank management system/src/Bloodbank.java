import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Bloodbank extends JFrame {

		public static void main(String[] args) {
	   new Bloodbank();
		}

	public Bloodbank() {
		setSize(700,700);
        getContentPane().setLayout(null);
        
        JButton btnNewButton = new JButton("exit");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	new select();
        	dispose();
        	}
        });
        btnNewButton.setBounds(97, 79, 200, 50);
        getContentPane().add(btnNewButton);
        setVisible(true);
	}

}
