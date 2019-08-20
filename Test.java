class OuterClass{
	public static class NestedStaticClass{
	public void print(){
	System.out.println("Message From Nested static class");
	}
	}
}
public class Test{
	public static void main(String args[]){
	OuterClass.NestedStaticClass sc = new OuterClass.NestedStaticClass();
	sc.print();
	}
}