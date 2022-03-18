import java.util.*;
public class Assignment3_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Range For Even & Odd:");
int L=sc.nextInt();
int R=sc.nextInt();
System.out.println("The Even Numbers Are:");
Even(L,R);
System.out.println();
System.out.println("The Odd Numbers Are:");
Odd(L,R);
System.out.println();
System.out.println("Thank You So Much For Visiting ,Ur Time Is Valuable For Me.");

	}
static void Even(int L, int R) {
	if(R<L) {
		return;
	}
	if(R%2==0) {
		Even(L,R-2);
	}
	else {
		Even(L,R-1);
	}
	if(R%2==0) {
		System.out.println(R+"");
	}
}static void Odd(int L,int R) {
	if(R<L) {
		return;
	}
	if(R%2==1) {
		Odd(L,R-2);
			
		
	}
	else {
		Odd(L,R-1);
	}if(R%2==1) {
		System.out.println(R+"");
	}
}


}
