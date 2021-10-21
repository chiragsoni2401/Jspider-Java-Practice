package circular_linkedlist;


//Note: There is no concept of head and last node in the circular linked list

public class CircularLinkedList {

	Node head;
	Node last;
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
		
		
		
		if(head == null) {
		new_node.next = head;
		
		head = new_node;
		
	       last = head;
		last.next = head;
		}
		else {
			new_node.next = head;
			
			head = new_node;
			
			last.next = new_node;
		}
		
	}
	void printLinkedList(Node head) {
		Node temp = head;
		while(!temp.next.equals(head)) {
			System.out.println(temp.value+" ");
			temp = temp.next;
		}
		System.out.println(temp.value+" ");
		
		System.out.println(temp.next.value+" ");
		

	}
	
	//deleting the particular element 
		void delete(int data) {
			Node temp = head;
			//loop for getting the current Node i.e. the Node which is to be deleted
			while(temp.value != data) {
				temp = temp.next;
			}
			//getting the previous node of the current node for deletion operation
			//since each node has its next node in singly linked list so to delete a node we require previous node to link that node directly to the next node bypassing the current node but
			//the problem is that to get the previous node we have to traverse through entire linked list again 
			Node current_node = temp;
			Node temp1 = head;
			
			while(!current_node.equals(temp1.next)) {
				temp1 = temp1.next;
			}
			//from the loop you will get temp1 which is exactly previous of the current_node
			
			//now making the current_node as next node of the current_node
		     current_node =current_node.next;
		     //as the below line will execute the node will be deleted
		     temp1.next = current_node;
		}
			
}
