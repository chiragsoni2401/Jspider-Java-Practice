import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int factorial=findFactorial(sc.nextInt());
System.out.println(factorial);
	}

	private static int  findFactorial(int n) {
		//int result =0;
	if(n==1||n==0)
			return 1;
	else
		return n*findFactorial(n-1);
	//use below comments if you need to catch StackOverflowError in case of negative value 
		/*else
			{try { result =n*findFactorial(n-1);
				
			} catch (StackOverflowError e) {
				System.out.println("Enter only positive value ");
			}
			return result;}*/
	//use below comments if you want to calculate through loop
	
		/*int res = 1;
		for (int i = 1; i <=n; i++) {
			res= res*i;
		}
		return res;*/
	}

}
