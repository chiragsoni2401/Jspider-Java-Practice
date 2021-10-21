//to print patterns those exactly fit into matrix you should rows & columns using for loops

public class MatrixPattern {
	public static void main (String[] args) {
		
	for(int i = 0 ;i<4; i++) {
		for(int j = i;j<i+1;j++) {
			System.out.print("*");
		}
		System.out.println();
		for(int k = 0;k<=i;k++) {
		System.out.print(" ");
		}
	}
	}
}