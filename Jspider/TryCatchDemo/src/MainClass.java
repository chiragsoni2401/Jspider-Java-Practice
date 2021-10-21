
public class MainClass {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		int res =0;
		try {
			System.out.println("try block started");
			res =c1.divide(12, 0);
			System.out.println("try block ended");
		} catch (ArithmeticException e) {
			System.out.println("cannot divide by 0 since divide by 1");
			System.out.println("result is "+res);
		}
			}

}
