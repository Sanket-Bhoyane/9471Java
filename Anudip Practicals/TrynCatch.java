import java.util.Scanner;
public class TrynCatch{
public static void main(String []args){
try{
System.out.println("Enter The Two Numbers:");
Scanner sc=new Scanner(System.in);
int a,b;
a=sc.nextInt();
b=sc.nextInt();
int div=a/b;
System.out.println("Division is "+div);
}
catch(Exception e){
System.out.println("Second Number Cannot Be Zero");
}
finally{
System.out.println("The Final Block");
}}}