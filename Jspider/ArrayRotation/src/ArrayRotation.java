import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class ArrayRotation{
	Integer x = 3;
	public static void main(String[] args) {
		ArrayRotation arrayRotation = new ArrayRotation();
		if(arrayRotation.equals(arrayRotation))
			System.out.println(true);
		System.out.println(false);
	}
}

/*import java.util.Scanner;
public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter test cases");
		int t = sc.nextInt();
		
		while(t--> 0){
			System.out.println("enter array size");
			int size = sc.nextInt();
			int[] a = enterArrayElements(size, sc);
			printArray(a);
			System.out.println("how many times you want to rotate");
			int d = sc.nextInt();
			leftRotate(a,d);
			printArray(a);
		}
		
	}
//array initialization
	private static int[] enterArrayElements(int size, Scanner sc) {
		System.out.println("enter array elements");
		
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		return a;
	}
	//fn for rotating an array by one

	static void leftRotateByOne(int[] a){
		int temp = a[0];
		
		for (int i = 0; i < a.length-1; i++) {
			a[i] = a[i+1];
		}
		a[a.length-1] = temp;
	}
//fn for rotating an array d times
	static void leftRotate(int[] a, int d){
		
		 for (int i = 0; i < d; i++) {
			leftRotateByOne(a);
		}
	}
	//print array elements
	static void printArray(int[] a){
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i] + " ");
		}
	}
	
}*/
