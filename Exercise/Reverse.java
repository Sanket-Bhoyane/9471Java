import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Size Of Array:");
int n=sc.nextInt();

System.out.println("Enter The Values Of Array:");
		   int []a=new int[n];
		   for(int i=0;i<a.length;i++) {
			   a[i]=sc.nextInt();
		   }
		   System.out.println("The Original Array is:"+Arrays.toString(a));
		   System.out.println();
		   System.out.println("The Reverse Array is:");
		   System.out.println();
		  for(int i=0;i<a.length/2;i++) {
			  int temp=a[i];
			  a[i]=a[a.length-1-i];
			  a[a.length-1-i]=temp;
		  } 
		  System.out.println(Arrays.toString(a));
		  }
		    
		}
