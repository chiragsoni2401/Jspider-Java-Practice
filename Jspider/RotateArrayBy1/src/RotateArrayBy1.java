import java.util.Scanner;

public class RotateArrayBy1 {
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Test Cases");
		int t = sc.nextInt();
		
		while(t--> 0)
		{int i = 0;
	     
	     int y = 0;
		
	
		    int size = sc.nextInt();
		    int a[] = new int[size];
		    for(;i<size;i++)
		    {
		        a[i] = sc.nextInt();
		        
		    }
		    i=0;
		     
		        y=a[size-1];
		        
		        
		    for(i=1;i<size;i++){
		       
		        a[size-i]=a[size-1-i];
		    }
		    i=0;
		    a[i]=y;
		    for (int j = 0; j < a.length; j++) {
				System.out.print(a[j]);
				System.out.print(" ");
				
			}
		}}}