import java.util.*;
public class Assignment1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter The String:");
String n=sc.nextLine();
n=n.replaceAll("\\s","");
System.out.println();
System.out.println("After Removing Spaces:"+n);
System.out.println();
	for(int i=0;i<n.length();i++) {
		boolean unique = true;
		for(int j=0;j<n.length();j++) {
			if(i!=j&&n.charAt(i)==n.charAt(j)) {
				unique=false;
				break;
			}
		}
		 if(unique) {
		System.out.println("First Non Repeating Character Is:"+n.charAt(i));
		break;
	}}}

}
