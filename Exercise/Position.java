import java.util.*;

public class Position {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Size Of Array:");
	int n= sc.nextInt();
	System.out.println("Enter The Values Of Arrays:");
	int []a=new int[n];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		
	}
	System.out.println("Original Array is:"+Arrays.toString(a));
	System.out.println();
	System.out.println("Enter The Specific Index:");
	int indx=sc.nextInt();
	System.out.println();
	System.out.println("Enter The Specific Value To Be Add:");
	
	int x=sc.nextInt();
	
	for(int i=a.length-1;i>indx;i--) {
		a[i]=a[i-1];
	}a[indx]=x;
	System.out.println();
	
	System.out.println("After Adding Element:"+Arrays.toString(a));

			}
	}
