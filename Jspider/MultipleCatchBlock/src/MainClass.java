
public class MainClass {
	public static void main(String[] args) {
		System.out.println("main method started");
		int[] arr1 = new int[5];
		Calculator c1 = new Calculator();
		try {
			System.out.println("try block started");
			arr1[3] =c1.divide(12,1 );
			System.out.println("try block ended");
		} catch (ArithmeticException e) {
			System.out.println("cannot divide by 0 ");
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("index out of boundary");
	}
		System.out.println("element is "+arr1[3]);
		System.out.println("main method ended");

}
}
