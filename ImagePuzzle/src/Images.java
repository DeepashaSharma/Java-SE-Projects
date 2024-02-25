import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
public class Images extends JFrame implements ActionListener {
	 JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, sample, start;
	 Icon starts;
	  Icon ic0 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\starB0.jpg");
	  Icon ic1 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\1.jpg");
	  Icon ic2 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\5.jpg");
	  Icon ic3 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\2.jpg");
	  Icon ic4 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\7.jpg");
	  Icon ic5 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\4.jpg");
	  Icon ic6 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\6.jpg");
	  Icon ic7 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\8.jpg");
	  Icon ic8 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\9.jpg");
	  Icon ic9 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\3.jpg");
	  Icon samicon1 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\main.jpg");
	  

	  Icon ic20 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\starB20.jpg");
	  Icon ic21 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\24.jpg");
	  Icon ic22 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\25.jpg");
	  Icon ic23 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\21.jpg");
	  Icon ic24 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\27.jpg");
	  Icon ic25 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\23.jpg");
	  Icon ic26 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\29.jpg");
	  Icon ic27 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\28.jpg");
	  Icon ic28 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\22.jpg");
	  Icon ic29 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\26.jpg");
	  Icon samicon3 = new ImageIcon("E:\\j2se\\javaProjects\\ImagePuzzle\\Images\\main3.jpg");
	public static void main(String[] args) {
	  new Images();
	}
	public Images() {
		getContentPane().setBackground(new Color(255, 204, 255));
     setSize(747,546);
     setVisible(true);
     getContentPane().setLayout(null);
     
     b1 = new JButton(ic1);
     b1.setBackground(new Color(255, 255, 255));
     b1.setBounds(10, 148, 100, 100);
     getContentPane().add(b1);
     b2 = new JButton(ic2);
     b2.setBounds(109, 148, 100, 100);
     getContentPane().add(b2);
     b3 = new JButton(ic3);
     b3.setBounds(209, 148, 100, 100);
     getContentPane().add(b3);
     b4 = new JButton(ic4);
     b4.setBounds(10, 248, 100, 100);
     getContentPane().add(b4);
     b5 = new JButton(ic5);
     b5.setBounds(109, 248, 100, 100);
     getContentPane().add(b5);
     b6 = new JButton(ic6);
     b6.setBounds(209, 248, 100, 100);
     getContentPane().add(b6);
     b7 = new JButton(ic7);
     b7.setBounds(10, 348, 100, 100);
     getContentPane().add(b7);
     b8 = new JButton(ic8);
     b8.setBounds(109, 348, 100, 100);
     getContentPane().add(b8);
     b9 = new JButton(ic9);
     b9.setBounds(209, 348, 100, 100);
     getContentPane().add(b9);
     sample = new JButton(samicon1);
     sample.setBounds(410, 205, 213, 215);
     getContentPane().add(sample);
     start = new JButton(ic0);
     start.setBounds(547, 35, 47, 49);
     getContentPane().add(start);
     
     JLabel lblNewLabel = new JLabel("Puzzle");
     lblNewLabel.setForeground(new Color(102, 51, 102));
     lblNewLabel.setFont(new Font("Sitka Small", Font.ITALIC, 20));
     lblNewLabel.setBounds(109, 459, 100, 24);
     getContentPane().add(lblNewLabel);
     
     JLabel lblNewLabel_1 = new JLabel("This Icon has power to swap with neighbour icon");
     lblNewLabel_1.setForeground(new Color(0, 51, 51));
     lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 24));
     lblNewLabel_1.setBounds(37, 35, 500, 35);
     getContentPane().add(lblNewLabel_1);
     
     JLabel lblNewLabel_2 = new JLabel("Sample");
     lblNewLabel_2.setForeground(new Color(102, 0, 153));
     lblNewLabel_2.setFont(new Font("Sitka Small", Font.ITALIC, 20));
     lblNewLabel_2.setBounds(475, 170, 82, 24);
     getContentPane().add(lblNewLabel_2);
     
     JLabel lblNewLabel_3 = new JLabel("Click sample picture to next puzzle");
     lblNewLabel_3.setFont(new Font("Sitka Small", Font.ITALIC, 20));
     lblNewLabel_3.setBounds(297, 472, 387, 24);
     getContentPane().add(lblNewLabel_3);
    starts=b9.getIcon();
     b1.addActionListener(this); b2.addActionListener(this);  
     b3.addActionListener(this); b4.addActionListener(this);   
     b5.addActionListener(this); b6.addActionListener(this);  
     b7.addActionListener(this); b8.addActionListener(this);  
     b9.addActionListener(this);   
    sample.addActionListener(this);  

	}
	 public void actionPerformed(ActionEvent e) {
		    if (e.getSource() == b1) {
		      Icon s1 = b1.getIcon();
		      if (b2.getIcon() == starts) {
		        b2.setIcon(s1);
		        b1.setIcon(starts);
		      } else if (b4.getIcon() == starts) {
		        b4.setIcon(s1);
		        b1.setIcon(starts);
		      }
		    }// 
		    if (e.getSource() == b2) {
		        Icon s1 = b2.getIcon();
		        if (b1.getIcon() == starts) {
		          b1.setIcon(s1);
		          b2.setIcon(starts);
		      } else if (b5.getIcon() == starts) {
		          b5.setIcon(s1);
		          b2.setIcon(starts);
		        } else if (b3.getIcon() == starts) {
		          b3.setIcon(s1);
		          b2.setIcon(starts);
		        }
		      }// end of if

		      if (e.getSource() == b3) {
		        Icon s1 = b3.getIcon();
		        if (b2.getIcon() == starts) {
		          b2.setIcon(s1);
		          b3.setIcon(starts);
		        } else if (b6.getIcon() == starts) {
		          b6.setIcon(s1);
		          b3.setIcon(starts);
		        }
		      }// end of if

		      if (e.getSource() == b4) {
		        Icon s1 = b4.getIcon();
		        if (b1.getIcon() == starts) {
		          b1.setIcon(s1);
		          b4.setIcon(starts);
		        } else if (b5.getIcon() == starts) {
		          b5.setIcon(s1);
		          b4.setIcon(starts);
		        } else if (b7.getIcon() == starts) {
		          b7.setIcon(s1);
		          b4.setIcon(starts);
		        }
		      }// end of if

		      if (e.getSource() == b5) {
		        Icon s1 = b5.getIcon();
		        if (b2.getIcon() == starts) {
		          b2.setIcon(s1);
		          b5.setIcon(starts);
		        } else if (b4.getIcon() == starts) {
		          b4.setIcon(s1);
		          b5.setIcon(starts);
		        } else if (b6.getIcon() == starts) {
		          b6.setIcon(s1);
		          b5.setIcon(starts);
		        } else if (b8.getIcon() == starts) {
		          b8.setIcon(s1);
		          b5.setIcon(starts);
		        }
		      }// end of if

		      if (e.getSource() == b6) {
		        Icon s1 = b6.getIcon();
		        if (b3.getIcon() == starts) {
		          b3.setIcon(s1);
		          b6.setIcon(starts);
		        } else if (b5.getIcon() == starts) {
		          b5.setIcon(s1);
		          b6.setIcon(starts);
		        } else if (b9.getIcon() == starts) {
		          b9.setIcon(s1);
		          b6.setIcon(starts);
		        }
		      }// end of if

		      if (e.getSource() == b7) {
		        Icon s1 = b7.getIcon();
		        if (b4.getIcon() == starts) {
		          b4.setIcon(s1);
		          b7.setIcon(starts);
		        } else if (b8.getIcon() == starts) {
		          b8.setIcon(s1);
		          b7.setIcon(starts);
		        }
		      }// end of if

		      if (e.getSource() == b8) {
		        Icon s1 = b8.getIcon();
		        if (b7.getIcon() == starts) {
		          b7.setIcon(s1);
		          b8.setIcon(starts);
		        } else if (b5.getIcon() == starts) {
		          b5.setIcon(s1);
		          b8.setIcon(starts);
		        } else if (b9.getIcon() == starts) {
		          b9.setIcon(s1);
		          b8.setIcon(starts);
		        }

		      }// end of if

		      if (e.getSource() == b9) {
		        Icon s1 = b9.getIcon();
		        if (b8.getIcon() == starts) {
		          b8.setIcon(s1);
		          b9.setIcon(starts);
		        } else if (b6.getIcon() == starts) {
		          b6.setIcon(s1);
		          b9.setIcon(starts);
		     

		      }
		    }// end of actionPer

		      if (e.getSource() == sample) {
		        Icon s1 = sample.getIcon();
		        if (s1 == samicon3) {
		          sample.setIcon(samicon1);
		          b1.setIcon(ic1);
		          b2.setIcon(ic2);
		          b3.setIcon(ic3);
		          b4.setIcon(ic4);
		          b5.setIcon(ic5);
		          b6.setIcon(ic6);
		          b7.setIcon(ic7);
		          b8.setIcon(ic8);
		          b9.setIcon(ic9);
		          starts = b9.getIcon();
		          start.setIcon(ic9);
		        }
		        
		        else {
		          sample.setIcon(samicon3);
		          b1.setIcon(ic21);
		          b2.setIcon(ic22);
		          b3.setIcon(ic23);
		          b4.setIcon(ic24);
		          b5.setIcon(ic25);
		          b6.setIcon(ic26);
		          b7.setIcon(ic27);
		          b8.setIcon(ic28);
		          b9.setIcon(ic29);
		          starts = b6.getIcon();
		          start.setIcon(ic20);
		        }

		      }
	 }
	 }
