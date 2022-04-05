import java.util.*;
public class BinaryClass {
//creating a method
    public static void binarySearch(int[] a, int key, int end, int start){
        int mid=(start+end)/2;//finding the mid value
        while(start<=end){ // here we ues a while loop for obtaining a result
            if(a[mid]<key){
                start=mid+1;
            }
            else if(a[mid]==key){
                System.out.println("The Given Nunber Is Available At Index:"+mid);
           break; }
            else{
                end=mid-1;
            }
            mid=(start+end/2);
        }// end of the while loop
if(start>end){
    System.out.println("The Value Is Not Found.");
}
    }
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Size:");// declaring and intializing array
    int n=sc.nextInt();
    System.out.println("Enter The Values:");

    int[] a=new int[n];
    for(int i=0;i<a.length;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("The Given Array Is:"+Arrays.toString(a));
    Arrays.sort(a);// here we sorting array
    System.out.println();
    System.out.println("The Sorted Array Is:"+Arrays.toString(a));
    System.out.println();
    int end=a.length-1;
    System.out.println("Please Enter The Value in given Array:");
    int key= sc.nextInt();
    System.out.println();

binarySearch(a,key,end,0);}}
