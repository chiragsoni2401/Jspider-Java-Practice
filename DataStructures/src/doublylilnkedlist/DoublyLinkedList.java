package doublylilnkedlist;

public class DoublyLinkedList {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data = data;
		}
	}
	
	//inserting at head in doublylinkedlist
	public void insertAthead(int new_data) {
		Node new_node = new Node(new_data);
		
		if(head ==null) {
		new_node.next = head;
		head = new_node;
		}
		else {
			new_node.next = head;
			head.prev = new_node;
			head = new_node;
		}
	}
	
	//inserting at last
	public void  insertAtlast(int new_data) {
		
		
		//getting the last node
		Node temp = head; 
		if(temp ==null) {
			System.out.println("list is empty so your data will be the first data");
			insertAthead(new_data);
		
		}
		else {
			Node new_node = new Node(new_data);
		while(!(temp.next==null)) {
			temp = temp.next;
		}
		temp.next = new_node;
	    new_node.prev = temp;
	    new_node.next= null;
		}
	}
	//insert at middle
	public void insertAfterGivenNode(Node given_node, int new_data) {
		
		
		if(given_node.next==null) {
			System.out.println("There is only one node in the list so new node will become the last node");
			insertAtlast(new_data);
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
	//deleting at middle 
	public void deleteAtmiddle(Node given_node) {
		//checking if given node is the head node
		if(given_node.equals(head)) {
			System.out.println("This is the first Node");
			deleteAthead();
		}
		else if (given_node.next.equals(null)) {
			System.out.println("This is the last Node");
			deleteAtlast();
		}
		else {
		given_node.prev.next = given_node.next;
		given_node.next.prev = given_node.prev;
		}
	}
	
	//deleting node at head
	public void deleteAthead() {
//checking if there is only one Node		
		if(head.next.equals(null)) {
			head = null;
		}
		else {
		head.next.prev = null;
		head = head.next;
		}
	}
	
	//deleting at last
	public void deleteAtlast() {
		//getting the last node
				Node temp = head; 
				if(temp == null) {
					System.out.println("List is empty");
					return;
				}
				while(!(temp.next==null)) {
					temp = temp.next;
				}
				temp.prev.next = null;
	}
	//print the node data
	public void print() {
		Node temp  =  head;
		if(temp == null) {
			System.out.println("List is empty");
			return;
		}
			
		while(!(temp == null)) {
			System.out.println(temp.data);
			temp = temp.next;
			
		}
		
	}
	
	//getting the existing Node reference 
	//since we have two methods 1>deleteAtmiddle and 2>insertAfterGivenNode where we may need the Node ref. so the below method will be helpful
	public Node getRef(int data) {
		if(head == null) {
			System.out.println("List is empty");
			return null;
		}

		Node temp = head ;
		while(temp.data != data) {
			temp = temp.next;
			if(temp == null) {
				System.out.println("We reached last node");
				System.out.println("No such data found");
				return null;
						}
		}
		
		return temp;
	}
}
