import java.util.*;
public class InsertElement {

	public static void main(String[] args) {
		

	LinkedList<String> list=new LinkedList<>();
	list.add("Sanket");
	list.add("Yeda");
	list.add("Sunny");
	System.out.println("The List Is:"+list);
	System.out.println();
	list.addFirst("Omkar");
	list.addLast("Anaya");
	System.out.println("After Adding:"+list);
	}

}
