import java.util.*;
public class InsertAnywhere {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter Some Names:");
String a=sc.nextLine();
String b=sc.nextLine();
String c=sc.nextLine();
	LinkedList<String> list=new LinkedList<>();
	list.add("Sanket");
	list.add("Yeda");
	list.add("Tare");
	list.add("Sunny");
	list.add("Rohan");
	System.out.println("The List Is:"+list);
	System.out.println();
	list.add(0,a);
	list.add(3,b);
	list.add(5,c);
	System.out.println("After Adding  Some Names:"+list);}

}
