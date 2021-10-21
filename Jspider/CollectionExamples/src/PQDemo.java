import java.util.ArrayList;
import java.util.PriorityQueue;

public class PQDemo {

	public static void main(String[] args) {
		
		/*PriorityQueue q1 = new PriorityQueue();
		 
		q1.add(new Student(126,"Rahul" , 68.75));
		q1.add(new Student(135, "Chirag", 72.75));
		q1.add(new Student(145, "Kunal", 73.75));
		q1.add(new Student(165, "Gautam", 74.75));
		q1.add(new Student(175, "Naresh", 76.75));
		
		
		System.out.println("priority queue size " + q1.size());
		
		System.out.println("\""+"removing elements"+"\"");
		
		Student sss = (Student)q1.peek();
		
		
		Object o = q1.poll();
		while(o != null){
			
			System.out.println(o);
			o = q1.poll();
			}*/
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		for(int i:list) {
			System.out.println(i);
			
		}
		
		
	
	}

}
