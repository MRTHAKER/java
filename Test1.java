class OuterClass{
	public  class NestedStaticClass{
	public void print(){
	System.out.println("Message From Nested static class");
	}
	}
}
public class Test1{
	public static void main(String args[]){
	OuterClass oc = new OuterClass();
	OuterClass.NestedStaticClass sc = oc.new NestedStaticClass();
	sc.print();
	}
}