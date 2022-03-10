import java.util.*;
public class Assignment2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Specific Position.");
int n=sc.nextInt();
int m=sc.nextInt();
LinkedList<String>list=new LinkedList<>();
list.add("I");
list.add("Will");
list.add("This");
list.add("Belive Me.");
System.out.println("Original List:"+list);
list.add(n,"Change");
list.add(m,"World");
System.out.println("After Adding The Element :"+list);

	}

}
