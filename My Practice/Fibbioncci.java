import java.util.*;
public class Fibbioncci {
public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Input:");
    int n=sc.nextInt();
    int var1=0;
    int var2=1;
    
    System.out.println(+var1 );
    System.out.println(+var2 );

    for(int i=2;i<n;i++) {
        int var3 = var1 + var2;
        System.out.println(" "+var3);
        var1=var2;
        var2=var3;

    }

}}
