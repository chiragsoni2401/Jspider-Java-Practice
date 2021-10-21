import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int t = sc.nextInt();
	//static method call
	findPalindrome(t);
	
	}
	private static void findPalindrome(int t) {
		int temp =t;
		int r ,sum=0;
		while(t>0){
			r = t%10;
			sum = sum*10 +r;
			t = t/10;
		}
		if(sum==temp)
		System.out.println("Givem number is palindrome number");
		else
			System.out.println("Givem number is not palindrome number");
		}
	

}
