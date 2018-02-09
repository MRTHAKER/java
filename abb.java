class abc extends Thread
{
final int a[]={1,2,3,4,5,6,7,8,9,10,11};
abc()
{
start();
}
public void run()
{
try
      {
for(int i=0;i<=10;i++)
{
if(i<=a[i])
{
System.out.println("i is:"+i);
sleep(2000);
}
if(i==3)
{
System.out.println("sleeping now for 5 secs");
sleep(5000);
}
if(i==6)
{
System.out.println("sleeping now for 6 secs");
sleep(6000);
}
if(i>10)
{
System.out.println("killing cute thread xD");
stop();
}
}
}
catch (Exception e)
{
System.out.println("lol?");
}
}
}

class abb
{
public static void main(String args[])
{
new abc();
}
}
