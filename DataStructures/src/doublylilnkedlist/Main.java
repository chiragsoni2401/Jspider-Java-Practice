package doublylilnkedlist;

//why we are importing the property Node if we are in the same package
//since Node is an inner class that is why 
import doublylilnkedlist.DoublyLinkedList.Node;

public class Main {

	public static void main(String[] args) {
		
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.deleteAtlast();
		doublyLinkedList.insertAthead(2);
		doublyLinkedList.insertAthead(4);

		doublyLinkedList.insertAthead(5);

		doublyLinkedList.insertAthead(6);
		doublyLinkedList.getRef(3);
		
	/*	doublyLinkedList.insertAthead(1);
		doublyLinkedList.insertAthead(2);

		doublyLinkedList.insertAthead(3);

		doublyLinkedList.insertAthead(4);

		doublyLinkedList.insertAthead(5);

		doublyLinkedList.insertAthead(6);

		doublyLinkedList.insertAthead(7);
		doublyLinkedList.print();
		
		//getting ref. of Node having data 3
				Node ref  = doublyLinkedList.getRef(3);
				doublyLinkedList.deleteAtmiddle(ref);
				//getting ref. of Node having data 3
						Node ref1  = doublyLinkedList.getRef(7);
				doublyLinkedList.insertAfterGivenNode(ref1, 11);
				doublyLinkedList.print();
				doublyLinkedList.deleteAthead();
				doublyLinkedList.print();
				doublyLinkedList.deleteAtlast();
				doublyLinkedList.print();
				doublyLinkedList.insertAtlast(9);
				doublyLinkedList.print();*/
		

	}

}
