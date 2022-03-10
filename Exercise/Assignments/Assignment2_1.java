import java.util.*;
public class Assignment2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list1=new ArrayList<>();
list1.add("Java");
list1.add("Is");
list1.add("The");
System.out.println(list1);
ArrayList<String> list2=new ArrayList<>();
list2.add("Best");
list2.add("Programming");
list2.add("Language");
System.out.println(list2);
System.out.println("After Joinning Two ArrayList:");
list1.addAll(list2);
System.out.println(list1);
}

}
