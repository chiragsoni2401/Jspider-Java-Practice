
public class Overriding {
	void test(){
		System.out.println("Running test method");
	}
	
	
	

}
 
class Overriding1 extends Overriding{
	void test(){
		System.out.println("Running test method");
	}
	public static void main(String[] args) {
		
		Overriding1 ov = new Overriding1();
		ov.test();
	}
	
	
	
	
}
