class javaa{
      private static String str="book";

 static class nested{
                   public void disp(){
                   System.out.println(str);}
}
public static void main(String args[]){
javaa.nested oo=new javaa.nested();
oo.disp();
}
}
