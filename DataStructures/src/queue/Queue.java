package queue;
//in en-queue operation, the new element is entered at the top of stack1. In de-queue operation, if stack2 is 
//empty then all the elements are moved to stack2 and finally top of stack2 is returned.
//you can see image inside queue folder to clarify the concept

import java.util.Stack;

public class Queue {
	
	private static Stack stack1 = new Stack();
	private static Stack stack2 = new Stack();
	
	//enqueueing operation
	
	public static void enQueue(Object obj) {
		
		stack1.push(obj);
	}

	public static Object deQueue() {
		
		if(stack1.isEmpty() && stack2.isEmpty())
		{
			System.out.println("Queue is empty");
			return null;
		}
		
		/* Move elements from stack1 to stack 2 only if
        stack2 is empty */
		if(stack2.isEmpty()) {
			
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		
		
		return stack2.pop();
	}
}
