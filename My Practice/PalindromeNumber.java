import java.util.*;
public class PalindromeNumber {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Input:");
    int n=sc.nextInt();
    int a=n;
    int rev=0;
    while(n!=0) {
        int reminder = n % 10;
        rev = rev * 10 + reminder;
        n = n / 10;
    }
    if(rev==a)
        System.out.println("Number Is Palindrome");
    else{
        System.out.println("Number Is Not Palindrome");

    }
    }}
