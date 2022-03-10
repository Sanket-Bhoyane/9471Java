import java.util.*;
public class Assignment2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>list=new ArrayList<>();
list.add("World");
list.add("Is");
list.add("Big");
System.out.println(list);
list.trimToSize();
list.add("& Beautiful");
System.out.println("After trim to size :"+list);

	}

}
