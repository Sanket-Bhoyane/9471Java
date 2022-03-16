import java.util.*;
public class Assignment1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("Enter The String which u Want:");
String n=sc.nextLine();
System.out.println();
List<String> list=new ArrayList<>();
list.add("rabbit");
list.add("bribe");
list.add("dog");
System.out.println("The Given Strings Are:");
for(int i=0;i<list.size();i++) {
	System.out.println(list.get(i));
}
System.out.println();
System.out.println("The String Containing All The Letters Of The Given Words Are:");
for(int j=0;j<list.size();j++) {
	checkExistence(list.get(j),n);
}
	}

	private static void checkExistence(String str, String str1) {
		// TODO Auto-generated method stub
	int a=0;
	char b=' ';
	int []c=new int[Character.MAX_VALUE +1];
	for(int i=0;i<str.length();i++) {
		b=str.charAt(i);
		++c[b];
		
	}for(int i=0;i<str1.length();i++) {
		b=str1.charAt(i);
		if(c[b]>=1)
		a=1;
	}
if(a==1) {
	System.out.println(str);
	}
}
}
