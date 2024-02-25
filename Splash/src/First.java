

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class First extends JFrame{
  JProgressBar jb;
  int i = 0, num = 0;
  public static void main(String[] args) {
    
    new First();
  }
  public void Move() {
    while (i <= 2000) {
      jb.setValue(i);
      i = i + 20;
       
        try {
          Thread.sleep(200);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
       
    }
    new Second();
    dispose();
  }
  First()
  {
  	getContentPane().setBackground(Color.CYAN);
    
    jb = new JProgressBar(0, 2000);
    jb.setForeground(new Color(153, 102, 204));
    jb.setBackground(new Color(255, 255, 51));
    jb.setBounds(159, 323, 264, 30);

    jb.setValue(0);
    jb.setStringPainted(true);

    getContentPane().add(jb);
    setSize(600,600);
    getContentPane().setLayout(null);
    
    JLabel lblMyProjects = new JLabel("MY PROJECTS");
    lblMyProjects.setForeground(Color.BLUE);
    lblMyProjects.setFont(new Font("Times New Roman", Font.PLAIN, 60));
    lblMyProjects.setBounds(108, 198, 410, 50);
    getContentPane().add(lblMyProjects);
    setVisible(true);
    Move();
    
    
  }
}
