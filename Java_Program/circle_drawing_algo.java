//Program for Circle drawing algorithm
package Circle;

import java.awt.*;
//import java.math.*;
import javax.swing.*;

class mydrawing extends JComponent
{
   public void paint(Graphics g)
   {
      int xc=150,yc=150,r=40;
      int x=0, y=r, p, i;
      p=1-r;
      g.setColor(Color.RED);
      for(i=0;y>=x;i++)
      {
         g.fillOval(x+xc,y+yc,3,3);
         g.fillOval(y+xc,x+yc,3,3);
         g.fillOval(y+xc,-x+yc,3,3);
         g.fillOval(x+xc,-y+yc,3,3);
         g.fillOval(-x+xc,-y+yc,3,3);
         g.fillOval(-y+xc,-x+yc,3,3);
         g.fillOval(-y+xc,x+yc,3,3);
         g.fillOval(-x+xc,y+yc,3,3);
         if(p<0)
         {
            x=x+1;
            y=y;
            p=p+2*x+1;
            
         }
         else //if(p>=0)
         {
            x=x+1;
            y=y-1;
            p=p+2*x+1-2*y;
         }
      } 
   }
}
public class Circle
{
   public static void main(String[] args)
   {
       JFrame window=new JFrame();
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       window.setBounds(20,30,300,300);
       window.getContentPane().add(new mydrawing());
       window.setVisible(true);
   }
} 
