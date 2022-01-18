import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		

Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st Number A:");
int a=sc.nextInt();
System.out.println("Enter 2nd Number B:");
int b=sc.nextInt();
int p=a+b;
a=p-a;
b=p-b;
System.out.println("Value of A after Swapping is:"+a);
System.out.println();
System.out.println("Value of B after Swapping is:"+b);
System.out.println();

System.out.println("Thank You For Joining Us.");
}}