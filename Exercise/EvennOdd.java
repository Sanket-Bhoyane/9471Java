import java.util.*;
public class EvennOdd {

	public static void main(String[] args) {
     int[] a= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	ArrayList<Integer> al1=new ArrayList<>();
	ArrayList<Integer> al2=new ArrayList<>();
for(int i=0;i<a.length;i++) {
	if(a[i]%2==0) {
		al1.add(a[i]);
	}else {
		al2.add(a[i]);
	}}
System.out.println("All even numbers from 1 to 20 are:");
for(int even:al1) {
	System.out.println(even);
}System.out.println("\n");
System.out.println("All odd numbers from 1 to 20 are:");
for(int odd:al2) {
	System.out.println(odd);
}}
}