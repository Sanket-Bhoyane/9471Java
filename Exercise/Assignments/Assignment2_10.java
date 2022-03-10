import java.util.*;

public class Assignment2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Specific Element:");
		String n=sc.nextLine();
		System.out.println("Enter The Specific Position:");
		Scanner sc1=new Scanner(System.in);
int m=sc.nextInt();
	
	LinkedList<String>list=new LinkedList<>();
	
	list.add("Change");
	list.add("Is");
	list.add("The");
	list.add("Of");
	list.add("Nature.");
System.out.println("Original List Is:"+list);
list.add(m, n);
System.out.println("After Adding Specific Element At Specific Position In List:"+list);

	}

}
