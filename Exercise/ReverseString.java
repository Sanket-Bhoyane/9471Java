import java.util.Scanner;
import java.util.Arrays;
public class ReverseString {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Write The String:");

String a=sc.nextLine();
System.out.println();
System.out.println( "The Original String is:"+a);
System.out.println();

StringBuilder b=new StringBuilder();
	b.append(a);
	b.reverse();
	System.out.println("The Reverse String Is:");
	System.out.println();
	
	

	System.out.println(b);
	}
		    
		}