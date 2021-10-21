package circulardoublylinkedlist;


//Note: There is no concept of head and last node in the circular linked list
public class CircularDoublyLinkedList {
	
		
		
		Node head;
		Node last;
		class Node{
			int data;
			Node next;
			Node prev;
			
			Node(int data){
				this.data = data;
			}
		}
		
		//inserting at head in doublylinkedlist
		//it will insert in the forward direction
		public void insert(int new_data) {
			Node new_node = new Node(new_data);
			
			if(head ==null) {
			new_node.next = head;
			head = new_node;
			last = head;
			last.next = head;
			last.prev = head;
			}
			else {
				new_node.next = head;
				head.prev = new_node;
				head = new_node;
				
				last.next = new_node;
				new_node.prev = last;
			}
		}
	//it will insert in the left direction
		public void insertAfterGivenNode(Node given_node, int new_data) {
			
			
			if(given_node.next.equals(head)) {
				System.out.println("There is only one node in the list ");
				Node new_node = new Node(new_data);
				head.next = new_node;
				new_node.prev = head;
				new_node.next = head;
				head.prev = new_node;
				
			}
			else {
				Node new_node = new Node(new_data);
			//while writing logic make sure that head node is the first node whose next is not null
			given_node.next.prev = new_node;
			new_node.next = given_node.next;
			given_node.next = new_node;
			new_node.prev = given_node;
			}
		}
		public void delete(Node given_node) {
			
			given_node.prev.next = given_node.next;
			given_node.next.prev = given_node.prev;
			
		}

		//This method is written bcz when you will deal with delete method then you may need the reference of the node which is to be deleted
		public Node getRef(int data) {
			if(head == null) {
				System.out.println("List is empty");
				return null;
			}

			Node temp = head ;
			while(temp.data != data) {
				temp = temp.next;
				if(temp.equals(head)) {
					System.out.println("No such data found");
					return null;
				}
				
			}
			
			return temp;
		}


}
