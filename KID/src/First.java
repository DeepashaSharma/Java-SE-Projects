import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class First extends JFrame {
	public static void main(String[] args) {
       new First();
	}
	public First() {
	getContentPane().setBackground(Color.WHITE);
	setSize(800,700);
	getContentPane().setLayout(null);
	
	JLabel background = new JLabel(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\1.jpg"));
	background.setBounds(124, 49, 506, 602);
	getContentPane().add(background);
	
	JLabel lblNewLabel = new JLabel("              KIDS TUTORIALS");
	lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 40));
	lblNewLabel.setBounds(84, 0, 522, 50);
	getContentPane().add(lblNewLabel);
	
	JButton btnNewButton = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image24.jpg"));
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
		    dispose();
			new Second();
		}
	});
	btnNewButton.setBounds(640, 516, 134, 135);
	getContentPane().add(btnNewButton);
	setVisible(true);
	}
}
