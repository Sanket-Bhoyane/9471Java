import java.util.*;
public class AddList {

	public static void main(String[] args) {
		

ArrayList<String> team1=new ArrayList<String>() ;
team1.add("Sanket");
team1.add("Rohan");
team1.add("Tare");
System.out.println("Team 1 is:");
System.out.println(team1);
System.out.println();
ArrayList<String> team2=new ArrayList<String>();
team2.add("Sai");
team2.add("KD");
team2.add("Kisna");
System.out.println("Team 2 is:");
System.out.println(team2);
System.out.println();
team1.addAll(team2);
System.out.println("Combined team is:");
System.out.println(team1);
System.out.println();
System.out.println("Thank You For Joining Us.");
}
}