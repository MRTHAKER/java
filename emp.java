import java.io.*;
import java.util.*;
class emp{
String name;
String add;
String mno;
emp(String name,String add,String mno){
this.name=name;
this.add=add;
this.mno=mno;
}
public void write(){
try{
File fi=new File("users.txt");
if(fi.exists()){
FileWriter fw = new FileWriter("users.txt",true);
fw.write(name+"\n"+add+"\n"+"\n"+mno);
fw.close();
}
else{
FileWriter fw = new FileWriter("users.txt",false);
fw.write(name+"\n"+add+"\n"+"\n"+mno);
fw.close();
}
}
catch(Exception e){}
}
public void read(){
try{
File df = new File("users.txt");
BufferedReader b = new BufferedReader(new FileReader(df));
String del;
while ((del = b.readLine()) != null){
   System.out.println(del);
}
}
catch(Exception e){}
}
public static void main(String args[]){
Scanner name=new Scanner(System.in);
System.out.println("Enter name: ");
String nm=name.nextLine();
Scanner add=new Scanner(System.in);
System.out.println("Enter address: ");
String ad=add.nextLine();
Scanner mno=new Scanner(System.in);
System.out.println("Enter mobile no: ");
String m=mno.nextLine();
emp e=new emp(nm,ad,m);
e.write();
e.read();
}
}

