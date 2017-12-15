class k
{
int a=10;
int b=20;
int c=30;
int ans=0;
k()
{
ans=a+b+c;
System.out.println("ans  in default"+ans);
}
k(int x,int y)
{
a=x;
b=y;
ans=a+b+c;
System.out.println("ans  in 2 parameter"+ans);
}
k(int x,int y,int z)
{
a=x;
b=y;
c=z;
ans=a+b+c;
System.out.println("ans  in 3 parameter"+ans);
}
}
class lol
{
public static void main(String args[])
{
k bro=new k();
k pro=new k(2,3);
k kpro=new k(2,3,4);
}
}
