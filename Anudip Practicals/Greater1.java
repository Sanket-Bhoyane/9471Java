import java.util.Scanner;
public class Greater1{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter three number:");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
if(a>b&&a>c)
System.out.println("The Greatest is" +a);
else if(b>a&&b>c)
System.out.println("The Greatest is"+b);
else
System.out.println("The Greatest is"+c);
}}
