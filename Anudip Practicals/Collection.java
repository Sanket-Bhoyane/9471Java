import java.util.*;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("C+");
		list.add("C++");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());}

}}
