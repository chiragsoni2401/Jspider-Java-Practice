/* if  2nd lowest is not possible then print -1,
it will happen when all elements are same */

import java.util.Scanner;
class SecondLowest{
	public static void main (String[] args) {
	Scanner sc =new Scanner(System.in);
	int t = sc.nextInt();
	
	while(t--> 0)
	{int i = 0;
	int ssmall= 0;
	int count= 0;
	int lowest=0;
	int thsmall=0;
	    int size = sc.nextInt();
	    int a[] = new int[size];
	    for(;i<size;i++)
	    {
	        a[i] = sc.nextInt();
	        
	    }
	    
	    i = 0;
	        for(int k = i+1;k<a.length;k++){
	            if(a[i]>a[k])
	            {ssmall = a[i];
	            	i=k;
	            	
	            
	            }
	            else if(a[i]==a[k]){
	                count++;
	            }
	            else if(i==0&&k==1){
	            	ssmall=a[k];
	            }else if(a[k]<ssmall)
	            {
	            	ssmall=a[k];
	            }
	            
	        }
	        
	        if(count==size-1){
	            System.out.println("-1");
	        }
	        else{
	        	lowest=a[i];
	        System.out.println(lowest+" "+ssmall);
	        
	        
	        }
	        i=0;
	        for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j] && a[j]>lowest && a[j]>ssmall){
					i=j;
				
				}
			}
	    	thsmall=a[i];
	        System.out.println(thsmall);
	    }
	    

	}
}
