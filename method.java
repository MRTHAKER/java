class k
{
int a,b,c;
void lol(int a,int b,int c)
{
this.a=a;
this.b=b;
this.c=c;

this.a=this.a+1;
this.b=this.b+2;
this.c=this.c+3;
System.out.println("values after  sax"+this.a);
System.out.println("values after  sax"+this.b);
System.out.println("values after  sax"+this.c);
}
void lol(int a,int b)
{
this.a=b;
this.b=b;
int ans;
ans=this.a*this.b;
System.out.println("overloaded Answer is"+this.a*this.b);
}
void lol(k ob)
{
int a=ob.a;
int b=ob.b;
int ans=2;
ans=a+b+ans;
System.out.println("Answer is"+ans);
}
}
class method
{
public static void main(String args[])
{
k pro=new k();
pro.lol(10,20,30);
pro.lol(2,3);
k bro=new k();
bro.lol(pro);
}
}

