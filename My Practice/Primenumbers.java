import java.util.Scanner;
public class Primenumbers{
public static void main(String []args) {
int a=0;
Scanner sc=new Scanner(System.in);
System.out.println("Input:");
int n=sc.nextInt();
for(int i=2;i<=n-1;i++) {
	if(n%i==0) {
		a=a+1;}}
if(a==0) {
	System.out.println("number is prime");
}
else{ 
	System.out.println("number is not prime");
}}}
	