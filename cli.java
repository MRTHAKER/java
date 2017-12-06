class cli
{

public static void main(String args[])
{

double a,b,c;
a=Double.parseDouble(args[0]);
b=Double.parseDouble(args[1]);
System.out.println(+a);
System.out.println(+b);
if(b==0)
{
System.out.println("can't divide with zero");
}
else
{
c=a/b;
System.out.println("Answer is"+c); 
}
}
}
