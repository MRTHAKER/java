class v
{
int a,b,c=0;
void init()
{
System.out.println("values before swap a="+a);
System.out.println("values before swap b="+b);
c=a;
a=b;
b=c;
System.out.println("values before swap a="+a);
System.out.println("values before swap b="+b);
}
}

class vv
{

public static void main(String args[])
{

v pro=new v();
pro.a=Integer.parseInt(args[0]);
pro.b=Integer.parseInt(args[1]);
pro.init();
}
}

