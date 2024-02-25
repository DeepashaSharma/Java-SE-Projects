

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class V {
   public static void main(String args[]){  
     try {
      Desktop.getDesktop().open(new File("E:\\j2se\\javaProjects\\Vedio\\Vedio\\ANJAAN ANJAANI = TUJHE BHULA DIYA II_HD_SARB - www.ilovesarbtech.blogspot.com.mp4"));
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }  

    

      } 
}
