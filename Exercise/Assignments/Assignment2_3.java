import java.util.*;
public class Assignment2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> list1=new ArrayList<>();
list1.add(1);
list1.add(2);
list1.add(3);
list1.add(4);
list1.add(5);
System.out.println("Original ArrayList:"+list1);
list1.removeAll(list1);
System.out.println("After Removing ArrayList:"+list1);

	}

}
