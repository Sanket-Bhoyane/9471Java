import java.util.*;
public class Balance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Input:");

String n=sc.nextLine();
Stack<Character> s=new Stack<>();
for(int i=0;i<n.length();i++) {
	if(n.charAt(i)=='{'|| n.charAt(i)=='['|| n.charAt(i)=='(') {
		s.push(n.charAt(i));
		
	}else if(!s.empty()&& ((n.charAt(i)==']'&& s.peek()=='[')||
			(n.charAt(i)==')'&& s.peek()=='(')||(n.charAt(i)=='}'&& s.peek()=='{'))) {
		s.pop();
		
	}else {
		s.push(n.charAt(i));
		
	}
}if(s.empty()) {
	System.out.println("Balanced");
}
else {
	System.out.println("Not Balanced");

}
	}

}
