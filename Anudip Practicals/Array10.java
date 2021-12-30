import java.util.Scanner;
public class Array10{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Row Number:");
int R=sc.nextInt();
System.out.println("Enter the Column Number:");
int C=sc.nextInt();
int[][] a=new int[R][C];
System.out.println("Enter the " + R * C + " Numbers:");
for(int i=0;i<R;i++){
for(int j=0;j<C;j++){
a[i][j]=sc.nextInt();
}}
System.out.println("The " +R*C+ " Numbers Are:");
for(int i=0;i<R;i++){
for(int j=0;j<C;j++){
System.out.print(a[i][j]);
}System.out.println();
}}}