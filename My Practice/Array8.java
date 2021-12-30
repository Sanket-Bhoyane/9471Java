import java.util.Scanner;
public class Array8 {

	public static void main(String[] args) {
		

	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array:");
	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("enter the " +n+ " numbers");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
		
	}
	System.out.println("the " +n+ " numbers are:");
	for(int i=0;i<n;i++) {
		System.out.println(a[i]);
	}
	}

}
