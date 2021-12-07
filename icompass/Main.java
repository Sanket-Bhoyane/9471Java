class A{
final void m1(){
System.out.println("m1 Called");
}
}
class B extends A{
public void m2(){
m1();
System.out.println("m2 Called");
}}
public class Main{
public static void main(String []args){
B b=new B();
b.m1();
b.m2();
}}