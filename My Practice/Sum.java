import java.util.Scanner;
public class Sum{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter The size of array:");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("Enter the "+n+"numbers");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println("The "+n+" numbers are:");
for(int i=0;i<n;i++){
System.out.println(arr[i]);}
int sum=0;
System.out.println("The Sum of Array is:");
for(int i=0;i<arr.length;i++){
sum=sum+arr[i];}
System.out.println(+sum);
}}