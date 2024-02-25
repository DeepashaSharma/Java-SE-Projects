import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JProgressBar;
import javax.swing.JLabel;


public class Second extends JFrame {
	  JProgressBar jb;
	  int i = 0, num = 0;
	  
		public static void main(String[] args) {
	new Second();
	}
		public void Move() {
		    while (i <= 2000) {
		      jb.setValue(i);
		      i = i + 20;
		       
		        try {
		          Thread.sleep(200);
		        } catch (InterruptedException e) {
		          // TODO Auto-generated catch block
		          e.printStackTrace();
		        }
		       
		    }
		}  
	public Second() {
		getContentPane().setBackground(new Color(153, 255, 102));
  setSize(600,600);
  getContentPane().setLayout(null);
  
  JComboBox comboBox = new JComboBox();
  comboBox.setBounds(143, 357, 259, 28);
  getContentPane().add(comboBox);
  
  JProgressBar progressBar = new JProgressBar();
  progressBar.setBounds(82, 475, 426, 28);
  getContentPane().add(progressBar);
  
  JLabel lblNewLabel = new JLabel("New label");
  lblNewLabel.setBounds(10, 22, 564, 265);
  getContentPane().add(lblNewLabel);
  setVisible(true);
  Move();	
	}
}
