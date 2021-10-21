
public class RrverseString {
public static void main(String[] args) {
	String s = "chirag";
	System.out.println("given string "+s);

	int n = s.length();
	StringBuilder sb = new StringBuilder();
	while(n>0){
		char a = s.charAt(n-1);
				sb.append(a);
		n--;
	}
	System.out.println("reversed string "+sb);
	
}
}
