import java.util.Scanner;
public class BreakStatement{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Statement:");
String str=sc.nextLine();
String wd[]=str.split(" ");
System.out.println();
System.out.println("The Break Statement Is:");
for(String w:wd){
System.out.println(w);
}
System.out.println();
System.out.println("The Length Of Statement is:");
System.out.println(wd.length);

} }