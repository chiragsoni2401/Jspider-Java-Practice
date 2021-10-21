import java.util.Scanner;
import java.util.Arrays;


//the program is about to find the minimum number to add to the array tvo get the sum even
class EvenSum {
	public static void main (String[] args) {
	    int sum = 0;
	    Scanner sc = new Scanner(System.in);
            System.out.println("enter test cases ");
	    int t = sc.nextInt();
	    for(int i = 0; i<t;i++){
             System.out.println("enter number of array elements");
	        int num = sc.nextInt();
	        int a[] = new int[num];
//initializing the array along with adding the array elements
	        for(int j = 0;j<a.length;j++){
	            a[j]= j+1;
	            sum = a[j]+ sum;
	        }
                 System.out.println(Arrays.toString(a));
	        
System.out.println("sum is "+ sum);
	        for(int l = 0;l<a.length;l++){
	            if((sum+a[l])%2==0){
	                System.out.println(a[l]+" is the minimum number to be added to get sum even");
	                break;
	            }
	        }
	    }
		//code
	}
}

