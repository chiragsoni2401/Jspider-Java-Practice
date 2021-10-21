import java.util.LinkedList;
import java.util.Scanner;
public class RepeatedCharacter implements AB{
	public static void main(String[] args){
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
       
        boolean bb = true;
        int count=0;
        for(int k=0;k<s.length();k++)
        {
        	for(int i = 0; i<s.length();i++)
        	{
        		if(s.charAt(k) == s.charAt(i))
        		{   
        			count++;
        		
        		if(count >1)
        		  {
        			System.out.println(s.charAt(i));
        			break;
        		  }
        		}
        	}
        	if(count>1)
        		break;
        }
        System.out.println(bb);
        if(count==1)
        {
        	System.out.println("-1");
        }
    }
     private static void demo() {
    	 
     }
	}

interface AB{
	
	static void demo() {
		System.out.println("demo of AB");
	}
}