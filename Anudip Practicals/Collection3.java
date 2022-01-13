import java.util.*;
public class Collection3{
public static void main(String[] args){
LinkedList<String> al=new LinkedList<String>();
al.add("Java");
al.add("Python");
al.add("C+");
al.add("C++");
Iterator<String> itr=al.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}}}