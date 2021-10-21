//below commands are used as statement when try-catch are used in currently running method 
public class Calculator {
	int divide(int n1,int n2){
		System.out.println("dividing "+n1+" by "+n2);
		
		//try {
			//System.out.println("try block started");
            return n1/n2;
          //  System.out.println("try block ended");
		//} catch (ArithmeticException e) {
			//System.out.println("cannot divide by 0 since divide by 1");
			//res = n1/1;
		//}
            
	}

}
