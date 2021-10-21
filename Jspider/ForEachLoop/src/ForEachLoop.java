import javax.management.ValueExp;

public class ForEachLoop {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,55,44,77};
		for (int i : a) {
			System.out.println(i+1);
			
		}
		String s= "chirag";
		char[] ch = s.toCharArray();
		for (char c : ch) {
			System.out.println(c);
		}
				

	}

}
