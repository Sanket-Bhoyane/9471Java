import java.util.*;
public class Assignment1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter The String:");
String n=sc.nextLine();
 n=n.replaceAll("\\s","");
 System.out.println();
 System.out.println("After Removing Spaces:"+n);
int[] a=new int[256];
for(int i=0;i<n.length();i++) {
	a[n.charAt(i)]=a[n.charAt(i)]+1;
	
}
int max=-1;
int scmax=0;
char c=' ';
for(int i=0;i<n.length();i++) {
	if(a[n.charAt(i)]>max) {
	scmax=max;
	max=a[n.charAt(i)];
	c=n.charAt(i);
	}
	else if(a[n.charAt(i)]>scmax&&max!=a[n.charAt(i)]) {
		scmax=a[n.charAt(i)];
		c=n.charAt(i);
	}
}
System.out.println();
System.out.println("Second Most Occuring Element Is:"+c);

	}

}
