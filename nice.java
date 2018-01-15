interface a
{
void ab();
void cd();
}

interface b extends a
{

void ef();
}

interface c extends b
{
void gh();
}
interface d extends c
{
void ij();
}

class bro implements d
{
public void ab()
{
 System.out.println("it works");
cd();
}

public void cd()
{
 System.out.println("Yeah! It works");
ef();
}
public void ef()
{
System.out.println("well it does..");
gh();
}
public void gh()
{
System.out.println("wew working");
ij();
}
public void ij()
{
System.out.println("okay stop now");
}
}

class nice
{
public static void main(String args[])
{
bro b1=new bro();
b1.ab();
}
} 
