//write a program to find no. of "abc" in the given string
import java.util.Scanner;
public class CountSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-->0){
			System.out.println("Enter string");
			String str = sc.next();
			String str1 = "abc";
			int count = 0;
			for(int i = 0;i<str.length()-2;i++){
				if(str.substring(i, i+3).equals(str1)){
//as per given problem the second index of the substring() method should be highest index + 1 otherwise you will get StringIndexOutofboundException
//in general if second index of substring() is i + n then loop should run [string length -(n-1)] times				
					
					
					count++;
				}
				
			}
			System.out.println("abc found "+count+" times");
		}
		
	}

}
