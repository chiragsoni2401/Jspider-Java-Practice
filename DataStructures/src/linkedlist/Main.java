package linkedlist;

public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		System.out.println();
		System.out.println(list.head.next.value+" "+list.head.value);
				list.printLinkedList(list.head);
				list.delete(6);
				System.out.println();
				list.printLinkedList(list.head);

	}

}
