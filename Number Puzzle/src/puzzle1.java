
import java.awt.*;  
import javax.swing.*;  
import java.awt.event.*;  
 class puzzle1 extends JFrame implements ActionListener{  
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,next;  
puzzle1(){  
super("Puzzle");  
getContentPane().setBackground(new Color(216, 191, 216));
 b1=new JButton("1");  
 b1.setBackground(new Color(144, 238, 144));
 b1.setFont(new Font("Times New Roman", Font.BOLD, 25));
 b2=new JButton(" ");  
 b2.setBackground(new Color(144, 238, 144));
 b2.setFont(new Font("Times New Roman", Font.BOLD, 25));
 b3=new JButton("3");  
 b3.setBackground(new Color(144, 238, 144));
 b3.setFont(new Font("Times New Roman", Font.BOLD, 25));
 b4=new JButton("4");  
 b4.setBackground(new Color(144, 238, 144));
 b4.setFont(new Font("Times New Roman", Font.BOLD, 25));
 b5=new JButton("5");  
 b5.setBackground(new Color(144, 238, 144));
 b5.setFont(new Font("Times New Roman", Font.BOLD, 25));
 b6=new JButton("6");  
 b6.setBackground(new Color(144, 238, 144));
 b6.setFont(new Font("Times New Roman", Font.BOLD, 25));
 b7=new JButton("7");  
 b7.setBackground(new Color(144, 238, 144));
 b7.setFont(new Font("Times New Roman", Font.BOLD, 25));
 b8=new JButton("8");  
 b8.setBackground(new Color(144, 238, 144));
 b8.setFont(new Font("Times New Roman", Font.BOLD, 25));
 b9=new JButton("2");  
 b9.setBackground(new Color(144, 238, 144));
 b9.setFont(new Font("Times New Roman", Font.BOLD, 25));
 next=new JButton("NEXT");  
 next.setFont(new Font("Times New Roman", Font.BOLD, 25));
  
b1.setBounds(46,38,80,51);  
b2.setBounds(162,38,80,51);  
b3.setBounds(275,38,76,51);  
b4.setBounds(46,116,80,51);  
b5.setBounds(162,116,80,51);  
b6.setBounds(271,116,80,51);  
b7.setBounds(46,195,80,51);  
b8.setBounds(162,195,80,51);  
b9.setBounds(271,195,80,51);  
next.setBounds(111,293,169,40);  
    
getContentPane().add(b1);getContentPane().add(b2);getContentPane().add(b3);getContentPane().add(b4);getContentPane().add(b5);getContentPane().add(b6);getContentPane().add(b7);getContentPane().add(b8);getContentPane().add(b9); getContentPane().add(next);  
b1.addActionListener(this);  
b2.addActionListener(this);  
b3.addActionListener(this);  
b4.addActionListener(this);  
b5.addActionListener(this);  
b6.addActionListener(this);  
b7.addActionListener(this);  
b8.addActionListener(this);  
b9.addActionListener(this);  
next.addActionListener(this);  
  
next.setBackground(new Color(255, 192, 203));  
next.setForeground(new Color(139, 0, 139));  
setSize(400,400);  
getContentPane().setLayout(null);  
setVisible(true);  
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
}//end of constructor  
  
public void actionPerformed(ActionEvent e){  
if(e.getSource()==next){  
String s=b4.getText();  
b4.setText(b9.getText());  
b9.setText(s);  
s=b1.getText();  
b1.setText(b5.getText());  
b5.setText(s);  
s=b2.getText();  
b2.setText(b7.getText());  
b7.setText(s);  
}  
 if(e.getSource()==b1){  
String s=b1.getText();  
if(b2.getText().equals(" ")){
	b2.setText(s);
	b1.setText(" ");
	}  
else if(b4.getText().equals(" ")){ 
	b4.setText(s);
	b1.setText(" ");
	}  
 }//end of if  
  
if(e.getSource()==b3){  
String s=b3.getText();  
if(b2.getText().equals(" ")){
	b2.setText(s); 
	b3.setText(" ");
	}  
else if(b6.getText().equals(" ")){
	b6.setText(s); 
	b3.setText(" ");
	}  
 }//end of if  
  
if(e.getSource()==b2){  
String s=b2.getText();  
if(b1.getText().equals(" ")){
	b1.setText(s);
	b2.setText(" ");
	}  
else if(b3.getText().equals(" ")){
	b3.setText(s);
	b2.setText(" ");
	}  
else if(b5.getText().equals(" ")){ 
	b5.setText(s);
	b2.setText(" ");
	}  
 }//end of if  
  
if(e.getSource()==b4){  
String s=b4.getText();  
if(b1.getText().equals(" ")){
	b1.setText(s);
	b4.setText(" ");
	}  
else if(b7.getText().equals(" ")){
	b7.setText(s);
	b4.setText(" ");
	}  
else if(b5.getText().equals(" ")){
	b5.setText(s);
	b4.setText(" ");
	}  
 }//end of if  
  
if(e.getSource()==b5){  
String s=b5.getText();  
if(b2.getText().equals(" ")){
	b2.setText(s);
	b5.setText(" ");
	}  
else if(b4.getText().equals(" ")){
	b4.setText(s);
	b5.setText(" ");
	}  
else if(b6.getText().equals(" ")){
	b6.setText(s);
	b5.setText(" ");
	}  
else if(b8.getText().equals(" ")){
	b8.setText(s);
	b5.setText(" ");
	}  
 }//end of if  
  
if(e.getSource()==b6){  
  
String s=b6.getText();  
if(b9.getText().equals(" ")){
	b9.setText(s);
	b6.setText(" ");
	}  
else if(b3.getText().equals(" ")){
	b3.setText(s);
	b6.setText(" ");
	}  
else if(b5.getText().equals(" ")){
	b5.setText(s);
	b6.setText(" ");
	}  
  
 }//end of if  
  
if(e.getSource()==b7){  
String s=b7.getText();  
if(b4.getText().equals(" ")){ 
	b4.setText(s); 
	b7.setText(" ");
	}  
else if(b8.getText().equals(" ")){
	b8.setText(s);
	b7.setText(" ");
	}  
  
 }//end of if  
  
if(e.getSource()==b8){  
String s=b8.getText();  
if(b7.getText().equals(" ")){
	b7.setText(s);
	b8.setText(" ");
	}  
else if(b9.getText().equals(" ")){
	b9.setText(s);
	b8.setText(" ");
	}  
else if(b5.getText().equals(" ")){
	b5.setText(s);
	b8.setText(" ");
	}  
  
 }//end of if  
  
if(e.getSource()==b9){  
String s=b9.getText();  
if(b6.getText().equals(" ")){
	b6.setText(s);
	b9.setText(" ");
	}  
else if(b8.getText().equals(" ")){ 
	b8.setText(s);
	b9.setText(" ");
	}  
if(b1.getText().equals("1")&&b2.getText().equals("2")&&b3.getText()  
.equals("3")&&b4.getText().equals("4")&&b5.getText().equals("5")  
&&b6.getText().equals("6")&&b7.getText().equals("7")&&b8.getText()  
.equals("8")&&b9.getText().equals(" ")){   
JOptionPane.showMessageDialog(puzzle1.this,"!!!you won!!!");  
}  
 }//end of if  
  
}//end of actionPerformed  
   
  
public static void main(String[] args){  
new puzzle1();  
}//end of main  
  
}//end of class  
