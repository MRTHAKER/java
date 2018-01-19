class a
{
a(int a)
{
try
{
int ans=a/a;
}
catch(Exception e)
{
System.out.println("zero value");
}
}
}
class ex
{
 public static void main(String args[])
{
a a1=new a(0);
}
}
