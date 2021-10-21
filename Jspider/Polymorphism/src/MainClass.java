
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Citizen c1 = new Citizen("Raju",25);
		Student s1 = new Student("Gautam",21,2323,521);
		 Employee e1= new Employee("pandit",22 , 2740, 23000);
		 
		 Government gn = new Government();
		 gn.adharEnrollent(c1);
		 gn.adharEnrollent(s1);
		 gn.adharEnrollent(e1);
		 
		 gn.scholarship(s1);
		 gn.incomeTax(e1);

	}

}
