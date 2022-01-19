import java.util.*;
public class Remove {

	public static void main(String[] args) {
		

	ArrayList<Integer> list=new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	System.out.println("The List Is: " +list);
	list.size();
	System.out.println("Size of list: " +list.size());
	System.out.println();
	
	list.removeAll(list);
	
	System.out.println("After Removing: " +list);
	list.size();
	System.out.println("After Removing all element the size of List is: "  +list.size());
	System.out.println();
	System.out.println("thank you for joining us.");
	
	}

}
