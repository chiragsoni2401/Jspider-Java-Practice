
public class A {
	String s1 = "jspiders";
	

public static void main(String[] args) {
	A a = new A();
    B b = new B();
    C c = new C();
    String st1 = "java";
    String st2 = "java";
    String st3 = "java";
    String st4= new String("raju");
    st4= new String("ramu");
    
    
	System.out.println(a.s1);
	System.out.println(b.s2);
	System.out.println(c.s3);
	System.out.println(st1);
	System.out.println(st2);
	System.out.println(st3);
	System.out.println(st4);
	if(st1.equals(st2))
	{
		System.out.println("yes");	
	}
	else {
		System.out.println("no");
	}
	}

}
