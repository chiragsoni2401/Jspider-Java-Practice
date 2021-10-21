
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class FindEvenOrOddNum{
       
        public static void main(String args[]) throws NumberFormatException, IOException{
               
                System.out.println("Enter the number: ");
               
                //get input from the user
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int a = Integer.parseInt(br.readLine());
       if(a%2==0)
       {System.out.println(a+ "is even no.");
        }
       else
    	   {System.out.println(a+"is odd no.");
    	   }
    	   }
}