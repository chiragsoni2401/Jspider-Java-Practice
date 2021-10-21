
public class Student extends Citizen {
	long id ;
	double marks;
	public Student(String name, int age, long id, double marks) {
		super(name, age);
		this.id = id;
		this.marks = marks;
	}

}

/*  --------------------By Omkar Sir----------------------------
 * when we need to relate two classes of same type then we go for inheritance
 * and when two classes are of different type then we go for HAS-A relationship 
 */
