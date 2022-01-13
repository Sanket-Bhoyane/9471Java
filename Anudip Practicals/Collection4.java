import java.util.*;
public class Collection4{
public static void main(String[]args){
Vector<String> v=new Vector<String>();
v.add("Sanket");
v.add("Sachin");
v.add("Bhoyane");
Iterator<String> itr=v.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}}}