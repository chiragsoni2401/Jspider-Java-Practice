
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class ConvertChar {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter string you want...");
		InputStreamReader sc1 =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(sc1);
		String s = br.readLine();
		System.out.println(s);
		StringBuffer ss = new StringBuffer(s);
		System.out.println(ss);
		char s1 = ss.charAt(0);
		String ssss = "a";
/*
 * Diff. b/w BufferReader & Scanner
 * 1. Using BufferReader we can just read string while using Scanner we can read int, float, double etc.
 * 2. BufferReader is there since jdk 1.1 while Scannner was introduced in jdk1.5
 * 3. When we need to read large string then we should go with BufferReader as it has large buffer (8KB) otherwise Scanner would be fine.
 * 4. BufferReader is synchronized while Scanner is not.
 * 5. BufferReader has just one method readLine() while Scannner has many nextInt(), nextFloat(), nextDouble(),nextString()		
 */
		
	//from herer your conversion starts	
		if(Character.isUpperCase(s1))
			System.out.println(ss);
		else
		{
			char s2 = Character.toUpperCase(s1);
			ss.replace(0, 1, Character.toString(s2));
			System.out.println(ss);
			
		}

	}


/*conversion can also be done by checking the first character for >=97(if yes then character is small so substract 32 to get capital letter else add nothing) same thing applies when converting into small letter for that if first character is <97 then add 32 to get the small letter */


public char convert(char a) {
	
	if('a'>='a'&&'a'<='z') {
	return	a=(char)(a-32);
	}
	else {
		return a;
	}
	
}
}