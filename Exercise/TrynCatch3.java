public class TrynCatch3 {
public static void main(String[]args) {
	try {
		int[] arr=new int[2];
		System.out.println("Access Three Elements:"+arr[3]);
	}
	catch(Exception e){
		System.out.println("Error is thrown:"+e);
	}
	finally {
		System.out.println("Finally is Block");
	}	System.out.println("Out Of Try Catch & Finally");
}}