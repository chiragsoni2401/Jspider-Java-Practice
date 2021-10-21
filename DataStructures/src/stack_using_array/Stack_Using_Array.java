package stack_using_array;

public class Stack_Using_Array {
	
	//you can interchange private static and final
		 private Object[] obj;
		 
		 private int cp; 
		private int top  ;
		 
	public Stack_Using_Array(int cp) {
		if(cp<=0) {
			System.out.println("enter a valid size for stack");
		}
		else {
	top = -1;
	this.cp=cp;
			this.obj = new Object[cp];
			
		}
	}
	
	//push method
  public void push(Object data) {
	  
	  if(top == cp - 1)//cp-1 means last index of obj array
	  {
		  System.out.println("stack is overflow");
		  return;
	  }
	  obj[++top] = data;
  }
  
  public Object pop() {
	  if(top == -1) 
	  return null;
	  return obj[top--];
  }
  
  public boolean isEmpity() {
	  return top == -1;
  }
}
