import java.util.*;

public class Remove {

	public static void main(String[] args) {
int count=0;int del;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Size Of Array:");
	int n=sc.nextInt();
	System.out.println("Enter The Values Of Array:");
	int []a=new int [n];
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
		
	}
	System.out.println("Enter The Element:");
	int x=sc.nextInt();
	System.out.println();
	System.out.println("The Original Array is:"+Arrays.toString(a));
	for(int i=0;i<a.length-1;i++) {
		if(x==a[i]) {
			for(int j=i;j<a.length-1;j++) {
				a[j]=a[j+1];
				
				
			}
		count=count+1;
		break;}
	}
	System.out.println();
	if(count==0) {
		System.out.println("No Element Found.");
		
	}
	else {
		System.out.println("Element deleted Successfully.");
		System.out.println(Arrays.toString(a));
	}}

}
