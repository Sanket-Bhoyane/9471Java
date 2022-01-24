import java.util.*;
public class Password {

	public static void main(String[] args) {
       
		int Charac_count=8;
		int Num=2;
		int num_count=0;
		int charac=0;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter The Password:");
	String s=sc.nextLine();
	int input=s.length();
	for(int i=0;i<input;i++) 
	{
		char ch=s.charAt(i);
		if(Character.isDigit(ch))
			num_count++;
		if(Character.isLetter(ch))
			charac++;}
//passward must have atleast 10 characters,it contains atlest 2 digits, atleast 8 letters.
		if(num_count>=Num && charac>=Charac_count) {
		System.out.println("Enter Passward Is Valid.");}
		else {
			System.out.println("Enter Password Is Not Valid");
		}
		}
			
		}
	
	

