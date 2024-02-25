import java.awt.CardLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Rhymes extends JFrame {
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	public static void main(String[] args) {
	new Rhymes();
	}
	public Rhymes() {
  setSize(800,700);
  getContentPane().setLayout(new CardLayout(0, 0));
  
  b1= new JButton(new ImageIcon(""));
  getContentPane().add(b1, "name_504059294517618");
  
  b2 = new JButton("");
  getContentPane().add(b2, "name_504055138616570");
  
  b3 = new JButton("");
  getContentPane().add(b3, "name_504051185233899");
  
  b4 = new JButton("");
  getContentPane().add(b4, "name_504047363533591");
  
  b5 = new JButton("");
  getContentPane().add(b5, "name_504040312354109");
  
  b6 = new JButton("");
  getContentPane().add(b6, "name_504036810639698");
  
  b7 = new JButton("");
  getContentPane().add(b7, "name_504033257870576");
  
  b8 = new JButton("");
  getContentPane().add(b8, "name_504027384285644");
  
  b9 = new JButton("");
  getContentPane().add(b8, "name_504023068622757");
  
  b10 = new JButton("");
  getContentPane().add(b10, "name_504018047607929");
  
  b11 = new JButton("");
  getContentPane().add(b11, "name_504014132301961");
  
  b12 = new JButton("");
  getContentPane().add(b12, "name_504008536319756");
  
  b13 = new JButton("");
  getContentPane().add(b13, "name_504004633716734");
  
  b14 = new JButton("");
  getContentPane().add(b14, "name_504000417129553");
  
  b15 = new JButton("");
  getContentPane().add(b15, "name_503992987747455");
  
  b16 = new JButton("");
  getContentPane().add(b16, "name_503968083815912");
  setVisible(true);
	}

}
