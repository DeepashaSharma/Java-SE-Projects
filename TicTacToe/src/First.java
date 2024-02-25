import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Event;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class First
{
  Button b1,b2,b3,b4,b5,b6,b7,b8,b9,replay;
  int a=0;
  String sb1,sb2,sb3,sb4,sb5,sb6,sb7,sb8,sb9;
  First()
  {
    final Frame f = new Frame();
    f.addWindowListener(new WindowAdapter()
    {
      public void windowClosing(WindowEvent we)
      {
        System.exit(0);
      }
    });
    
    b1=new Button();
    b2=new Button();
    b3=new Button();
    b4=new Button();
    b5=new Button();
    b6=new Button();
    b7=new Button();
    b8=new Button();
    b9=new Button();
    replay=new Button();
    
    Font myf=new Font("Courier", Font.BOLD,24);
    
    Label lab = new Label();
    lab.setBounds(80,50,250,30);
    lab.setText("Tic Tac Toe");
    lab.setFont(myf);
    lab.setAlignment(lab.CENTER);
    lab.setForeground(Color.MAGENTA);
    
    b1.setBounds(50,110,80,80);
    b1.setBackground(Color.cyan);
    b1.setFont(myf);
    b1.addActionListener(new ActionListener()
    {
      
      public void actionPerformed(ActionEvent arg0)
      {
        if(a%2==0)
        {
          b1.setLabel("X");
          a++;
        }
        else
        {
          b1.setLabel("O");
          a--;
        }
        //b1.setForeground(Color.BLACK);
        b1.setEnabled(false);
        checkResult(f);
      }
    });
    
    b2.setBounds(160,110,80,80);
    b2.setBackground(Color.cyan);
    b2.setFont(myf);
    b2.addActionListener(new ActionListener()
    {
      
      public void actionPerformed(ActionEvent arg0)
      {
        if(a%2==0)
        {
          b2.setLabel("X");
          a++;
        }
        else
        {
          b2.setLabel("O");
          a--;
        }
        b2.setEnabled(false);
        checkResult(f);
      }
    });
    
    b3.setBounds(270,110,80,80);
    b3.setBackground(Color.cyan);
    b3.setFont(myf);
    b3.addActionListener(new ActionListener()
    {
      
      public void actionPerformed(ActionEvent arg0)
      {
        if(a%2==0)
        {
          b3.setLabel("X");
          a++;
        }
        else
        {
          b3.setLabel("O");
          a--;
        }
        b3.setEnabled(false);
        checkResult(f);
      }
    });

    b4.setBounds(50,220,80,80);
    b4.setBackground(Color.cyan);
    b4.setFont(myf);
    b4.addActionListener(new ActionListener()
    {
      
      public void actionPerformed(ActionEvent arg0)
      {
        if(a%2==0)
        {
          b4.setLabel("X");
          a++;
        }
        else
        {
          b4.setLabel("O");
          a--;
        }
        b4.setEnabled(false);
        checkResult(f);
      }
    });
    
    b5.setBounds(160,220,80,80);
    b5.setBackground(Color.cyan);
    b5.setFont(myf);
    b5.addActionListener(new ActionListener()
    {
      
      public void actionPerformed(ActionEvent arg0)
      {
        if(a%2==0)
        {
          b5.setLabel("X");
          a++;
        }
        else
        {
          b5.setLabel("O");
          a--;
        }
        b5.setEnabled(false);
        checkResult(f);
      }
    });
    
    b6.setBounds(270,220,80,80);
    b6.setBackground(Color.cyan);
    b6.setFont(myf);
    b6.addActionListener(new ActionListener()
    {
      
      public void actionPerformed(ActionEvent arg0)
      {
        if(a%2==0)
        {
          b6.setLabel("X");
          a++;
        }
        else
        {
          b6.setLabel("O");
          a--;
        }
        b6.setEnabled(false);
        checkResult(f);
      }
    });
    
    b7.setBounds(50,330,80,80);
    b7.setBackground(Color.cyan);
    b7.setFont(myf);
    b7.addActionListener(new ActionListener()
    {
      
      public void actionPerformed(ActionEvent arg0)
      {
        if(a%2==0)
        {
          b7.setLabel("X");
          a++;
        }
        else
        {
          b7.setLabel("O");
          a--;
        }
        b7.setEnabled(false);
        checkResult(f);
      }
    });
    
    b8.setBounds(160,330,80,80);
    b8.setBackground(Color.cyan);
    b8.setFont(myf);
    b8.addActionListener(new ActionListener()
    {

      public void actionPerformed(ActionEvent arg0)
      {
        if(a%2==0)
        {
          b8.setLabel("X");
          a++;
        }
        else
        {
          b8.setLabel("O");
          a--;
        }
        b8.setEnabled(false);
        checkResult(f);
      }
    });
    
    b9.setBounds(270,330,80,80);
    b9.setBackground(Color.cyan);
    b9.setFont(myf);
    b9.addActionListener(new ActionListener()
    {
      
      public void actionPerformed(ActionEvent arg0)
      {
        if(a%2==0)
        {
          b9.setLabel("X");
          a++;
        }
        else
        {
          b9.setLabel("O");
          a--;
        }
        b9.setEnabled(false);
        checkResult(f);
      }
    });
    
    replay=new Button("REPLAY");
    replay.setBounds(130,440,140,50);
    replay.setBackground(Color.yellow);
    Font rf=new Font("Courier", Font.ITALIC,24);
    replay.addActionListener(new ActionListener()
    {
      
      public void actionPerformed(ActionEvent arg0)
      {
        b1.setLabel("");  b2.setLabel("");  b3.setLabel("");
        b4.setLabel("");  b5.setLabel("");  b6.setLabel("");
        b7.setLabel("");  b8.setLabel("");  b9.setLabel("");
        
        b1.setEnabled(true);  b2.setEnabled(true);  b3.setEnabled(true);
        b4.setEnabled(true);  b5.setEnabled(true);  b6.setEnabled(true);
        b7.setEnabled(true);  b8.setEnabled(true);  b9.setEnabled(true);
      }
    });
    
    f.add(lab);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(b5);
    f.add(b6);
    f.add(b7);
    f.add(b8);
    f.add(b9);
    f.add(replay);
    f.setSize(400, 560);
    f.setLayout(null);
    f.setVisible(true);
  }
  
  public void checkResult(Frame f)
  {
    sb1=b1.getLabel();  
    sb2=b2.getLabel();  
    sb3=b3.getLabel();
    sb4=b4.getLabel();  
    sb5=b5.getLabel();  
    sb6=b6.getLabel();
    sb7=b7.getLabel();  
    sb8=b8.getLabel();  
    sb9=b9.getLabel();
    
    if(sb1.equals(sb2) && sb1.equalsIgnoreCase(sb3) 
        &&! sb1.equalsIgnoreCase(""))
    {
      JOptionPane.showMessageDialog(null, sb1+" Wins");
    }
    else if(sb1.equalsIgnoreCase(sb5) && sb5.equalsIgnoreCase(sb9) &&! sb1.equalsIgnoreCase(""))
    {
      b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false);
      b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
      b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
      
      AboutDialog aboutDialog = new AboutDialog(f,sb1);
      aboutDialog.setVisible(true);
    }
    else if(sb1.equalsIgnoreCase(sb4) && sb4.equalsIgnoreCase(sb7) &&! sb1.equalsIgnoreCase(""))
    {
      b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false);
      b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
      b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
      
      AboutDialog aboutDialog = new AboutDialog(f,sb1);
      aboutDialog.setVisible(true);
    }
    else if(sb2.equalsIgnoreCase(sb5) && sb5.equalsIgnoreCase(sb8) &&! sb2.equalsIgnoreCase(""))
    {
      b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false);
      b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
      b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
      
      AboutDialog aboutDialog = new AboutDialog(f,sb2);
      aboutDialog.setVisible(true);
    }
    else if(sb3.equalsIgnoreCase(sb6) && sb6.equalsIgnoreCase(sb9) &&! sb3.equalsIgnoreCase(""))
    {
      b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false);
      b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
      b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
      
      AboutDialog aboutDialog = new AboutDialog(f,sb3);
      aboutDialog.setVisible(true);
    }
    else if(sb3.equalsIgnoreCase(sb5) && sb5.equalsIgnoreCase(sb7) &&! sb3.equalsIgnoreCase(""))
    {
      b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false);
      b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
      b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
      
      AboutDialog aboutDialog = new AboutDialog(f,sb3);
      aboutDialog.setVisible(true);
    }
    else if(sb4.equalsIgnoreCase(sb5) && sb5.equalsIgnoreCase(sb6) &&! sb4.equalsIgnoreCase(""))
    {
      b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false);
      b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
      b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
      
      AboutDialog aboutDialog = new AboutDialog(f,sb4);
      aboutDialog.setVisible(true);
    }
    else if(sb7.equalsIgnoreCase(sb8) && sb8.equalsIgnoreCase(sb9) &&! sb7.equalsIgnoreCase(""))
    {
      b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false);
      b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);
      b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);
      
      AboutDialog aboutDialog = new AboutDialog(f,sb7);
      aboutDialog.setVisible(true);
    }
  }
  
  public static void main(String[] args)
  {
    First t = new First();
  }
  
  class AboutDialog extends Dialog
  {
    String rslt;
        public AboutDialog(Frame parent, String str)
        {
         super(parent, true);
         rslt=str;
           setBackground(Color.gray);
           setLayout(new BorderLayout());
           Panel panel = new Panel();
           panel.add(new Button("Close"));
           add("South", panel);
           setSize(200,200);

           addWindowListener(new WindowAdapter()
           {
              public void windowClosing(WindowEvent windowEvent)
              {
                 dispose();
              }
           });
        }

        public boolean action(Event evt, Object arg)
        {
           if(arg.equals("Close"))
           {
              dispose();
              return true;
           }
           return false;
        }

        public void paint(Graphics g)
        {
           g.setColor(Color.white);
           g.drawString("Player: "+rslt+" wins.", 25,70 );
        }
  }
}