import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class Scene extends JFrame {
	Connection conn;
	JLabel lblNewLabel;
	JButton btnNewButton;
	JButton button;
	JButton button_1;
    JButton button_2 ;
    int questioncount=0;
    String CorrectAnswer="";

		ArrayList<String> questArr=new ArrayList<String>();
		ArrayList<String> Option1Arr=new ArrayList<String>();
		ArrayList<String> Option2Arr=new ArrayList<String>();
		ArrayList<String> Option3Arr=new ArrayList<String>();
		ArrayList<String> Option4Arr=new ArrayList<String>();
		ArrayList<String> AnswerArr=new ArrayList<String>();

		public Scene() {		
		
		conn=Database.dbConnector();
		getContentPane().setBackground(new Color(153, 255, 153));
	    setSize(800,700);
	    getContentPane().setLayout(null);
	
	lblNewLabel = new JLabel("new");
	lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
	lblNewLabel.setBackground(Color.GRAY);
	lblNewLabel.setBounds(30, 148, 744, 89);
	getContentPane().add(lblNewLabel);
	
    btnNewButton = new JButton("New button");
    btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
    btnNewButton.setBackground(new Color(255, 204, 255));
    btnNewButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		if(CorrectAnswer.equals(btnNewButton.getText()))
    		{
    		JOptionPane.showMessageDialog(null,"You are correct");
    		NextRecord();
    		}
    		else
		          {
    			JOptionPane.showMessageDialog(null,"Wrong answer");
    			   	  dispose();
		        	  
		          }
		   
    		}
    
    });
	btnNewButton.setBounds(100, 324, 253, 35);
	getContentPane().add(btnNewButton);
	
    button = new JButton("New button");
    button.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
    button.setBackground(new Color(255, 204, 255));
    button.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		
    		if(CorrectAnswer.equals(button.getText()))
    		{
    		JOptionPane.showMessageDialog(null,"You are correct");
    		NextRecord();
    		}
    		else
		          {
    			JOptionPane.showMessageDialog(null,"Wrong answer");
    			   	  dispose();
		        	  
		          }
	
    	}
    });
	button.setBounds(445, 324, 253, 35);
	getContentPane().add(button);
	
    button_1 = new JButton("New button");
    button_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
    button_1.setBackground(new Color(255, 204, 255));
    button_1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		if(CorrectAnswer.equals(button_1.getText()))
    		{
    		JOptionPane.showMessageDialog(null,"You are correct");
    		NextRecord();
    		}
    		else
		          {
    			JOptionPane.showMessageDialog(null,"Wrong answer");
    			   	  dispose();
		        	  
		          }

    	}
    });
	button_1.setBounds(100, 451, 253, 35);
	getContentPane().add(button_1);
	
    button_2 = new JButton("New button");
    button_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
    button_2.setBackground(new Color(255, 204, 255));
    button_2.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		if(CorrectAnswer.equals(button_2.getText()))
    		{
    		JOptionPane.showMessageDialog(null,"You are correct");
    		NextRecord();
    		}
    		else
		          {
    			JOptionPane.showMessageDialog(null,"Wrong answer");
    			   	  dispose();
		        	  
		          }

    	}
    });
	button_2.setBounds(445, 451, 253, 35);
	getContentPane().add(button_2);
	setVisible(true);
	try
	{
		String query="Select * from Kbc";
		PreparedStatement pst=conn.prepareStatement(query);
		ResultSet res=pst.executeQuery();
		while(res.next())
		{
			questArr.add(res.getString("Question"));
			Option1Arr.add(res.getString("Option1"));
			Option2Arr.add(res.getString("Option2"));
			Option3Arr.add(res.getString("Option3"));
			Option4Arr.add(res.getString("Option4"));
            AnswerArr.add(res.getString("Answer"));
		}
	}
		catch(Exception e)
		{  
			
		}
		NextRecord();
	
	}
public void NextRecord()
{

	if(questioncount==questArr.size())
	{
		JOptionPane.showMessageDialog(null,"End of the quiz");
	    return;
	}
	lblNewLabel.setText(questArr.get(questioncount));
	 btnNewButton .setText(Option1Arr.get(questioncount));
	    button.setText(Option2Arr.get(questioncount));
	    button_1 .setText(Option3Arr.get(questioncount));
	    button_2.setText(Option4Arr.get(questioncount));
   CorrectAnswer=AnswerArr.get(questioncount);
   questioncount++;
   
}
public static void main(String args[])
{
	new Scene();
}
}
