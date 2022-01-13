import java.util.Arrays;
public class Sorted{
public static void main(String[] args){
int[] array_1={12,21,78,2,9,45,10};
String[] array_2={"Sanket","Manish","Anil","Suraj","Rohan"};
System.out.println("numeric arrray:"+Arrays.toString(array_1));
Arrays.sort(array_1);
System.out.println("Sorted numeric arrray:"+Arrays.toString(array_1));
System.out.println("String arrray:"+Arrays.toString(array_2));
Arrays.sort(array_2);
System.out.println("Sorted String arrray:"+Arrays.toString(array_2));}}