
public class Government {
	void adharEnrollent(Citizen arg ){
		System.out.println("Adhar Enrollment For"+arg.name);
	}
	void incomeTax(Employee arg){
		System.out.println("Calculating tax ");
		double txtAmount = 0.0;
		if(arg.salary>=45000.00)
		{
			txtAmount =  (arg.salary*30)/100;
			System.out.println("Tax Amount :"+txtAmount);
		}
	}
	void scholarship(Student arg){
		if(arg.marks>70.00)
		{System.out.println("Scholarship Awarded to"+arg.name);}
	}

}
