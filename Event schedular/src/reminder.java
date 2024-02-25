import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class reminder extends JFrame {
	
	JPanel panel_1,panel;
	private JTextField textField;
	private JButton btnNewaButton;
	private JButton btnNewButton_1;
	private JTextArea textArea;
	Connection conn;
	Statement stmt;
	public static void main(String[] args) {
			new reminder();
	}

	public reminder() {
	
	getContentPane().setBackground(new Color(255, 204, 255));
	setSize(500,500);
	setVisible(true);
	getContentPane().setLayout(null);
	
	JButton btnNewButton = new JButton("CATEGORY");
	btnNewButton.setFont(new Font("Sitka Text", Font.BOLD, 11));
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			panel_1.setVisible(false);
			panel.setVisible(true);
		}
	});
	btnNewButton.setBounds(10, 59, 174, 51);
	getContentPane().add(btnNewButton);
	
	JLabel lblNewLabel = new JLabel("REMINDER");
	lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 25));
	lblNewLabel.setBounds(173, 11, 174, 24);
	getContentPane().add(lblNewLabel);
	
	JButton btnCategoryList = new JButton("CATEGORY LIST");
	btnCategoryList.setFont(new Font("Sitka Text", Font.BOLD, 11));
	btnCategoryList.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		
			panel_1.setVisible(true);
			panel.setVisible(false);
	
		}
	});
	btnCategoryList.setBounds(227, 59, 198, 51);
	getContentPane().add(btnCategoryList);
	
    panel = new JPanel();
	panel.setBackground(new Color(0, 255, 204));
	panel.setBounds(68, 115, 306, 78);
	getContentPane().add(panel);
	
	textField = new JTextField();
	panel.add(textField);
	textField.setColumns(20);
	
	
	btnNewaButton = new JButton("ADD");
	btnNewaButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		
			try {
				stmt = conn.createStatement();
			      String sql = "INSERT INTO Reminder(remind) " +
			                   "VALUES ('"+textField.getText()+"');"; 
			      stmt.executeUpdate(sql);
			      stmt.close();
			      conn.commit();
			      conn.close();
			      dispose();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			textArea.setText(textField.getText());
		}
	});
	btnNewaButton.setFont(new Font("Sitka Text", Font.BOLD, 11));
	btnNewaButton.setVerticalAlignment(SwingConstants.BOTTOM);
	panel.add(btnNewaButton);
	panel.setVisible(false);
	
	panel_1 = new JPanel();
	panel_1.setBackground(new Color(255, 255, 102));
	panel_1.setBounds(100, 204, 247, 246);
	getContentPane().add(panel_1);
	
	textArea = new JTextArea();
	textArea.setColumns(20);
	textArea.setRows(8);
	panel_1.add(textArea);
	
	btnNewButton_1 = new JButton("EXIT");
	btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		    dispose();
			new first();
		}
	});
	btnNewButton_1.setBounds(375, 399, 99, 51);
	getContentPane().add(btnNewButton_1);
	panel_1.setVisible(false);
	}
}
