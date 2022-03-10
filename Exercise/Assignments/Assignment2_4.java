import java.util.*;

public class Assignment2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> list=new ArrayList<>();
list.add(1);
list.add(2);
list.add(3);
System.out.println(list);
System.out.println("Check Whether Its Is Empty Or Not:");
boolean ans=list.isEmpty();
if(ans==true) {
	System.out.println("ArrayList Is Empty");
}
else {
	System.out.println("ArrayList Is Not Empty");

}
list.removeAll(list);
System.out.println("After Removing All Data:"+list);
ans=list.isEmpty();
if(ans==true) {
	System.out.println("ArrayList Is Empty");

}
else {
	System.out.println("ArrayList Is Not Empty");

}
	}

}
