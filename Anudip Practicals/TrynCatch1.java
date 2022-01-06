import java.util.Scanner;
public class TrynCatch1{
public static void main(String [] args){
try{
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Two Numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
int div=a/b;
System.out.println("Division is: "+div);
try{
int[] arr= new int[3];
arr[10]=20;
System.out.println("Array value is: "+arr[10]);
}catch(ArrayIndexOutOfBoundsException e){
System.out.println("The Array is out of Bound");
}}
catch(NullPointerException e){
System.out.println("The Second Number Cannot be zero");
}
catch(Exception e){
System.out.println("Enter The Two Numbers:");
}
finally{
System.out.println("The Final Block");
}}}