import java.util.*;
public class Collection2{
public static void main(String[] args){
Deque<String> deque=new ArrayDeque<String>();
deque.add("Java");
deque.add("Python");
deque.add("C+");
deque.add("C++");
for(String str:deque){
System.out.println(str);
}}}