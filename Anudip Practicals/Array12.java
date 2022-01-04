import java.util.Scanner;
public class Array12{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Size Of Row:");
int R=sc.nextInt();
System.out.println("Enter The Size Of Column:");
int C=sc.nextInt();
int[][] a=new int[R][C];
int[][] b=new int[R][C];
int[][] c=new int[R][C];
System.out.println("Enter The Value Of Matrix A:");
for(int i=0;i<R;i++){
for(int j=0;j<C;j++){
a[i][j]=sc.nextInt();
}}
System.out.println("The Matrix A is:");
for(int i=0;i<R;i++){
for(int j=0;j<C;j++){
System.out.print(a[i][j]+"\t");
}System.out.println();
}System.out.println("Enter The Value Of Matrix B:");
for(int i=0;i<R;i++){
for(int j=0;j<C;j++){
b[i][j]=sc.nextInt();
}}
System.out.println("The Matrix B is:");
for(int i=0;i<R;i++){
for(int j=0;j<C;j++){
System.out.print(b[i][j]+"\t");
}System.out.println();
}
System.out.println("The Addition Of Matrix A & B is:");
for(int i=0;i<R;i++){
for(int j=0;j<C;j++){
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+"\t");}
System.out.println();
}}
}