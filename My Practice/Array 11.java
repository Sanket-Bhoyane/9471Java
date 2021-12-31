import java.util.Scanner;
public class Array 11{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the "+R+ " numbers:");
int R=sc.nextInt();
System.out.println("Enter the "+C+ " numbers:");
int C=sc.nextInt();
int[][] a= new int[R][C];
for(int i=0;i<R;i++){
for(int j=0;j<C;j++){
a[i][j]=sc.nextInt();}}
System.out.println("The "+R*C+ "Value are:");
for(int i=0;i<R;i++){
for(int j=0;j<C;j++){
System.out.println(a[i][j]"\t");
}System.out.println();
}
System.out.println("The Transpose of Matrix is:");
for(int i=0;i<C;i++){
for(int j=0;j<R;j++){
System.out.println(a[j][i]"\t");
}System.out.println();
}}}