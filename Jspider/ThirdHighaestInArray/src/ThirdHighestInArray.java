import java.util.Scanner;
public class ThirdHighestInArray {
public static void main (String[] args) 
 {
	Scanner sc =new Scanner(System.in);
	int t = sc.nextInt();
		
	while(t--> 0)
	{int i = 0;
	 int sh= 0;
	 int th = 0;
	 int size = sc.nextInt();
	 int a[] = new int[size];
	 for(;i<size;i++)
	 {
	  a[i] = sc.nextInt();
		        
	 }
		    
        i = 0;
	    for(int k =1;k<a.length;k++)
	   {
		  if(a[i]<a[k])
		 {sh=a[i];
		    
		    if(a[i]<a[k+1])
		       {
		        th = a[i];
		         if(a[k+1]>a[k])
		          {
		            sh= a[k];
		            i= k+1;
		           }
		          else{
		            sh= a[k+1];
		            i=k;
		              }
		            		
		       }
		 
		    else{
		    	th=a[k+1];
		    	i=k;
		    }
		 }
		   else if(sh<a[k])
		          {
		            th= sh;
		            sh= a[k];
		          }
		        else{
		            	th= a[k];
		            }
		            
		        
		            /*else if(sh<a[k]){
		            	sh= a[k];
		            }*/
		        
		        
		        //System.out.println(th);
		        //System.out.println(sh);
		    }
	    System.out.println(a[i]);
	    System.out.println(th);

		}
 }
}



