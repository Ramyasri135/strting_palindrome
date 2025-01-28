import java.util.Scanner;
public class Palindrome{
  // Start your code here
  public static void main(String[] args) {
    String str,rev="";
    System.out.println("enter a string");
    Scanner sc=new Scanner(System.in);
    str=sc.nextLine();
    str=str.toLowerCase();
    int length=str.length();
    for(int i=length-1;i>=0;i--){
      rev=rev+str.charAt(i);
    }
    if(str.equals(rev)){
      System.out.println("the string "+"\""+str+"\""+" is a palindrome");
    }
    else{
      System.out.println("the string "+"\""+str+"\""+" is not a palindrome");
    }
  }
}