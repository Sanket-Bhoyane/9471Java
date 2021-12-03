 class Overloading{
 public void disp(String c){
System.out.println(c);
}
 public void disp(String c,int num){
System.out.println(c+" "+num);
}
}
public class Polymorphism{
public static void main(String [] args){
Overloading p=new Overloading();
p.disp("a");
p.disp("a",3);
}
}