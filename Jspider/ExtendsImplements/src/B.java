
public class B extends A implements C, D{
//you can't write like public class B implements C,D extends A	
	

	public static void main(String[] args) {
	B b = new B();
	b.a();
	
		System.out.println("I am class B");
		b.c();
		b.d();
		
		

	}
	
	public void c() {
		System.out.println("I am of interface C ");
	} 
	 public void d() {
		 System.out.println("I am of interface D ");
	}

}
