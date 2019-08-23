import java.util.Scanner;
class ok{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter String to find vowels");
   String s=sc.nextLine();
   for(int i=0;i<s.length();i++){
   if(s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u")){
   s=s.replaceAll("a","*");
   s=s.replaceAll("e","*");
   s=s.replaceAll("i","*");
   s=s.replaceAll("o","*");
   s=s.replaceAll("u","*");
   }
    }
System.out.println(s);}}