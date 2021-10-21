package queue_using_array;
/*
 * Enqueue:Increment the rear pointer value and add the data to the queue
 * Dequeue:Remove the element from the queue and increment the front pointer 
 */
public class QueueImpl {
	
	Object[] obj;
	int cp;
	int front = -1, rear = -1;
	
	//initialize the size of queue
	QueueImpl(int cp){ 
		if(cp<=0)
			System.out.println("enter valid size ");
		else {
		this.cp = cp;
		obj = new Object[cp];
		}
	}
//enqueuing **Note: on first enqueuing only front will increment by one after that front will increment if dequeue will take place
	public void enqueue(Object data) {
		
		if(rear == cp-1) {
			System.out.println("Queue is full");
			return ;
		}
		if(rear == -1 && front == -1) {
			front++;
			obj[++rear]=data;
		}
		obj[++rear]=data;
	}
	
	//dequeuing 
	public Object dequeue() {
		
		if(front==-1) {
			//if front == -1 means no enqueuing took place
			System.out.println("Queue is empty");
			return null;
		}
		if(front>rear) {
			//when entire squeue will empty then front will become grater than rear
			System.out.println("Queue is empty");
			return null;
		}
		//first element will dequeue then front will increment
		return obj[front++];
	}
	
	//display
	void display() {
		
		//initially when no dequeuing took place then front will remain 0(incremented from -1 to 0 at the time of first enqueuing) only
		for(int i = front; i<=rear; i++) {
			System.out.println(obj[i]+" ");
		}
	}
}
