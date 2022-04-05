
import java.util.Scanner;

public class Index {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        //declaring And intializing the array
        System.out.println("Enter The Size");
        int n=sc.nextInt();

        System.out.println("Enter The element Of Array:");

        int[] a=new int[n];
        for(int i=0;i< a.length;i++){
            a[i]=sc.nextInt();}
        //finding the position of sp value in array
        System.out.println("Enter The Sp value:");
    int b= sc.nextInt();
    for(int i=0;i<a.length;i++){
        if(b==a[i]){
            System.out.println("The Position Of Sp Value Is:"+i);
        }
    }}




}
