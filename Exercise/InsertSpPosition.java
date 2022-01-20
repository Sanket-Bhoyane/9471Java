import java.util.*;
public class InsertSpPosition {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String a=sc.nextLine();
			LinkedList<String> list=new LinkedList<>();
			list.add("Sanket");
			list.add("Yeda");
			list.add("Tare");
			list.add("Sunny");
			list.add("Rohan");
			System.out.println("The List Is:"+list);
			System.out.println();
			list.add(2,a);
			System.out.println("After Adding  Some Names:"+list);}

}
