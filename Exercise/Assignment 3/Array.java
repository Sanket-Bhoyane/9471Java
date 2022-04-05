import java.util.*;
public class Array {
    public static void main(String [] args){
int a[];
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter The Size:");
        int n= sc.nextInt();
        a=initializeArray(n);
        System.out.println("Array Elements Are:");
        for(int i=0;i<n;i++){
            System.out.println(a[i]+"");}
    insertElement(a,n);}
  static  Scanner sc=new Scanner (System.in);

    public static void insertElement(int []a,int n) {
        int x;
        System.out.println("\n Enter Position:");
        int pos = sc.nextInt();
        if (pos > n - 1 || pos < 0) {
            System.out.println("Please Enter The Valid Position.");
        } else {
            System.out.println("Enter The Specific Number:");
             x = sc.nextInt();


            for (int i = n; i >= pos; i--) {
                a[i] = a[i - 1];

            }
            a[pos] = x;
            n++;
            System.out.println("\n AFter inserting The new Array:");
            for (int i = 0; i < n; i++) {
                System.out.printf("%3d",a[i]);
            }

        }
    }

       public static int[] initializeArray(int n) {
           int[] a = new int[10];
           System.out.println("enter " + n + "elements in array:");
           for (int i = 0; i < n; i++) {
               a[i] = sc.nextInt();

           }
           return a;
       }}

