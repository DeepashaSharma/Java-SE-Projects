import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class English extends JFrame {
	public static void main(String[] args) {
	new English();
	}

	public English() {
      setSize(800,700);
      getContentPane().setLayout(null);
      
      JButton btnNewButton = new JButton("ALPHABETS");
      btnNewButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
      	new Alphabets();
      	}
      });
      btnNewButton.setBounds(290, 153, 200, 50);
      getContentPane().add(btnNewButton);
      
      JButton button = new JButton("RHYMES");
      button.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
      	new Rhymes();
      	}
      });
      button.setBounds(290, 276, 200, 50);
      getContentPane().add(button);
      setVisible(true);
	}

}
