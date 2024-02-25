import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;


public class BMI extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

		public static void main(String[] args) {
	      new BMI();
	}

	
	public BMI() {
		super("BMI Calculator");
		getContentPane().setForeground(new Color(255, 255, 0));
		getContentPane().setBackground(new Color(255, 240, 245));
	setSize(500,500);
	getContentPane().setLayout(null);
	
	textField = new JTextField();
	textField.setForeground(new Color(0, 0, 0));
	textField.setBackground(new Color(240, 248, 255));
	textField.setBounds(220, 124, 186, 24);
	getContentPane().add(textField);
	textField.setColumns(10);
	
	JLabel lblNewLabel = new JLabel("    Weight");
	lblNewLabel.setForeground(new Color(34, 139, 34));
	lblNewLabel.setFont(new Font("Sitka Display", Font.ITALIC, 25));
	lblNewLabel.setBounds(143, 66, 145, 20);
	getContentPane().add(lblNewLabel);
	
	JLabel lblNewLabel_1 = new JLabel("     KG");
	lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblNewLabel_1.setForeground(new Color(255, 0, 255));
	lblNewLabel_1.setBounds(62, 127, 74, 14);
	getContentPane().add(lblNewLabel_1);
	
	JLabel label = new JLabel("");
	label.setBounds(52, 116, 46, 14);
	getContentPane().add(label);
	
	JLabel lblHeight = new JLabel("     Height");
	lblHeight.setForeground(new Color(34, 139, 34));
	lblHeight.setFont(new Font("Sitka Display", Font.ITALIC, 25));
	lblHeight.setBounds(128, 191, 106, 20);
	getContentPane().add(lblHeight);
	
	JLabel lblFeet = new JLabel("    Feet");
	lblFeet.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblFeet.setForeground(new Color(255, 0, 255));
	lblFeet.setBounds(70, 236, 74, 24);
	getContentPane().add(lblFeet);
	
	JLabel lblInches = new JLabel("  Inches");
	lblInches.setFont(new Font("Tahoma", Font.PLAIN, 20));
	lblInches.setForeground(new Color(255, 0, 255));
	lblInches.setBounds(80, 309, 106, 17);
	getContentPane().add(lblInches);
	
	textField_1 = new JTextField();
	textField_1.setBackground(new Color(240, 255, 255));
	textField_1.setColumns(10);
	textField_1.setBounds(220, 238, 186, 24);
	getContentPane().add(textField_1);
	
	textField_2 = new JTextField();
	textField_2.setBackground(new Color(240, 255, 255));
	textField_2.setColumns(10);
	textField_2.setBounds(220, 307, 186, 24);
	getContentPane().add(textField_2);
	
	JButton btnNewButton = new JButton("CALCULATE");
	btnNewButton.setBackground(new Color(230, 230, 250));
	btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			int KG=Integer.parseInt(textField.getText());
			int Feet=Integer.parseInt(textField_1.getText());
			int Inches=Integer.parseInt(textField_2.getText());
	
			double weight=KG*2.204;
			double height=Feet*12+Inches;
			double BMI=(weight*703)/(height*height);
			if(BMI<40)
			JOptionPane.showMessageDialog(null," U R UNDER WEIGHT UR BMI is "+BMI);
			else if(BMI>60)
		    JOptionPane.showMessageDialog(null,"U R OVERWEIGHT UR BMI IS "+BMI);
			else
				JOptionPane.showMessageDialog(null,"U R HEALTHY UR BMI IS "+BMI);
		}
	});
	btnNewButton.setBounds(160, 364, 170, 33);
	getContentPane().add(btnNewButton);
	
	JLabel lblNewLabel_3 = new JLabel("       BMI CALCULATOR");
	lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_3.setForeground(new Color(148, 0, 211));
	lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 26));
	lblNewLabel_3.setBounds(61, 11, 301, 23);
	getContentPane().add(lblNewLabel_3);
	
	JButton btnNewButton_1 = new JButton("EXIT");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		dispose();
		}
	});
	btnNewButton_1.setBackground(new Color(230, 230, 250));
	btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
	btnNewButton_1.setBounds(317, 415, 86, 26);
	getContentPane().add(btnNewButton_1);
	
	JButton btnNewButton_2 = new JButton("CLEAR");
	btnNewButton_2.setBackground(new Color(230, 230, 250));
	btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
	btnNewButton_2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			textField.setText(" ");
			textField_1.setText(" ");
			textField_2.setText(" ");
		}
	});
	btnNewButton_2.setBounds(62, 416, 103, 24);
	getContentPane().add(btnNewButton_2);
	setVisible(true);
	}
}
