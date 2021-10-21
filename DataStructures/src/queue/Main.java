package queue;

public class Main {

	public static void main(String[] args) {
//boxing is happening automatically		
		Queue.enQueue(1);
		Queue.enQueue(2);
		Queue.enQueue(3);
//unboxing is happening automatically		
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
		System.out.println(Queue.deQueue());
	}

}
