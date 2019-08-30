class th1 extends Thread{
int debit;
int credit;
th1(int debit, int credit){
this.debit=debit;
this.credit=credit;
}
public void run(){
if(debit>credit){
System.out.println("can't widraw more than credit amount");
}
else{
credit=credit-debit;
System.out.println("account debited with amount "+debit+" available balance is "+credit);
Thread.yield();
}
}
}
class th2 extends Thread{
int credit;
th2(int credit){
this.credit=credit;
}
public void run(){
System.out.println("account credit with amount "+credit);
Thread.yield();
}
}
public class thread{
public static void main(String args[]){
th1 th=new th1(20,30);
th2 ta=new th2(30);
Thread ttt=th;
Thread tata=ta;
tata.start();
ttt.start();
}}
