import java.util.Scanner;

public class ExtractFirstDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
int t = sc.nextInt();
//static method call
ExtractFirstDigit.findFirstDigit(t);
	}

	private static void findFirstDigit(int t) {
		int temp = t,count = 0,f = 1;
				
		while(t>0){
			int a = t%10;
			 t = t/10;
			count++;
                  if(count > 1)
                    f = f*10;
		}
		System.out.println("Number of digits "+count);
		/*while(count-->1){
			f= f*10;
		}
		/*for (int i = 0; i < count-1; i++) {
			f= f*10;
		}*/
		int res = temp/f;
		System.out.println("First digit of "+temp+" is "+res);
		
	}

}
