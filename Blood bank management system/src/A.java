

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class A extends JFrame{
	JProgressBar jb;
	int i = 0, num = 0;
	public static void main(String[] args) {
		
		new A();
	}
	public void Move() {
		while (i <= 2000) {
			jb.setValue(i);
			i = i + 50;
			 
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
		}
		new B();
		dispose();
	}
	A()
	{
		getContentPane().setBackground(new Color(204, 0, 0));
		
		jb = new JProgressBar(0, 2000);
		jb.setToolTipText("");
		jb.setIndeterminate(true);
		jb.setBackground(new Color(204, 204, 204));
		jb.setForeground(new Color(204, 51, 0));
		jb.setBounds(42, 550, 598, 30);

		jb.setValue(0);

		getContentPane().add(jb);
		setSize(700,700);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("E:\\j2se\\javaProjects\\Blood bank management system\\images\\img9.jpg"));
		lblNewLabel_1.setBounds(32, 135, 615, 404);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblWelcome = new JLabel("WELCOME");
		lblWelcome.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 70));
		lblWelcome.setForeground(new Color(255, 255, 255));
		lblWelcome.setBounds(152, 21, 445, 90);
		getContentPane().add(lblWelcome);
		
		setVisible(true);
		Move();
		
		
	}
}
