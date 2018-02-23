 i,,import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="dra" height=300 width=300>
</applet>*/

public class dra extends Applet implements ActionListener
{
Label l1;
Button b1,b2;
public void init()
{
b1=new Button ("Red");
b2=new Button("Green");

l1=new Label("                            ");
add(b1);
add(b2);
add(l1);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent b)
{
if(b.getActionCommand().equals("Red"))
{
	setBackground(Color.red);
}
else if(b.getActionCommand().equals("Green"))
{
	setBackground(Color.green);
}

}
}

