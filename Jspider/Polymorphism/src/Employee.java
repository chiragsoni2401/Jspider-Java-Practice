
public class Employee extends Citizen {
		long id;
	double salary;
	public Employee(String name, int age, long id, double salary) {
		super(name, age);
		this.id = id;
		this.salary = salary;
	}


}
