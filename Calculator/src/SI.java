import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class SI extends JFrame {

	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	double simpleinterest,Principle,Rate,Time;	
	private JTextField textField_3;
	public static void main(String[] args) {
		new SI();
		}

	public SI() {
		super("Simple Interest");
		getContentPane().setForeground(new Color(255, 255, 255));
		getContentPane().setBackground(new Color(0, 250, 154));
	setSize(500,500);
	getContentPane().setLayout(null);
	
	JLabel lblNewLabel = new JLabel("   Principle");
	lblNewLabel.setForeground(new Color(255, 0, 255));
	lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
	lblNewLabel.setBounds(72, 82, 118, 26);
	getContentPane().add(lblNewLabel);
	
	JLabel lblRate = new JLabel("    Rate");
	lblRate.setForeground(new Color(255, 0, 255));
	lblRate.setFont(new Font("Times New Roman", Font.BOLD, 20));
	lblRate.setBounds(72, 153, 118, 26);
	getContentPane().add(lblRate);
	
	JLabel lblTime = new JLabel("    Time");
	lblTime.setForeground(new Color(255, 0, 255));
	lblTime.setFont(new Font("Times New Roman", Font.BOLD, 20));
	lblTime.setBounds(72, 224, 118, 26);
	getContentPane().add(lblTime);
	
	textField = new JTextField();
	textField.setBackground(new Color(230, 230, 250));
	textField.setBounds(255, 88, 144, 20);
	getContentPane().add(textField);
	textField.setColumns(10);
	
	textField_1 = new JTextField();
	textField_1.setBackground(new Color(230, 230, 250));
	textField_1.setColumns(10);
	textField_1.setBounds(255, 159, 144, 20);
	getContentPane().add(textField_1);
	
	textField_2 = new JTextField();
	textField_2.setBackground(new Color(230, 230, 250));
	textField_2.setColumns(10);
	textField_2.setBounds(255, 230, 144, 20);
	getContentPane().add(textField_2);
	
	JButton btnNewButton = new JButton("CALCULATE");
	btnNewButton.setBackground(new Color(245, 222, 179));
	btnNewButton.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			try{
		    
	    	if (textField.getText().equals(""))
	    	{
	    		 
				 Rate=Integer.parseInt(textField_1.getText());
		    	 Time=Integer.parseInt(textField_2.getText());
		         simpleinterest=Integer.parseInt(textField_3.getText());
			   Principle = (simpleinterest*100)/Rate*Time;
			   JOptionPane.showMessageDialog(null,"Principle is "+Principle);
			}
			else if (textField_1.getText().equals(""))
			{
				 Principle=Integer.parseInt(textField.getText());
				 
		    	 Time=Integer.parseInt(textField_2.getText());
		         simpleinterest=Integer.parseInt(textField_3.getText());
			   Rate=(simpleinterest*100)/Principle*Time;
			   JOptionPane.showMessageDialog(null,"Rate is "+Rate);
			}
			else if (textField_2.getText().equals(""))
			{
				 Principle=Integer.parseInt(textField.getText());
				 Rate=Integer.parseInt(textField_1.getText());
		    	  
		         simpleinterest=Integer.parseInt(textField_3.getText());
			   Time=(simpleinterest*100)/Principle*Rate;
			   JOptionPane.showMessageDialog(null,"Time is "+Time);
			}
			else
			{
				 Principle=Integer.parseInt(textField.getText());
				 Rate=Integer.parseInt(textField_1.getText());
		    	 Time=Integer.parseInt(textField_2.getText());
		         
				simpleinterest=(Principle*Rate*Time)/100;
				JOptionPane.showMessageDialog(null,"SimpleInterest is "+simpleinterest);
			}
			
			}
			catch(Exception e)
			{
             JOptionPane.showMessageDialog(null,"Please enter some data");				
	
			}
			
		}
	});
	btnNewButton.setBounds(159, 345, 170, 33);
	getContentPane().add(btnNewButton);
	

	
	JLabel lblNewLabel_1 = new JLabel("SimpleInterestCalculator");
	lblNewLabel_1.setForeground(new Color(148, 0, 211));
	lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_1.setFont(new Font("Traditional Arabic", Font.BOLD, 35));
	lblNewLabel_1.setBounds(51, 11, 397, 49);
	getContentPane().add(lblNewLabel_1);
	
	JLabel lblNewLabel_2 = new JLabel("SimpleInt.");
	lblNewLabel_2.setForeground(new Color(255, 0, 255));
	lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
	lblNewLabel_2.setBounds(86, 298, 104, 26);
	getContentPane().add(lblNewLabel_2);
	
	textField_3 = new JTextField();
	textField_3.setBackground(new Color(230, 230, 250));
	textField_3.setBounds(255, 304, 144, 20);
	getContentPane().add(textField_3);
	textField_3.setColumns(10);

	JButton btnNewButton_1 = new JButton("CLEAR");
	btnNewButton_1.setBackground(new Color(245, 222, 179));
	btnNewButton_1.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			textField.setText(" ");
			textField_1.setText(" ");
            textField_2.setText(" ");
            textField_3.setText(" ");
			}
	});
	btnNewButton_1.setBounds(51, 407, 104, 26);
	getContentPane().add(btnNewButton_1);
	
	JButton btnNewButton_2 = new JButton("EXIT");
	btnNewButton_2.setBackground(new Color(245, 222, 179));
	btnNewButton_2.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		dispose();
		}
	});
	btnNewButton_2.setBounds(324, 407, 104, 26);
	getContentPane().add(btnNewButton_2);
	setVisible(true);
	}
}
