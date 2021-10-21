import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {
	static int popularCount;
public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		while(t--> 0)
		{
	  int size = sc.nextInt();
		    int a[] = new int[size];
		    for(int i = 0;i<size;i++)
		    {
		        a[i] = sc.nextInt();
		        }
		    System.out.println("most popular element is "+getPopularElement(a)+", "+popularCount+" times");
		    }
	}
		//getting elemenet which is most popular
	public static  int getPopularElement(int[] a)
	{
	  int count, tempCount=0;
	  int popular = a[0];
	  int temp = 0;
	  //the array b is initialized so that the same element will not be picked once again
	  int[] b = new int[a.length];
	  int[] c = new int[a.length];
	  int newCount= 0;
	  for (int i = 0; i < (a.length - 1); i++)
	  {
		  if(b[i] !=1) {
	    temp = a[i];
	   b[i]++;
	    count=1;
	    for (int j = 1; j < a.length; j++)
	    { if(b[j] !=1) { 
	      if (temp == a[j]) {
	    	   b[j]++;
	        count++;
	      }
	    }
	    }
	    if (tempCount < count )
	    {//after completion of execution the total number of one's in the array c is equal to the 
	    	//total number of elements which are more theh once
	    	c[i]++;
	    newCount++;
	      popular = temp;
	      tempCount= count ;
	    }
		  }
		   }
	  popularCount=tempCount;
	  //----------------new logic
	/*  int p = 0;
	  int[] rs = new int[newCount];
	  for(int k = 0; k<newCount; k++) {
		  for(;p<c.length;p++) {
			  if(c[p] != 0) {
				  rs[k] = a[p];
				  break;
			  }
				  }
	  }*/
	  return popular;
	  }
	//this method will return no of times the popular element is present in the array
	}
