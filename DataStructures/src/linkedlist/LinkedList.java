/*
 * -----------------IMPORTANT------------------------
 * In the LinkedList to get the element previous to head you should do like this: previous = head.next;
 * like this previous' previous is: previous = previous.next; and so on.
 */
package linkedlist;


public class LinkedList {
	
	Node head;
	
	 class Node{
		int value;
		
		Node next;
		
		public Node(int value) {
			this.value=value;
		}
	}
	//inserting element into LinkedList at head
	void insert(int new_data) {
		
		//creating new node
		Node new_node = new Node(new_data);
		
		new_node.next = head;
		
		head = new_node;
		
	}
	//inserting in between other nodes
	/*note-this method is adding the new_node at just before the next_node. If the next_node is head then new_node will be added to the last but one position 
	 * so like this if the next_node is last but one then the new_node will be added to the last but second position and so on.
	 * 
	 * 
	*/
	void insertBetween(Node next_node, int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = next_node.next;
		
		next_node.next = new_node;
	}
	
	//inserting at last
	void insertAtLast(int new_data) {
		
		Node new_node = new Node(new_data);
		
//if the linked list is empity then making this new node as the head node		
		if(head == null) {
			head = new Node(new_data);
			return;
		}
//this new_node is going to be the last node so making its next as null	
		new_node.next = null;
		
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		
		//changing the next of last node
		last.next = new_node;
		return;
	}
	
	//printing LinkedList elements
	void printLinkedList(Node head) {
		Node temp = head;
		while(temp.next != null) {
			System.out.println(temp.value+" ");
			temp = temp.next;
		}
		System.out.println(temp.value+" ");

	}
	//reversing the linkedList
	/*void reverse(Node start) {
		if(start.next !=0)
		{
			reverse(start.next);
		}
	}*/
	//deleting the particular element 
	void delete(int data) {
		Node temp = head;
		while(temp.value != data) {
			temp = temp.next;
		}
		//getting the previous node of the current node for deletion operation
		//since each node has its next node in singly linked list so to delete a node we require previous node to link that node directly to the next node bypassing the current node but
		//the problem is that to get the previous node we have to traverse through entire linked list again 
		Node current_node = temp;
		Node temp1 = head;
		//if current_node is the head node then don't use below while loop otherwise you will get null pointer exception bcz in this case both current_node and 
		//temp1 will have the same node and thus temp1.next in the while loop will reach at the last node of the list where next is having null value
	if(current_node.equals(temp1))
		head = current_node.next;
	else {
		while(!current_node.equals(temp1.next)) {
			temp1 = temp1.next;
		}
	     current_node =current_node.next;
	     temp1.next = current_node;
	}
		
	}

	 
	 
	
}
