public class BinaryTree <T> {
	private static class TreeNode <T>{
		protected T data;
		protected TreeNode <T> parent;
		protected TreeNode <T>[] children;
		
		public TreeNode(T myData){
			this.data = myData;
			this.parent = null;
			this.children = null;
		}

		public void  myMethod(){
			System.out.println("This is a TreeNode data type");
		}
	}

	private static class BinaryTreeNode<T>extends TreeNode{
		private BinaryTreeNode<T> leftNode;
		private BinaryTreeNode<T> rightNode;

		public BinaryTreeNode(T myData){
			super(myData);
			this.leftNode = null;
			this.rightNode = null;
			this.children = null;
		}

		public void myMethod(){
			System.out.println("This is a BinaryTreeNode data type and method override");
		}

		public void myMethod(int data){
			System.out.println("This is a BinaryTreeNode data type and method overload");
		}
	}

	private BinaryTreeNode <T> root;
	private int totalNodes;
	private int treeHeight;

	public BinaryTree(T data){
		this.root = new BinaryTreeNode<T>(data);
		this.totalNodes = 0;
		this.treeHeight = 0;
		this.increaseNodeCount();
		this.calculateHeight();
	}

	private void increaseNodeCount(){
		this.totalNodes ++;
	}

	private void calculateHeight(){
		this.treeHeight = 1;
	}

	private void visitNode(BinaryTreeNode myTreeNode){
		System.out.println(myTreeNode.data);
	}

	private void inOrderTraversal(BinaryTreeNode myTreeNode){
		if (myTreeNode != null){
			inOrderTraversal(myTreeNode.leftNode);
			this.visitNode(myTreeNode);
			inOrderTraversal(myTreeNode.rightNode);
		}
	}

	private void preOrderTraversal(BinaryTreeNode myTreeNode){
		if (myTreeNode != null){
			this.visitNode(myTreeNode);
			inOrderTraversal(myTreeNode.leftNode);			
			inOrderTraversal(myTreeNode.rightNode);
		}
	}

	private void postOrderTraversal(BinaryTreeNode myTreeNode){
		if (myTreeNode != null){
			inOrderTraversal(myTreeNode.leftNode);			
			inOrderTraversal(myTreeNode.rightNode);
			this.visitNode(myTreeNode);
		}
	}

	public static void main(String args []){		
		BinaryTree<Integer> myBinaryTree = new BinaryTree<Integer>(7);
		System.out.println("Node Count: " + myBinaryTree.totalNodes);
		System.out.println("Tree Height: " + myBinaryTree.treeHeight);
	}
}