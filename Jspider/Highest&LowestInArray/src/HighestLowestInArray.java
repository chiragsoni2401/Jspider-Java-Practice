import java.util.Scanner;

public class HighestLowestInArray {
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--> 0)
		{int i = 0;
	
		long lowest = 0;
	
		    int size = sc.nextInt();
		    long a[] = new long[size];
		    for(;i<size;i++)
		    {
		        a[i] = sc.nextInt();
		        
		    }
		    i=0;
		    if(size==1){
		    	
		    	lowest=a[i];
		    }
		    
		    i = 0;
	    
		        for(int k = i+1;k<a.length;k++){
		            if(a[i]<a[k])
		            {
		            	if(i==0&&k==1)
		                 {lowest = a[i];}
		                  i=k;
		            }
		            
		            else {
		            	if(i==0 && k==1)
		                  {lowest =a[k];}
		                 else if(a[k]<lowest)
		                       {lowest = a[k];}
		            	}
		            
		               
                 }
		        System.out.println(lowest+" "+a[i]);
		        
		}
	}
}
