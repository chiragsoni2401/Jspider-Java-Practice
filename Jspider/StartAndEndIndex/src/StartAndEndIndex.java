import java.util.Scanner;

public class StartAndEndIndex {
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--> 0)
		{int i = 0;
	     
	     int startIndex = 0;
	     int endIndex = 0;
	     int flag=0;
		
	
		    int size = sc.nextInt();
		    int a[] = new int[size];
		    for(;i<size;i++)
		    {
		        a[i] = sc.nextInt();
		        
		    }
		    System.out.println("enter elements to be found");
            int entered =sc.nextInt();
            for(i=0;i<size;i++){
 		       
		        if(entered==a[i]){
		        	startIndex=i;
		        	break;
		        }
		        //if entered number is not found then print -1
		        else if(i==size-1){
		        	flag=1;
		        	break;
		        }
		    }
            i=0;
            for(i=1;i<=size-startIndex;i++){
  		       if(flag==1){
  		    	   break;}
		        if(entered==a[size-i]){
		        	endIndex=size-i;
		        	break;
		        }
		    }
            if(flag==1){
            	System.out.println("-1");
            }
            else{
            System.out.println(startIndex+" "+endIndex);
            }
            
}
	}
}
