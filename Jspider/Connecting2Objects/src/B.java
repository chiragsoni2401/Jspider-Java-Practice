
public class B {
	int x = 15;
	void disp(){
		System.out.println("running disp() method.....");
		
	}
	//specialization(used when an object wants to connect with only one object)
	void function(A arg){
		arg.test();
	}

}
