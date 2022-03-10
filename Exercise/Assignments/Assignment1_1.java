import java.util.*;
public class Assignment1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Strings:");
		
String a=sc.nextLine();
String b=sc.nextLine();
String c=sc.nextLine();
boolean result=a.equals(b);
boolean result1=a.equals(c);
if(result==true) {
	System.out.println("Yes,String a & b Are Same:");
	
}
else 
{	System.out.println("No,a & b Are Not Same:");

	}
if(result1==true) {
	System.out.println("Yes,String a & c Are Same:");

}
else {
	System.out.println("No,String a & c Are Not Same:");
}
	}

}
