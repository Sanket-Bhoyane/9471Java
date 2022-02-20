import java.util.*;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Size Of Array:");
	int n=sc.nextInt();
	int []a=new int [n];
	System.out.println("Enter The Values:");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();	
		sum=sum+a[i];}

			
	System.out.println("Average Of Given Array is="+sum/n);
	}

}
