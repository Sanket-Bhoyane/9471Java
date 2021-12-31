import java.util.Scanner;
public class Array11{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of Row:");
int R=sc.nextInt();
System.out.println("Enter the size of Column:");
int C=sc.nextInt();
int[][] a= new int[R][C];
System.out.println("The " +R*C+ " Value are:");
for(int i=0;i<R;i++){
for(int j=0;j<C;j++){
a[i][j]=sc.nextInt();}}
System.out.println("The Original Matrix is:");
for(int i=0;i<R;i++){
for(int j=0;j<C;j++){
System.out.print(a[i][j]+"\t");
}System.out.println();
}
System.out.println("The Transpose of Matrix is:");
for(int i=0;i<C;i++){
for(int j=0;j<R;j++){
System.out.print(a[j][i]+"\t");
}System.out.println();
}}}