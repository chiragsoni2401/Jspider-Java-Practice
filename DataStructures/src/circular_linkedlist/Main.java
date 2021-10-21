package circular_linkedlist;

public class Main {

	public static void main(String[] args) {
	
		CircularLinkedList circularLinkedList = new CircularLinkedList();
		circularLinkedList.insert(1);
		circularLinkedList.insert(2);
		circularLinkedList.insert(3);
		circularLinkedList.insert(4);
		circularLinkedList.insert(5);
		circularLinkedList.printLinkedList(circularLinkedList.head);
		System.out.println();
		circularLinkedList.delete(3);
		circularLinkedList.printLinkedList(circularLinkedList.head);


	}

}
