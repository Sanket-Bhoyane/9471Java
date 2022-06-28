import  java.util.*;
public class Palindrome {
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Input:");
    String n=sc.nextLine();
    String rev="";
    for(int i=n.length()-1;i>=0;i--){
        rev=rev+n.charAt(i);
    }
    if (rev.toLowerCase().equals(n.toLowerCase())){
        System.out.println("String Is Palindrome");
    }
    else{
        System.out.println("String Is not Palindrome");

    }
}}
