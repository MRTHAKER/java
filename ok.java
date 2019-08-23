import java.util.Scanner;
class ok{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter String to find vowels");
   String s=sc.nextLine();
   int count=0;
   for(int i=0;i<s.length();i++){
   if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
   {
	   count++;
   }   
   }
   s=s.replaceAll("a","*");
   s=s.replaceAll("e","*");
   s=s.replaceAll("i","*");
   s=s.replaceAll("o","*");
   s=s.replaceAll("u","*");
System.out.println("Number of vowels found in your String are: "+count);
System.out.println(s);
    }

}