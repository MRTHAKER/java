public class test3{
	public int x=20;
	class Inner{
	public int x=1;
	void m(int x){
	System.out.println("X= "+x);//10
	System.out.println("this.X= "+this.x);//1
	System.out.println("X= "+test3.this.x);//20
	}
	}
public static void main(String[] args) {
 test3 t=new test3();
 test3.Inner i =t.new Inner();
 i.m(10);
}
}