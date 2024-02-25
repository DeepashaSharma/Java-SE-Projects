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


public class event extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	Connection conn;
	Statement stmt;
	private JTextField textField_2;

	public static void main(String[] args) {
		new event();
	}
    public event() {
	
		getContentPane().setBackground(new Color(153, 255, 255));
       setSize(500,500);
       setVisible(true);
       getContentPane().setLayout(null);
       
       JLabel lblNewLabel = new JLabel("EVENT NAME");
       lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 13));
       lblNewLabel.setBounds(35, 50, 101, 20);
       getContentPane().add(lblNewLabel);
       
       JLabel lblNewLabel_1 = new JLabel("CATEGORY");
       lblNewLabel_1.setFont(new Font("Sitka Text", Font.PLAIN, 13));
       lblNewLabel_1.setBounds(35, 95, 77, 14);
       getContentPane().add(lblNewLabel_1);
       
       String category[]={"Birthday","Wedding","Party","Annual funtion","sports","receptions"};
       JComboBox comboBox = new JComboBox(category);
       comboBox.setBounds(185, 92, 161, 20);
       getContentPane().add(comboBox);
       
       JLabel lblDate = new JLabel("DATE");
       lblDate.setFont(new Font("Sitka Text", Font.PLAIN, 13));
       lblDate.setBounds(35, 143, 46, 14);
       getContentPane().add(lblDate);
       
       JLabel lblTime = new JLabel("TIME");
       lblTime.setFont(new Font("Sitka Text", Font.PLAIN, 13));
       lblTime.setBounds(35, 189, 46, 20);
       getContentPane().add(lblTime);
       
       String date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
       JComboBox comboBox_1 = new JComboBox(date);
       comboBox_1.setBounds(185, 140, 62, 20);
       getContentPane().add(comboBox_1);
       
       
       
       JLabel lblMessage = new JLabel("MESSAGE");
       lblMessage.setFont(new Font("Sitka Text", Font.PLAIN, 13));
       lblMessage.setBounds(35, 238, 77, 14);
       getContentPane().add(lblMessage);
       
       final JTextArea textArea = new JTextArea();
       textArea.setBounds(185, 220, 161, 108);
       getContentPane().add(textArea);
       
       JLabel lblSendersNumber = new JLabel("SENDER'S NUMBER");
       lblSendersNumber.setFont(new Font("Sitka Text", Font.PLAIN, 13));
       lblSendersNumber.setBounds(10, 350, 136, 17);
       getContentPane().add(lblSendersNumber);
       
       textField = new JTextField();
       textField.setBounds(185, 348, 161, 20);
       getContentPane().add(textField);
       textField.setColumns(10);
       
       JLabel lblNewLabel_2 = new JLabel("EVENTS");
       lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 25));
       lblNewLabel_2.setBounds(171, 11, 122, 39);
       getContentPane().add(lblNewLabel_2);
       
       JButton btnNewButton = new JButton("ADD");
       btnNewButton.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent arg0) {

			try {
				stmt = conn.createStatement();
			      String sql = "INSERT INTO Event(Event,Time,Sender Name) " +
			                   "VALUES ('"+textField_1.getText()+"','"+textField_2.getText()+"','"+textField.getText()+"');"; 
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
       btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 11));
       btnNewButton.setBounds(22, 408, 86, 42);
       getContentPane().add(btnNewButton);
       
       JButton btnCancel = new JButton("EXIT");
       btnCancel.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent arg0) {
       	dispose();
       	new first();
       	}
       });
       btnCancel.setFont(new Font("Sitka Text", Font.BOLD, 11));
       btnCancel.setBounds(376, 408, 86, 42);
       getContentPane().add(btnCancel);
       
       JButton btnDelete = new JButton("DELETE");
       btnDelete.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent arg0) {
       		textField_1.setText(" ");
       		textField_2.setText(" ");
       		textField.setText(" ");
       	    textArea.setText(" ");
       	}
       });
       btnDelete.setFont(new Font("Sitka Text", Font.BOLD, 11));
       btnDelete.setBounds(198, 408, 86, 42);
       getContentPane().add(btnDelete);
       
       textField_1 = new JTextField();
       textField_1.setBounds(185, 50, 161, 20);
       getContentPane().add(textField_1);
       textField_1.setColumns(10);
       
       String month[]={"jan","feb","march","april","may","june","july","aug","sep","oct","nov","dec"};
       JComboBox comboBox_2 = new JComboBox(month);
       comboBox_2.setBounds(284, 140, 62, 20);
       getContentPane().add(comboBox_2);
       
       textField_2 = new JTextField();
       textField_2.setBounds(181, 189, 165, 20);
       getContentPane().add(textField_2);
       textField_2.setColumns(10);
	}
}
