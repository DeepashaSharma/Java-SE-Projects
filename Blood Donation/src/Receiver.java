import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class Receiver extends JFrame {

	public static void main(String[] args) {
	new Receiver();
	}
	public Receiver() {
      setSize(500,500);
      getContentPane().setLayout(null);
      
      JButton btnNewButton = new JButton("SEARCH");
      btnNewButton.setBackground(Color.GREEN);
      btnNewButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
      		try
      		{
      			
      		}
      		catch(Exception e)
      		{
      			
      		}
      	}
      });
      
      JTextArea textArea_1 = new JTextArea();
      textArea_1.setBackground(Color.GREEN);
      textArea_1.setBounds(67, 191, 230, 188);
      getContentPane().add(textArea_1);
      btnNewButton.setBounds(362, 55, 89, 23);
      getContentPane().add(btnNewButton);
      
      String  Blood[]={"A POSITIVE","A NEGATIVE","B POSITIVE","B NEGATIVE","AB POSITIVE","AB NEGATIVE","O POSITIVE","O NEGATIVE"};  
	  JComboBox comboBox = new JComboBox(Blood);
      comboBox.setBackground(Color.CYAN);
      comboBox.setBounds(68, 56, 159, 20);
      getContentPane().add(comboBox);
      
      
      JTextArea textArea = new JTextArea();
      textArea.setBounds(161, 93, -83, 42);
      getContentPane().add(textArea);
      
      JLabel background = new JLabel(new ImageIcon("C:\\j2se\\javaProjects\\BloodDonation\\Images\\bd2.jpg"));
      background.setBounds(0, 0, 484, 461);
      getContentPane().add(background);
      setVisible(true);
	}
}
