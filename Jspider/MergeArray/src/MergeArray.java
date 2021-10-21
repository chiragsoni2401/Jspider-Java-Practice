import java.util.Scanner;

public class MergeArray {
	
	void arrayInitialization(Scanner arg){
		//entering test cases
		System.out.println("enter test cases");
		
		int t = arg.nextInt();
                int l,i,size;
				l = 0;
                i = 0;
                size = 0;
                //outer while loop
		while(t-->0){

			//initializing a1[]'s size
			System.out.println("enter a1[]'s size");
			
			int as1 = arg.nextInt();
			int a1[] = new int[as1];
			//inner while loop-1
			while(as1-->0){
				
				System.out.println("enter a1[]'s elements");
				a1[i] = arg.nextInt();
				System.out.print(a1[i]);
				i++;
				
			}
            i = 0;
			//initializing a2[]'s size
			System.out.println("enter a2[]'s size");
			int as2 = arg.nextInt();
			int a2[] = new int[as2];
			//inner while loop-2
			while(as2-->0){
				
				System.out.println("enter a2[]'s elements");
				a2[i] = arg.nextInt();
				System.out.print(a2[i]);
				i++;
			}
			i = 0;
System.out.println();
			
			
			
			//inner while loop-3
	//concept of merging two arrays		
			if(a1.length>a2.length){
				size = a1.length;
			}
			else{
				size = a2.length;
			}
			int a3[] = new int[a1.length+a2.length];
			for(;i<size;i++){
				
				if(i<a1.length)
					{a3[l] = a1[i];
					l++;}
				if(i<a2.length)
					{a3[l] = a2[i];
					l++;}
			}
			i = 0;
			for(;i<(a1.length+a2.length);i++){
				System.out.print(a3[i]+" ");
			}


		}
		
		
	}
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		MergeArray ma = new MergeArray();
		Scanner sc = new Scanner(System.in);
		ma.arrayInitialization(sc);
		long endTime = System.currentTimeMillis();
		
		System.out.println("Time elapsed " +(endTime- startTime));
	}

}
