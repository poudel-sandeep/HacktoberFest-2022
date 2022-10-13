//Program for DDA line drawing algorithm
package DDA;

import java.awt.*;
import java.math.*;
import javax.swing.*;

class mydrawing extends JComponent
{
   public void paint(Graphics g)
   {
       double xc, yc, dx,dy,step;   //xc-->xincrement, yc-->yincrement
       double x,y;                  //x,y-->point to be plotted

      int x1=200,x2=50,y1=60,y2=200;    //step 2
       dx=x2-x1;                        //difference of x
       dy=y2-y1;                        //difference of y  //step2

       if(Math.abs(dx)>Math.abs(dy))    //step-3
            step=Math.abs(dx);
       else
            step=Math.abs(dy);
       xc=dx/step;  
       yc=dy/step;  //step-4
       x=x1;
       y=y1;
       g.setColor(Color.RED);
       g.fillOval((int)x,(int)y,10,5);
       //g.drawLine((int)x,(int)y,(int)x,(int)y);
       for(int j=0;j<step;j++)
       {
          x=x+xc;
          y=y+yc;
          g.fillOval((int)x,(int)y,10,5);
          //g.drawLine((int)x,(int)y,(int)x,(int)y);//draw a line in single point 
       }
    }
}
public class DDA_Line 
{
   public static void main(String[] args)
   {
       JFrame window=new JFrame();
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       window.setBounds(20,30,800,800);
       window.getContentPane().add(new mydrawing());
       window.setVisible(true);
   }
}
