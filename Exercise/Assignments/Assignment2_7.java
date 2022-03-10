import java.util.*;
public class Assignment2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Specified Element:");
String n=sc.nextLine();

	LinkedList<String>list=new LinkedList<>();
	list.add("Thoughts");
	list.add("Make A");
	list.add("Good HumanBeings.");

	System.out.println("Original List:"+list);
	
	list.addFirst(n);
	System.out.println("After Adding Specified Element :"+list);}

}
