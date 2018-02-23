import java.applet.Applet;
import java.awt.Graphics;

/*<applet code="lol" height=400 width=600>
</applet>
*/

public class lol extends Applet
{
public  void paint(Graphics g)
{

g.drawString("Hello Word",132,300);
g.fillOval(300,100,40,90);
g.drawArc(300,200,50,60,50,140);
g.fillArc(200,50,70,86,3,360);
g.fillRect(100,100,70,20);
}
}
