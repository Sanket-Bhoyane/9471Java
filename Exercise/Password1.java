import java.util.*;
public class Password1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int Letter_count=5;
		int Charac_count=10;
		int Num=2;
		int num_count=0;
		int charac=0;
		int letter=0;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter The Password:");
	String s=sc.nextLine();
	int input=s.length();
	for(int i=0;i<input;i++) 
	{
		char ch=s.charAt(i);
		if(Character.isDigit(ch))
			num_count++;
		if(Character.isDefined(ch))
			charac++;
		if(Character.isLetter(ch))
			letter++;}
//passward must have atleast 10 characters,it contains atlest 2 digits & atleast 5 letters.
		if(num_count>=Num && charac>=Charac_count && letter>=Letter_count) {
		System.out.println("Enter Passward Is Valid.");}
		else {
			System.out.println("Enter Password Is Not Valid");
			System.out.println();
		if(num_count<Num) {
			System.out.println("Atleast 2 digits Required For Valid Password.");
			}
		else if(charac<Charac_count) {
			System.out.println("Password Should Atleast 10 Characters");
			System.out.println();
		}
		 if(letter<Letter_count) {
			System.out.println("Atleast 5 Letters Required.");}
		}
		}
			
		}
	
	

