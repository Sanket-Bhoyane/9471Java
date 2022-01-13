Itereimport java.util.*;
public class Collection5{
public static void main(String[]args){
PriorityQueue<String> queue=new PriorityQueue<String>();
queue.add("Java");
queue.add("is");
queue.add("the");
queue.add("best");
queue.add("programming");
queue.add("language");
System.out.println("head:"+queue.element());
System.out.println("head:"+queue.peek());
System.out.println("Iterating the queue elements");
Iterator itr=queue.iterator();
while(itr.hasNext()){
System.out.println(itr.next());}
queue.remove();
queue.poll();
System.out.println("after removing the elements");
Iterator itr2=queue.iterator();
while(itr.hasNext()){
System.out.println(itr.next());}}}