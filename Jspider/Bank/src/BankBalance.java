public class BankBalance {
	 String name;
	double accBalance =10000.00;
	void withdraw(double amt){
		//member variables of a class can be used by member functions of that class
	if(accBalance>amt)	
		accBalance = accBalance - amt;
	System.out.println("You withdrawn Rs. "+amt+ ", Your Balance is Rs. "+accBalance);
	}
	public BankBalance(String y) {
		name=y;
		
	}
	
	}
class ATM extends BankBalance {
	public ATM(String y) {
		super(y);
	}
	
}



