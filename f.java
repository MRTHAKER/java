class p
{

int a,b;
void lol()
{
System.out.println("a="+a);
System.out.println("b="+b);
if (a<b)
{
System.out.println("b is big");
}
else
{
System.out.println("a is big");
}
}
}


class f
{
public static void main(String args[])
{
p bro=new p();
bro.a=Integer.parseInt(args[0]);
bro.b=Integer.parseInt(args[1]);
bro.lol();
}
}
