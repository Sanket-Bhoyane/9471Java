import java.util.*;
public class NegativeCount {
public static void main(String[] args){
    //getting input from user
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Size Of Array:");
    //declaring the values of array
    int n=sc.nextInt();
    System.out.println("Enter The element Of Array:");
int[] a=new int[n];
for(int i=0;i< a.length;i++){
    a[i]=sc.nextInt();

}int count=0;
int temp=0;
//checking the negative numbers in array
for(int i=0;i<a.length;i++){
    if(a[i]<0){
        count++;
        temp=0+1;
    }
}
if(temp!=0){
    System.out.println("The Count Of Negative Numbers Are:" +count);
}
else{
    System.out.println("There's No Any Negative Numbers.");
}

}}
