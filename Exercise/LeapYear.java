import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		

	Scanner sc=new Scanner(System.in);
	System.out.println("Is This Year is a Leap Year?");
	int n=sc.nextInt();
	if((n%4==0) && (n%100 != 0) || (n%400==0))
		System.out.println("This Year Is Leap Year.");
		else
			System.out.println("This Year Is Not A Leap Year.");
		}
	}

