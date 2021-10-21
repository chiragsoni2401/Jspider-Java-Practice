
public class HighestOfDiagnal {
	int a[][] = {{25,3,5},
			     {5,9,1},
			     {1,3,10}};
		
	void highestOfDia(int a[][]){
		int i = 0;
		int j = 0;
		
		for (int l = i+1, m = j+1; l < a.length; l++,m++) {
	 
			if(a[i][j] < a[l][m]) {
				i = l;
				j = m;
			
			}
			
		}
		int hid1 = a[i][j];
		
		i = 0;
		j = a.length - 1;
		for (int l = i+1, m = j-1; l < a.length; l++,m--) {
			 {
			if(a[i][j] < a[l][m]) {
				i = l;
				j = m;
			}
			}
			
		}
		int hid2 = a[i][j];
		System.out.println("highest of d1 = "+hid1 );
		System.out.println("highest of d2 = "+hid2 );
	}
	
	//driver  
	public static void main(String[] args) {
		HighestOfDiagnal hd = new HighestOfDiagnal();
		hd.highestOfDia(hd.a);
	}
	
}
