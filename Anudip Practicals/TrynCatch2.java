import java.io.*;
public class TrynCatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try {
		int[] arr=new int[2];
		System.out.println("Access Three Elements:"+arr[3]);
		}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Exception Thrown:"+e);
	}
	System.out.println("out of block");
			 }
	}