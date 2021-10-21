package tree;

public class Main {

	public static void main(String[] args) {

		BinaryTree binaryTree = new BinaryTree();
		
		binaryTree.add(10);
		binaryTree.add(7);
 
		binaryTree.add(13);

	/*	binaryTree.add(6);

		binaryTree.add(9);
		binaryTree.add(11);
		binaryTree.add(15);*/
		binaryTree.iOT(binaryTree.root);
		System.out.println();
		binaryTree.mirror();
		binaryTree.iOT(binaryTree.root);
		binaryTree.preOT(binaryTree.root);
		System.out.println();
		binaryTree.postOT(binaryTree.root);
		System.out.println(binaryTree.root);

	}

}
