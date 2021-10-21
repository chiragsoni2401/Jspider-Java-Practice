/*below comments are used as statement if it is asked to print -1 in case 2nd highest is not possible
it will happen when all elements are same */

import java.util.Scanner;
class SecondHighestOfArray{
	public static void main (String[] args) {
	Scanner sc =new Scanner(System.in);
	int t = sc.nextInt();
	
	while(t--> 0)
	{int i = 0;
	int sh= 0;
	//int count= 0;
	    int size = sc.nextInt();
	    int a[] = new int[size];
	    for(;i<size;i++)
	    {
	        a[i] = sc.nextInt();
	        
	    }
	    
	    i = 0;
	        for(int k = i+1;k<a.length;k++){
	            if(a[i]<a[k])
	            {sh = a[i];
	            	i=k;
	            	
	            
	            }
	            /*else if(a[i]==a[k]){
	                count++;
	            }*/
	            else if(a[k]>sh){
	            	sh= a[k];
	            }
	        }
	        
	        /*if(count==size-1){
	            System.out.println("-1");
	        }
	        else{
	        System.out.println(sh);
	        }*/
	        System.out.println(sh);
	    }
	    

	}
}
