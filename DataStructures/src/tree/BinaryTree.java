package tree;

public class BinaryTree {

	Node root = null;
	
	public void add(int data) {
		
		Node n1 = new Node(data);
		
		if(root==null) {
			root = n1;
			return;
		}
		
		Node t = root;
		Node parent;
		
		while(true) {
			parent = t;
			
			if(n1.data<t.data) {
				
				t = t.left;
				if(t==null) {
					parent.left = n1;
					return;
				}
			}
			else {
				t = t.right;
				if(t==null) {
					parent.right = n1;
					return;
				}
			}
		}
	}
	
	//traversing, there are 4 types of traversing techniques: 1>inOrder, 2>preOrder, 3>postOrder, 4>levelOrder from these 1>,2>,3> are important
	//inOrder Traversing 
	public void iOT(Node start) {
		
		if(start !=null) {
			iOT(start.left);
			System.out.print(start.data+" ");
			iOT(start.right);
		}
	}
//preOrder Traversing	
public void preOT(Node start) {
		
		if(start !=null) {
			
			System.out.print(start.data+" ");
			preOT(start.left);
			
			preOT(start.right);
		}
	}
//postOrder Traversing 
public void postOT(Node start) {
	
	if(start !=null) {
		postOT(start.left);
		                          
		postOT(start.right);
		System.out.print(start.data+" ");
	}
}

//Tree mirroring 
void mirror()
{
    root = mirror(root);
}

Node mirror(Node node)
{
    if (node == null)
        return node;

    /* do the subtrees */
    Node left = mirror(node.left);
    Node right = mirror(node.right);

    /* swap the left and right pointers */
    node.left = right;
    node.right = left;

    return node;
}

	
}
