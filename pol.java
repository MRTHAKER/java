import java.applet.Applet;
import java.awt.Graphics;
/*<applet code="pol" height=300 width=300>
</applet>*/

public class pol extends Applet
{

public void paint(Graphics g)
{
int n=3;
int x[]=new int[n];
int y[]=new int[n];
x[0]=10;
y[0]=90;
x[1]=70;
y[1]=10;
x[2]=70;
y[2]=140;
g.drawPolygon(x,y,n);
}
}

