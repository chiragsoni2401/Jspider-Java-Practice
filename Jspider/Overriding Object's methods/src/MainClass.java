
public class MainClass {
public static void main(String[] args) {
	System.out.println("***********************");
	
	WallBlock wb1 = new WallBlock(07, 44, 03);
	WallBlock wb2 = new WallBlock(07, 44, 03);
	
	System.out.println(wb1);
	System.out.println(wb2);
	
	if(wb1.equals(wb2))
	{
		System.out.println("Time on both the wall block are same");
	}
	else
	{
		System.out.println("Time on both the wall block are not same");
		
	}
	
	
	
	
	System.out.println("***********************");
	
}
}
