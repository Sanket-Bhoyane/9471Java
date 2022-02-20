import java.util.*;
public class SecondMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Size Of Array");

	int n=sc.nextInt();
	System.out.println("Enter The Values Of Array");
	int [] a=new int[n];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		
	}
	System.out.println("The Original Array is:"+Arrays.toString(a));
	int min=Integer.MAX_VALUE;
	int scmin=Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++) {
		if(a[i]<min) {
			scmin=min;
			min=a[i];
		
	}
		else if(a[i]<scmin) {
			scmin=a[i];}}
			System.out.println(scmin);
		
		}
	
}


