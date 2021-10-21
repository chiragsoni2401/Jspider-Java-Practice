import java.util.Scanner;

public class HighestLowestInArray1 {
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--> 0)
		{int i = 0;
         long highest=0;
		long lowest = 0;
		
		    int size = sc.nextInt();
		    long a[] = new long[size];
		    for(;i<size;i++)
		    {
		        a[i] = sc.nextInt();
		        
		    }
		    i=0;
		    if(size==1){
		    	highest=a[i];
		    	lowest=a[i];
		    }
		    
		    i = 0;
		        for(int k = i+1;k<a.length;k++){
		            if(a[i]<a[k])
		            {
		            i=k;
		            highest=a[i];
		            }
		            else {
	                	highest =a[i];
	                }

		        }
		            i=0;
		            for(int j=i+1;j<a.length;j++){
		                if(a[i]>a[j])
		            {
		            i=j;
		            lowest=a[i];
		            }
		                else {
		                	lowest =a[i];
		                }
		            }
                 
		        System.out.println(lowest+" "+highest);
		        
		}
	}
}
