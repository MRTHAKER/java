class test{
     static{
      System.out.println("hello from static");}
     test(){
     System.out.println("constructor");}
}
class staticblock{
             public static void main(String args[]){
             test t1=new test();
             test t2=new test();

}
}             
static int ok=22;
System.out.println(ok);                                              
