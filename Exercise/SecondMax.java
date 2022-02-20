import java.util.*;
public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Size Of Array");

int n=sc.nextInt();
System.out.println("Enter The Values Of Array");
int[]a=new int[n];
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
	
}
System.out.println("The Array is:"+Arrays.toString(a));
int max=Integer.MIN_VALUE;
int scmax=Integer.MIN_VALUE;

for(int i=0;i<a.length;i++) {
	if(a[i]>max) {
	scmax=max;
	max=a[i];
}
	else if(a[i]>scmax&&max!=a[i]) {
		scmax=a[i];
	}}
System.out.println(scmax);
	




}}
