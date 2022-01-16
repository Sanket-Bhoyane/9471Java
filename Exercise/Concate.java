import java.util.Scanner;
public class Concate {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
	System.out.println("Enter The First half Statement:");
	String s1=sc.nextLine();
	System.out.println("Enter The Other half Statement:");
	String s2=sc.nextLine();
	System.out.println();
	System.out.println("The Complete Statement is:");
	String s3=s1.concat(" "+s2);
	System.out.println(s3);
	}

}