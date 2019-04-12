import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

class Pixel {
   BufferedImage image;
   int width;
   int height;
   
   public Pixel() {
      try {
         File input = new File("input.png");
         image = ImageIO.read(input);
         width = image.getWidth();
         height = image.getHeight();
         
         
         double cf = 0;
         double mf = 0;
         double yk = 0;


         try (PrintWriter writer = new PrintWriter(new File("hasilgambar.csv"))) {
         StringBuilder sb = new StringBuilder();
            for(int i=0; i<height; i++) {
            
               for(int j=0; j<width; j++) {
               
                  
                  Color c = new Color(image.getRGB(j, i));

                  sb.append("[" + c.getRed() + "." + c.getGreen() + "." + c.getBlue()+ "]");

                  
                  
                  sb.append(',');
                     
               }
               sb.append('\n');
            }
            writer.write(sb.toString());
            System.out.println("RGB beres");
         } catch (FileNotFoundException e) {
                     System.out.println(e.getMessage());

         }


    

          
         catch (FileNotFoundException e) {
                     System.out.println(e.getMessage());
         }






      } catch (Exception e) {}
   }
   

   static public void main(String args[]) throws Exception {
      Pixel obj = new Pixel();
   }


}
