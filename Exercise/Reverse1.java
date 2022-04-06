import java.util.Scanner;

public class Reverse1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter The String:");
        String n=sc.nextLine();
        String rev = "";
        //traversing string & fetching string
        for(int i=n.length()-1;i>=0;i--){
            rev=rev+n.charAt(i);
        }
        System.out.println("The Reverse Is:"+rev);

    }}


