package typecasting;

public class Sample {
	void func1(Demo2 arg){
		System.out.println("runnig func1() method");
	     System.out.println("x value :"+arg.x);
	     System.out.println("x value :"+arg.y);	 
	     Demo2 ref=(Demo2)arg;
	     
	}
}
