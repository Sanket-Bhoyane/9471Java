import java.util.Scanner;
class cls1{
void add(int p,int q){
System.out.println(p+q);
}}
class cls2 extends cls1{
void mul(int p,int q){
System.out.println(p*q);
}
void task(int p,int q){
System.out.println(((p*p)+(q*q)));
}}
class Task{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers:");
int p=sc.nextInt();
int q=sc.nextInt();
cls2 obj=new cls2();
obj.add(p,q);
obj.mul(p,q);
obj.task(p,q);
 
}
}