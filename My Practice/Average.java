import java.util.Scanner;
public class Average{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Size Of Array:");
int n=sc.nextInt();
int[] a=new int[n];
System.out.println(" The "+n+ " numbers Of Array is:");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println(" The Array is:");
for(int i=0;i<n;i++){
System.out.println(a[i]);}
int sum=0;int avg;
System.out.println(" The Average Of Array is:");
for(int i=0;i<n;i++){
sum=sum+a[i];}
System.out.println(sum/n);
}}