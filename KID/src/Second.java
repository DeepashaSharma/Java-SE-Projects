import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


public class Second extends JFrame {
	public static void main(String[] args) {
	new Second();
	}

	public Second() {
		getContentPane().setBackground(new Color(255, 240, 245));
     setSize(800,700);
     getContentPane().setLayout(null);
     
     JLabel background= new JLabel(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image21.jpg"));
     background.setBounds(468, 37, 206, 251);
     getContentPane().add(background);
     
     JButton b1 = new JButton("ENGLISH");
     b1.setFont(new Font("Sylfaen", Font.PLAIN, 25));
     b1.setBackground(new Color(245, 245, 245));
     b1.addActionListener(new ActionListener() {
     	public void actionPerformed(ActionEvent arg0) {
            dispose();     	
     		new English();
     	}
     });
     b1.setBounds(49, 81, 221, 123);
     getContentPane().add(b1);
     
     JButton b2 = new JButton("HINDI");
     b2.setFont(new Font("Sylfaen", Font.PLAIN, 25));
     b2.setBackground(new Color(245, 245, 245));
     b2.addActionListener(new ActionListener() {
     	public void actionPerformed(ActionEvent arg0) {
     	    dispose();
     		new Hindi();
     	}
     });
     b2.setBounds(177, 289, 221, 123);
     getContentPane().add(b2);
     
     JButton b3 = new JButton("MATHS");
     b3.setFont(new Font("Sylfaen", Font.PLAIN, 25));
     b3.setBackground(new Color(245, 245, 245));
     b3.addActionListener(new ActionListener() {
     	public void actionPerformed(ActionEvent arg0) {
     	    dispose();
     		new Maths();
     	}
     });
     b3.setBounds(379, 490, 221, 123);
     getContentPane().add(b3);
     setVisible(true);
	}

}
