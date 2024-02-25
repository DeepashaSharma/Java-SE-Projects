import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class tasks extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	Connection conn;
	Statement stmt;
	public static void main(String[] args) {
	new tasks();
	}
	public tasks() {
	
		getContentPane().setBackground(new Color(204, 255, 153));
    setSize(500,500);
    getContentPane().setLayout(null);
    
    JLabel lblNewLabel = new JLabel("TASK NAME");
    lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 13));
    lblNewLabel.setBounds(26, 50, 89, 14);
    getContentPane().add(lblNewLabel);
    
    textField = new JTextField();
    textField.setBounds(155, 47, 155, 20);
    getContentPane().add(textField);
    textField.setColumns(10);
    
    JLabel lblNewLabel_1 = new JLabel("CATEGORY");
    lblNewLabel_1.setFont(new Font("Sitka Text", Font.PLAIN, 13));
    lblNewLabel_1.setBounds(26, 92, 106, 14);
    getContentPane().add(lblNewLabel_1);
    
    JLabel lblNewLabel_2 = new JLabel("DATE");
    lblNewLabel_2.setFont(new Font("Sitka Text", Font.PLAIN, 13));
    lblNewLabel_2.setBounds(26, 141, 54, 14);
    getContentPane().add(lblNewLabel_2);
    
    String date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    JComboBox comboBox_1 = new JComboBox(date);
    comboBox_1.setBounds(155, 138, 54, 20);
    getContentPane().add(comboBox_1);
    
    JLabel lblNewLabel_4 = new JLabel("MEETING");
    lblNewLabel_4.setFont(new Font("Sitka Text", Font.PLAIN, 13));
    lblNewLabel_4.setBounds(26, 259, 108, 14);
    getContentPane().add(lblNewLabel_4);
    
    final JTextArea textArea = new JTextArea();
    textArea.setBounds(161, 254, 160, 105);
    getContentPane().add(textArea);
    
    JButton btnNewButton = new JButton("ADD");
    btnNewButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		try {
				stmt = conn.createStatement();
			      String sql = "INSERT INTO Tasks(Task name,Category,Time,Meeting) " +
			                   "VALUES ('"+textField.getText()+"','"+textField_1.getText()+"','"+textField_2.getText()+"','"+textArea.getText()+"');"; 
			      stmt.executeUpdate(sql);
			      stmt.close();
			      conn.commit();
			      conn.close();
			      dispose();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
    	
    	}
    });
    btnNewButton.setBounds(30, 380, 85, 48);
    getContentPane().add(btnNewButton);
    
    JButton btnNewButton_2 = new JButton("DELETE");
    btnNewButton_2.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		textField.setText("");
    		textField_1.setText(" ");
    		textField_2.setText(" ");
    		textArea.setText(" ");
    	}
    });
    btnNewButton_2.setBounds(188, 380, 89, 48);
    getContentPane().add(btnNewButton_2);
    
    JButton btnNewButton_3 = new JButton("EXIT");
    btnNewButton_3.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    	dispose();
    	new first();
    	}
    });
    btnNewButton_3.setBounds(349, 380, 89, 48);
    getContentPane().add(btnNewButton_3);
    
    JLabel lblNewLabel_5 = new JLabel("TASKS");
    lblNewLabel_5.setFont(new Font("Sitka Text", Font.BOLD, 25));
    lblNewLabel_5.setBounds(192, 0, 85, 42);
    getContentPane().add(lblNewLabel_5);
    
    textField_1 = new JTextField();
    textField_1.setBounds(156, 89, 154, 20);
    getContentPane().add(textField_1);
    textField_1.setColumns(10);
    
    String month[]={"jan","feb","march","april","may","june","july","aug","sep","oct","nov","dec"};
    JComboBox comboBox = new JComboBox(month);
    comboBox.setBounds(254, 138, 56, 20);
    getContentPane().add(comboBox);
    
    JLabel lblTime = new JLabel("TIME");
    lblTime.setFont(new Font("Sitka Text", Font.PLAIN, 13));
    lblTime.setBounds(26, 195, 46, 14);
    getContentPane().add(lblTime);
    
    textField_2 = new JTextField();
    textField_2.setBounds(155, 189, 155, 20);
    getContentPane().add(textField_2);
    textField_2.setColumns(10);
    setVisible(true);
	}
}
