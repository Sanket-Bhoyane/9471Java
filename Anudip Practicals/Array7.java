import java.util.Scanner;
public class Array7{

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
int n=sc.nextInt();
	
System.out.println("Enter the " +n+ " numbers:");
	int[] a=new int[n];
		for(int i=0;i<n;i++) {
			 a[i]=sc.nextInt();}

		System.out.println("Enter the " +n+ " numbers are:");
	for(int i=0;i<n;i++) {
		System.out.println(a[i]);
	}
	int sum=0;
		
	System.out.println("Average is:");
	for(int i=0;i<n;i++) 
		sum=sum+a[i];
	int average=sum/n;
	
	System.out.println(+average);
	int max=a[0];
	
	System.out.println("Greatest value is:");
	for(int i=0;i<n;i++) {
		if(max<a[i]) {
			max=a[i];}}
	System.out.println(+max);
	
	System.out.println("Ascending Order is:");
int temp=0;
for(int i=0;i<n;i++) {
	for(int j=i;j<n;j++) {
		if(a[i]>a[j]) {
			temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}}}
for(int b:a) {
	System.out.println(b);
	}
	
	System.out.println("the Decsending order is:");
	for(int i=0;i<n;i++) {
		for(int j=i;j<n;j++) {
			if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}}}
	for(int b:a) {
		System.out.println(b);}
			
				
			}
		}
	
	

