import java.util.*;
public class Assignment2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("Enter The Specific Element:");
String n=sc.nextLine();
LinkedList<String>list=new LinkedList<>();
list.add("& Good");
list.add("HumanBeings");
list.add("Make A");
list.add("Better");
System.out.println("Original List:"+list);
list.addLast(n);
System.out.println("After Adding Element In List:"+list);

	}

}
