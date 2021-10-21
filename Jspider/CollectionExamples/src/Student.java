
public class Student implements Comparable {
	int rollno;
	String name;
	double marks;
	
	public Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student s= (Student)o;
		
		return this.rollno-s.rollno;
	}
}
