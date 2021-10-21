package primenum;
import java.io.IOException;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args)throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
int i, count=0;
Scanner scan= new Scanner(System.in);
System.out.print("Enter a number");
int num= scan.nextInt();
for(i=2; i<num; i++)
{
	if(num%i==0)
	{count++;
	}
}
	if(count==0)
	{System.out.print("Entered number is prime");
	}
	else
	{System.out.print("Entered number is not prime");
	}
		
}

	

	}


