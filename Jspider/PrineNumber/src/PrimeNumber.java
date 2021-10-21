import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	int num = sc.nextInt();
	if(findPrime(num))
		System.out.println(num+" is a prime number");
	else
		System.out.println(num+" is not a prime number");

	}

	private static boolean findPrime(int num) {
		//if a number has exactly two factors i.e. 1 and itself then the given number is prime no.
		int factors=2;
		if(num ==1||num==0)
			return false;
		else{
			for(int i=2;i<num;i++){
				if(num%i==0){
					factors++;
					break;
				}
			}
		}
		if(factors==2){
			return true;
		}
		else
			return false;
		
	}

}
