import java.util.*;
import java.io.*;

class RemoveVowels {
	public static void main (String[] args) {
		//code
		Scanner sc  = new Scanner(System.in);
		
		String s2;
		System.out.println("Enter no of test cases ");
		int t = sc.nextInt();
		s2=sc.nextLine();
		for(int i =0;i<t;i++){
		   s2 = sc.nextLine();
		   s2 = s2.replaceAll("[aeiouAEIOU]","");
		    System.out.println(s2);
		    
		}
	}
}