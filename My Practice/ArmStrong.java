import java.util.*;
public class ArmStrong {
public static  void main(String [] args){
    Scanner sc=new Scanner (System.in);
    System.out.println("Give The Input:");
    int n=sc.nextInt();
   int a=n;
   int result=0;
   while (n!=0){
       int reminder = n%10;
       result=result+reminder*reminder*reminder;
       n=n/10;
   }
   if(result==a)
   System.out.println("Given Number Is Armstrong");
   else
       System.out.println("Given Number Is Not a Armstrong");

}}
