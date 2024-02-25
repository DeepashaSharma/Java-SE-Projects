import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.regex.*;
class IDE  implements ActionListener
{
	int i=0;
	File fo;
	 	String pr=null;
	int stat,end;
	Pattern p;
	Matcher m;
	String cutstr,ts;
	String fname,name,all ;
	File path;
	String filename,line;
	JFileChooser chooser = new JFileChooser("H:\\Nupur-JAVA\\GUI");	
	JFrame f=new JFrame();
	JFrame f1=new JFrame();
	JFrame f2=new JFrame();
	JTextField tf=new JTextField(10);
	JButton b1=new JButton("OK");
	JButton b2=new JButton("CANCEL");
	JButton but=new JButton("repAll");
	JLabel lab1=new JLabel("enter the String");
	JLabel lab2=new JLabel("replaced by");
	JTextField text1=new JTextField(10);
	JTextField text2=new JTextField(10);
	JPanel p1=new JPanel();
	TextArea ta2=new TextArea();
	//JTextArea ta3=new JTextArea();
	JButton but3=new JButton("Find Next");
	JButton but4=new JButton("rep");
	JLabel l=new JLabel("Find the string");
	Icon ic=new ImageIcon("wel.jpg");
	JLabel la=new JLabel(ic,JLabel.CENTER);
	Font font = new Font("Verdana", Font.BOLD, 12);
	JSplitPane jpp;
		JMenuBar mb;
		JMenu m1,m2,m3;
		int start=0,fstIndex=0,lastIndex=0;
		JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mie;
	JPanel p2=new JPanel();
	JPanel p3=new JPanel();   
		JTextArea ta[]=new JTextArea[10];
			JTabbedPane jt;
  ScrollPane sp[]=new ScrollPane[10];
  ScrollPane sp1;
	    	public IDE()
	{  
		f.setSize(1200,1200);
		f.setVisible(true);
		//p1.add()
		
		mb =new JMenuBar();
		m1=new JMenu("file");
		m2=new JMenu("edit");
		m3=new JMenu("Build");
		mi1=new JMenuItem("new");
		mi2=new JMenuItem("open");
		mi3=new JMenuItem("save");
		mi4=new JMenuItem("exit");
		mi5=new JMenuItem("cut");
		mi6=new JMenuItem("copy");
		mi7=new JMenuItem("paste");
		mi8=new JMenuItem("find");
		mi9=new JMenuItem("replaceAll");
		mi10=new JMenuItem("complie");
		mi11=new JMenuItem("Run");
		mie=new JMenuItem("EXIT EDITOR");
		m1.add(mi1);m1.add(mi2);m1.add(mi3);m1.add(mi4);m1.add(mie);
		m2.add(mi5);m2.add(mi6);m2.add(mi7);m2.add(mi8);m2.add(mi9);
		m3.add(mi10);m3.add(mi11);
		mb.add(m1);mb.add(m2);mb.add(m3);
		f.add(mb,"North");
		 		 
		 	sp1=new ScrollPane();
            jt=new JTabbedPane(JTabbedPane.TOP);
		    for(int i=0;i<10;i++)
			{
		 	ta[i]=new JTextArea();
		    ta[i].setFont(font);
            ta[i].setForeground(Color.BLUE);
			}
		 	jt.setPreferredSize(new Dimension(1350,500));

		//sp1.add(ta2);
		jt.setMinimumSize((new Dimension(150,150)));
		for(int i=0;i<10;i++)
			sp[i]=new ScrollPane();
             ta[i].add(la);
      	 	sp[i].add(ta[i]);
     	    jt.addTab("WelCome",la);
     	    jt.setBackground(Color.white);
   	 	     	//	p1.add(jt);
		jpp=new JSplitPane(JSplitPane.VERTICAL_SPLIT,true,jt,ta2);
		f.add(jpp);
		mi1.addActionListener(this);mi2.addActionListener(this);mi3.addActionListener(this);mi4.addActionListener(this);mi5.addActionListener(this);
		mi10.addActionListener(this);mi9.addActionListener(this);mi8.addActionListener(this);mi7.addActionListener(this);mi6.addActionListener(this);
	    mi11.addActionListener(this);b1.addActionListener(this);b2.addActionListener(this);but.addActionListener(this);mie.addActionListener(this);
	    but3.addActionListener(this);but4.addActionListener(this);
	    f1.setSize(300,100);
	    tf=new JTextField(10);
	    f1.setLayout(new GridBagLayout());
	    GridBagConstraints gbc=new GridBagConstraints();
	    gbc.gridx=0;gbc.gridy=0;
	    f1.add(l,gbc);
	     gbc.gridx=10;gbc.gridy=0;
	    f1.add(tf,gbc);
	     gbc.gridx=0;gbc.gridy=30;
	    f1.add(b1,gbc);
	    gbc.gridx=10;gbc.gridy=30;
	    f1.add(b2,gbc);
	    
	    
	    f2.setSize(400,130);
	    f2.setLayout(new GridBagLayout());
	    GridBagConstraints gbc1=new GridBagConstraints();
	    gbc1.gridx=0;gbc1.gridy=0;
	    f2.add(lab1,gbc1);
	     gbc1.gridx=10;gbc1.gridy=0;
	    f2.add(text1,gbc1);
	     gbc1.gridx=0;gbc1.gridy=20;
	    f2.add(lab2,gbc1);
	    gbc1.gridx=10;gbc1.gridy=20;
	    f2.add(text2,gbc1);
	     
	    gbc.gridx=0;gbc.gridy=60;
	    f2.add(but,gbc);
	    gbc.gridx=30;gbc.gridy=60;
	    f2.add(but3,gbc);
	    gbc.gridx=60;gbc.gridy=60;
	    f2.add(but4,gbc);
	    
	    
	    
	    
ta2.setEnabled(false);
	    
	}
	public void actionPerformed(ActionEvent ae)
	{
	
		String str=ae.getActionCommand();
				if(str.equals("new"))
		{
		
			try{
			i++;
			String st1="";  
            		
			int ret = chooser.showSaveDialog(f);
			//String filename = JOptionPane.showInputDialog(f,
              //          "Please enter the file name", null);
			String filename = chooser.getSelectedFile().getPath();			
			System.out.println("File Name = "+filename);			
		    if(filename!=null && ret == JFileChooser.APPROVE_OPTION) 
		    {
		    	sp[i].add(ta[i]);
	      	jt.addTab(filename,sp[i]);
			try
	      {
			 // int i1=0;
              FileOutputStream fos;
	          File f=new File(filename) ;
              fos=new FileOutputStream(f);
         /*     while(i1<st1.length())
			{
				fos.write(st1.charAt(i1));
				i1++;
			}		*/
				fos.close();

    }
    catch(Exception e2){
    }
		    }
	      		jt.setSelectedComponent((ScrollPane)sp[i]);
           path=chooser.getCurrentDirectory();
          System.out.println("           "+path);
/*if (ret == JFileChooser.APPROVE_OPTION) 
{          
              FileOutputStream fos;
	      fo=new File(path,filename) ;
              fos=new FileOutputStream(fo);
              fos.close();
             System.out.println("        "+filename+"   "+jt.getTitleAt(jt.getSelectedIndex()));
		}*/
			}
		catch(Exception e2){
    }
		}
          
		
		if(str.equals("open"))
		{
		
		try{
			i++;
			String st1="";  
            int ch;		
			int ret = chooser.showOpenDialog(f);
			String filename = chooser.getSelectedFile().getName();			
			System.out.println("File Name = "+filename);			
		    if(filename!=null) 
		    {
		    sp[i].add(ta[i]);	
	      	jt.addTab(filename,sp[i]);
		    }
	      	jt.setSelectedComponent((ScrollPane)sp[i]);
           path=chooser.getCurrentDirectory();
          System.out.println("           "+path);
if (ret == JFileChooser.APPROVE_OPTION) 
{
   System.out.println("jjjjjjjjjjjjjjjjj  "+path);
   fo=new File(path,filename);
   FileInputStream fis=new FileInputStream(fo);
   while((ch=fis.read())!=-1)
			{ 
				char c=(char)ch;
				 st1+=(""+c);
				 
			} 
			ta[i].setText(st1);
			fis.close();
			
   	}
   	
		}
   	catch(Exception e)
   	{
   	}
   		}
	if(str.equals("save"))
			{
			 String st1=ta[i].getText();  int i1=0;
              FileDialog fd=new FileDialog(f,"Save",FileDialog.SAVE);
	      fd.setVisible(true);
	      try
	      {
	      filename=fd.getFile(); 
	     String path=fd.getDirectory();
              FileOutputStream fos;
	      File f=new File(path,filename) ;
              fos=new FileOutputStream(f);
              while(i1<st1.length())
			{
				fos.write(st1.charAt(i1));
				i1++;
			}		
				fos.close();

    }
    catch(Exception e2){
    }
}
		if(str.equals("exit"))
		{
			try{
			String st=ta[i].getText();
			    int i1=0;
				FileOutputStream fos=new FileOutputStream(fo);
			while(i1<st.length())
			{
				fos.write(st.charAt(i1));
				i1++;
			}		
			 fos.close();
			}
			 catch(Exception e)
			 {
			 }
		  
			
			
			
			
			jt.removeTabAt(jt.getSelectedIndex());
			if(jt.getSelectedIndex()<0)
			System.exit(1);
		}
		if(str.equals("EXIT EDITOR"))
		{
			f.setVisible(false);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		System.out.println("hi");
		}
		
		if(str.equals("cut"))
			ta[i].cut();
		
		if(str.equals("copy"))
			ta[i].copy();
		if(str.equals("paste"))
		ta[i].paste();
		if(str.equals("find"))
			f1.setVisible(true);
		
		if(str.equals("OK"))
		{
		 i=jt.getSelectedIndex();	
		 all=ta[i].getText();
		 System.out.println(all);
		 ts = tf.getText();
		Pattern p = Pattern.compile(ts);
		String alll=all.replaceAll("\r","");
		Matcher m = p.matcher(alll);
		
	//	while(m.find())
	//	{			
			if(ts.equals(pr)) {System.out.println("Start bit was not set");}
			else
				{
				start = 0;}
			if(m.find(start)==true)
			{
			
			System.out.println("Output - "+"\t"+m.start()+"\t"+m.end()+"\t"+m.group());
			start=m.end();
			pr=ts;
			fstIndex=m.start();
			lastIndex=m.end();
			ta[i].setText(alll);
			ta[i].select(m.start(),m.end());
			
			}
	}
       if(str.equals("CANCEL"))
       {
       	  f1.setVisible(false);
       	  start=0;
       }
       if(str.equals("replaceAll"))
		{
			f2.setVisible(true);
		}
		if(str.equals("repAll"))
		{
			i=jt.getSelectedIndex();
			String s12,s22,st2;
           int j=0;
	   st2=ta[i].getText();          
           s12=text1.getText();
           s22=text2.getText();
	   st2=st2.replaceAll(s12,s22);
	   ta[i].setText(st2);
	   f2.setVisible(false);
		}
		if(str.equals("rep"))
		{
			i=jt.getSelectedIndex();
			String s13,s23,st3;
		    st3=ta[i].getText();          
           s13=text1.getText();
           s23=text2.getText();
           st3=st3.replaceFirst(s13,s23);
           ta[i].setText(st3);
	  
		}
		if(str.equals("Find Next"))
		{
			i=jt.getSelectedIndex();
			all=ta[i].getText();
		 String alll=all.replaceAll("\r","");
		 //System.out.println();
		String ts = text1.getText();
		Pattern p = Pattern.compile(ts);
		Matcher m = p.matcher(alll);
			
			if(ts.equals(pr)) {System.out.println("Start bit was not set");}
			else
				{
				start = 0;}
			if(m.find(start)==true)
			{
			
			System.out.println("Output - "+"\t"+m.start()+"\t"+m.end()+"\t"+m.group());
			start=m.end();
			pr=ts;
			
			fstIndex=m.start();
			lastIndex=m.end();
			ta[i].setText(alll);
			ta[i].select(m.start(),m.end());
			
		
		}
		}
		
		if(str.equals("complie"))
		{
			filename=jt.getTitleAt(jt.getSelectedIndex());
			ta2.setEnabled(true);
			try{
			String st=ta[i].getText();
			//System.out.println("File compiled is "+);
			    int i1=0;
				FileOutputStream fos=new FileOutputStream(filename);
			while(i1<st.length())
			{
				fos.write(st.charAt(i1));
				i1++;
			}		
			 fos.close();
		  
}
catch(IOException e1){}
	
	 System.out.println("Comile Path "+filename);
	       try {  
               Process p = Runtime.getRuntime().exec("cmd /c javac "+filename);  
               BufferedReader in = new BufferedReader(  
                                   new InputStreamReader(p.getErrorStream()));
                 ta2.setText("Process Complete");
                                     
               line = null;
               while ((line = in.readLine()) != null) {  
                ta2.appendText(line);
        
	       }
	       	       }
            catch (Throwable er) {
            	System.out.println("hi");    
               er.printStackTrace();
           }
           ta2.setEnabled(false);  
      }  		
		
		if(str.equals("Run"))
		{
			
			
			ta2.setEnabled(true);
			try{
			String st=ta[i].getText();
			    int i1=0;
				FileOutputStream fos=new FileOutputStream(fo);
			while(i1<st.length())
			{
				fos.write(st.charAt(i1));
				i1++;
			}		
			 fos.close();
		  
}
catch(IOException e1){}
	filename=jt.getTitleAt(jt.getSelectedIndex());
	       try {  
               Process p = Runtime.getRuntime().exec("cmd /c javac "+filename);  
               BufferedReader in = new BufferedReader(  
                                   new InputStreamReader(p.getErrorStream()));
                 ta2.setText("Process Complete");
                                     
                line = null;
               while ((line = in.readLine()) != null) {  
                    ta2.appendText(line);

                }
	       }
            catch (Throwable er) {
            	System.out.println("hi");    
               er.printStackTrace();
           }
           ta2.setEnabled(false);
			 
		   	
			
			
			final String s=filename.replace(".java","");
			final File p = new File(s);
			final String fname=p.getName();
			final String runPath=filename.replace(fname,"");
			
		   	System.out.println("sssssssssss "+s);
			
		   	class demo extends Thread
		   	{
				
		   		public void run()
		   		{
		   			try{
						Process pPath = Runtime.getRuntime().exec("cmd /c cd "+runPath);
                Process p = Runtime.getRuntime().exec("cmd /c start cmd /k java "+fname);  
               BufferedReader in = new BufferedReader(  
                                   new InputStreamReader(p.getInputStream()));
                                     
                line = null;  
               while ((line = in.readLine()) != null) {  
                   ta2.appendText(line);  
               } 
		   	}
            catch (IOException e) {  
               e.printStackTrace();  
           }
		   		
		   	}
		   	}
           ta2.setEnabled(false);	
           	demo dod=new demo();
		   	dod.start();
			
		}
	}
	public static void main(String args[])
	{
		SwingUtilities.invokeLater(new Runnable() {
            public void run() {
               IDE id=new IDE();
            }
        });
		
		
	}
	
}