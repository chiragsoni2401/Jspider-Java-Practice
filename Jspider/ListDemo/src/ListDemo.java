import java.util.ArrayList;
import java.util.List;
public class ListDemo {

	public static void main(String[] args) {
		List l1 = new ArrayList();
		l1.add("chirag");
		l1.add("hi");
		l1.add(12);
		l1.add("chirag");
		l1.add("chirag");
		l1.add("chirag");
		
		l1.add(new Student("chirag soni", 12345, 70.23));
		System.out.println(l1.size());
		System.out.println(l1.get(0));
		System.out.println(l1.get(6));
		System.out.println(l1.remove(2));
		System.out.println(l1.indexOf("chirag")+" "+l1.lastIndexOf("chirag"));
		System.out.println(l1);
		
		
		

	}

}
