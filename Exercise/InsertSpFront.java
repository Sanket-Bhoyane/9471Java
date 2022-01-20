import java.util.*;
public class InsertSpFront {

	public static void main(String[] args) {
		

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Specific Input:");
	String sp=sc.nextLine();
	LinkedList<String> list=new LinkedList<>();
	list.add("Sanket");
	list.add("Manish");
	list.add("Yeda");
	list.add("Rohan");
	System.out.println("The List Is:"+list);
	System.out.println();
	list.addFirst(sp);
	System.out.println("After Modifing The List Is:"+list);	}

}