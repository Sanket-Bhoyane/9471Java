import java.util.*;
public class MultiTask {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the  integer A:");
int a=sc.nextInt();
System.out.println("Enter the  integer B:");
int b=sc.nextInt();
System.out.println("Enter the integer C:");
int c=sc.nextInt();
int sum=a+b+c;
System.out.println("The Sum Of Integers is:"+sum);
System.out.println();
int avg=sum/3;
System.out.println("The Average Of Intergers is:"+avg);
System.out.println();
if(a<b && a<c)
	System.out.println("min is:"+a);
if(b<a && b<c)
	System.out.println("min is:"+b);
if(c<a && c<a)
	System.out.println("min is:"+c);
System.out.println();
if(a>b && a>c)
	System.out.println("max is:"+a);
if(b>a && b>c)
	System.out.println("max is:"+b);
if(c>a && c>b)
	System.out.println("max is:"+c);
}}
