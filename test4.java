interface MyInterface{
	public void sum(int a,int b);
}
class Demo implements MyInterface{
	public void sum(int a,int b){
		System.out.println("the sum is : "+(a+b));
	}
}
public class test4{
	public static void main(String[] args) {
		Demo d = new Demo();
		d.sum(50,50);
	}
}