
public class MergeArray1 {
 public static void main(String[] args) {
	int l=0;
	int size=0;
		
int a1[] = {5,6};
int a2[] = {7,8,9};
if(a1.length>a2.length){
	size = a1.length;
}
else{
	size = a2.length;
}
int a3[] = new int[a1.length+a2.length];
for(int i = 0;i<size;i++){
	
	if(i<a1.length)
		{a3[l] = a1[i];
		l++;}
	if(i<a2.length)
		{a3[l] = a2[i];
		l++;}
}
	
    

for(int j=0;j<(a1.length+a2.length);j++){
	System.out.print(a3[j]+" ");
}
}  
}
