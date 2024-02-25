import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;


public class Alphabets extends JFrame {
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26;
	public static void main(String[] args) {
	
		new Alphabets();
	}
	public Alphabets() {
    setSize(800,700);
    getContentPane().setLayout(new CardLayout(0, 0));
    
    b1 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(1).jpg"));
    b1.setBackground(new Color(173, 255, 47));
    b1.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    	    b1.setVisible(false);
    	    b2.setVisible(true);
    	    }
    });
    getContentPane().add(b1, "name_450527497483561");
    
    b2 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(2).jpg"));
    b2.setBackground(new Color(0, 206, 209));
    b2.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b2.setVisible(false);
    	    b3.setVisible(true);
    	   }
    });
    getContentPane().add(b2, "name_450523573725818");
    
    b3 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(3).jpg"));
    b3.setBackground(new Color(255, 228, 225));
    b3.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b3.setVisible(false);
    	    b4.setVisible(true);
    	    }
    });
    getContentPane().add(b3, "name_450518333111361");
    
    b4 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(4).jpg"));
    b4.setBackground(Color.PINK);
    b4.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b4.setVisible(false);
    	    b5.setVisible(true);
    	    }
    });
    getContentPane().add(b4, "name_450512064648064");
    
    b5 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(5).jpg"));
    b5.setBackground(new Color(173, 255, 47));
    b5.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b5.setVisible(false);
    	    b6.setVisible(true);
    	    }
    });
    getContentPane().add(b5, "name_450507515080436");
    
    b6 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(6).jpg"));
    b6.setBackground(new Color(32, 178, 170));
    b6.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b6.setVisible(false);
    	    b7.setVisible(true);
    	    }
    });
    getContentPane().add(b6, "name_450503364894722");
    
    b7 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(7).jpg"));
    b7.setBackground(new Color(64, 224, 208));
    b7.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b7.setVisible(false);
    	    b8.setVisible(true);
    	    }
    });
    getContentPane().add(b7, "name_450493084252608");
    
    b8 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(8).jpg"));
    b8.setBackground(new Color(135, 206, 250));
    b8.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b8.setVisible(false);
    	    b9.setVisible(true);
    	    }
    });
    getContentPane().add(b8, "name_450486278068252");
    
    b9 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(9).jpg"));
    b9.setBackground(new Color(218, 112, 214));
    b9.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b9.setVisible(false);
    	    b10.setVisible(true);
    	    }
    });
    getContentPane().add(b9, "name_450472665931120");
    
    b10 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(10).jpg"));
    b10.setBackground(new Color(0, 139, 139));
    b10.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b10.setVisible(false);
    	    b11.setVisible(true);
    	    }
    });
    getContentPane().add(b10, "name_450466175708343");
    
    b11 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(11).jpg"));
    b11.setBackground(new Color(30, 144, 255));
    b11.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b11.setVisible(false);
    	    b12.setVisible(true);
    	    }
    });
    getContentPane().add(b11, "name_450420647532217");
    
    b12 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(12).jpg"));
    b12.setBackground(new Color(64, 224, 208));
    b12.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b12.setVisible(false);
    	    b13.setVisible(true);
    	    }
    });
    getContentPane().add(b12, "name_450416632661857");
    
    b13 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(13).jpg"));
    b13.setBackground(new Color(173, 255, 47));
    b13.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b13.setVisible(false);
    	    b14.setVisible(true);
    	    }
    });
    getContentPane().add(b13, "name_450412808541287");
    
    b14 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(14).jpg"));
    b14.setBackground(new Color(154, 205, 50));
    b14.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b14.setVisible(false);
    	    b15.setVisible(true);
    	    }
    });
    getContentPane().add(b14, "name_450409034982492");
    
    b15 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(15).jpg"));
    b15.setBackground(new Color(75, 0, 130));
    b15.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b15.setVisible(false);
    	    b16.setVisible(true);
    	    }
    });
    getContentPane().add(b15, "name_450404922417879");
    
    b16 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(16).jpg"));
    b16.setBackground(new Color(255, 182, 193));
    b16.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b16.setVisible(false);
    	    b17.setVisible(true);
    	    }
    });
    getContentPane().add(b16, "name_450400183784861");
    
    b17 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(17).jpg"));
    b17.setBackground(new Color(255, 228, 181));
    b17.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b17.setVisible(false);
    	    b18.setVisible(true);
    	    }
    });
    getContentPane().add(b17, "name_450392061085965");
    
    b18 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(18).jpg"));
    b18.setBackground(new Color(64, 224, 208));
    b18.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b18.setVisible(false);
    	    b19.setVisible(true);
    	    }
    });
    getContentPane().add(b18, "name_450388728115442");
    
    b19 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(19).jpg"));
    b19.setBackground(new Color(154, 205, 50));
    b19.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b19.setVisible(false);
    	    b20.setVisible(true);
    	    }
    });
    getContentPane().add(b19, "name_450385142789761");
    
    b20 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(20).jpg"));
    b20.setBackground(new Color(0, 206, 209));
    b20.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b20.setVisible(false);
    	    b21.setVisible(true);
    	    }
    });
    getContentPane().add(b20, "name_450381468673421");
    
    b21 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(21).jpg"));
    b21.setBackground(new Color(0, 191, 255));
    b21.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b21.setVisible(false);
    	    b22.setVisible(true);
    	    }
    });
    getContentPane().add(b21, "name_450375717484912");
    
    b22 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(22).jpg"));
    b22.setBackground(new Color(72, 209, 204));
    b22.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b22.setVisible(false);
    	    b23.setVisible(true);
    	    }
    });
    getContentPane().add(b22, "name_450361828385920");
    
    b23 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(23).jpg"));
    b23.setBackground(new Color(72, 209, 204));
    b23.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b23.setVisible(false);
    	    b24.setVisible(true);
    	    }
    });
    getContentPane().add(b23, "name_450354858331754");
    
    b24 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(24).jpg"));
    b24.setBackground(new Color(72, 209, 204));
    b24.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b24.setVisible(false);
    	    b25.setVisible(true);
    	    }
    });
    getContentPane().add(b24, "name_450350230226377");
    
    b25 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(25).jpg"));
    b25.setBackground(new Color(32, 178, 170));
    b25.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b25.setVisible(false);
    	    b26.setVisible(true);
    	    }
    });
    getContentPane().add(b25, "name_450343222475491");
    
    b26 = new JButton(new ImageIcon("E:\\j2se\\javaProjects\\KID\\Images\\image(26).jpg"));
    b26.setBackground(new Color(64, 224, 208));
    b26.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent arg0) {
    		b26.setVisible(false);
    	    dispose();
    	    new English();
    	    }
    });
    getContentPane().add(b26, "name_450275763426402");
       setVisible(true);
	}

}
