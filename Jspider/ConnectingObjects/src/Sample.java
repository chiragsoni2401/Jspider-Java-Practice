
public class Sample { 
	void func1(Demo1 arg){
		System.out.println(arg.x);
		arg.test();
		//here Demo2 properties can't be accesed  by arg because Demo2 is upcasted to Demo1

	}

}
