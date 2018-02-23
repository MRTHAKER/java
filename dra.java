import java.applet.*;
import java.awt.*;
import java.awt.event.*;//import events shits

/* <applet code="dra" height=300 width=300>
</applet>*/
/*
1.create objects of buttons and labels
2.assign of memory
public class dra extends Applet implements ActionListener /*listner interface and we must override its methods*/
{
Label l1;//object of Label class
Button b1,b2;//takes buttons as source or source components
public void init()/*intial method to applet life cycel*/
{
b1=new Button ("mahek");//intialized values to buttons
b2=new Button("5476");

l1=new Label("                            ");
add(b1);//display in flow layout
add(b2);
add(l1);
b1.addActionListener(this);//handles event with listener
b2.addActionListener(this);//attach action lister with our button
}
public void actionPerformed(ActionEvent b)//menthod of ActionListener
{
l1.setText(b.getActionCommand());//will print label of button
}
}

