import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="dra2" height=300 width=300>
</applet>*/

public class dra2 extends Applet implements ActionListener
{
Label l1;
Button b1,b2,b3,b4;
TextField ki,ka;

public void init()
{
b1=new Button ("Sum");
b2=new Button("sub");
b2=new Button("div");
b3=new Button("mul");
ki=new TextField(12);
ka=new TextField(12);
l1=new Label("                            ");
add(b1);
add(b2);
add(b3);
add(b4);
add(l1);
add(ki);
add(ka);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent b)
{
if(b.getActionCommand().equals("sum"))
{
 String s1=ki.getText();
 String s2=ka.getText();
int lo=Integer.parseInt(s1);
int la=Integer.parseInt(s2);

	int summ=lo+la;
		l1.setText("sum is"+summ);
}
else if(b.getActionCommand().equals("Sub"))
{
String s3=ki.getText();
String s4=ka.getText();
int ba=Integer.parseInt(s3);
int ko=Integer.parseInt(s4);

        int subb=ba-ko;

}
else if(b.getActionCommand().equals("div"))
{
String s5=ki.getText();
String s6=ka.getText();
int sa=Integer.parseInt(s5);
int si=Integer.parseInt(s6);
int divv=sa/si;

}
else if(b.getActionCommand().equals("mul"))
{
String s7=ki.getText();
String s8=ka.getText();
int zo=Integer.parseInt(s7);
int za=Integer.parseInt(s8);
int mull=zo/za;
}

}
}

