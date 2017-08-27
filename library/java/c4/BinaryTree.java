public class BinaryTree <T extends Comparable<T>> {
	private static class TreeNode <T extends Comparable<T>> {
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

	private static class BinaryTreeSearchNode<T extends Comparable<T>> extends TreeNode<T> {
		private BinaryTreeSearchNode<T> leftNode;
		private BinaryTreeSearchNode<T> rightNode;

		public BinaryTreeSearchNode(T myData){
			super(myData);
			this.leftNode = null;
			this.rightNode = null;
			this.children = null;
		}

		private void insertInorder(T data) {			
			if (data.compareTo(this.data) <= 0) {			
				if (this.leftNode == null){
					this.leftNode = new BinaryTreeSearchNode<T>(data);
					this.leftNode.parent = this;
				} else {
					this.leftNode.insertInorder(data);
				}

			} else {			
				if (this.rightNode == null){
					this.rightNode = new BinaryTreeSearchNode<T>(data);
					this.rightNode.parent = this;					
				} else {
					this.rightNode.insertInorder(data);
				}
			} 
		}

		public void myMethod(){
			System.out.println("This is a BinaryTreeSearchNode data type and method override");
		}

		public void myMethod(int data){
			System.out.println("This is a BinaryTreeSearchNode data type and method overload");
		}

		private void visitNode(){
			System.out.println(this.data);
		}

		int getHeight(BinaryTreeSearchNode<T> node) {
			if (node == null) return -1;
			return 1 + java.lang.Math.max(getHeight(node.leftNode), getHeight(node.rightNode));
		}

		private void inOrderTraversal(){
			if (this != null){
				try{
					this.leftNode.inOrderTraversal();
				} catch (java.lang.NullPointerException e){

				}				
				this.visitNode();
				try{
					this.rightNode.inOrderTraversal();
				} catch (java.lang.NullPointerException e){

				}				
			}
		}

		private void preOrderTraversal(){
			if (this != null){
				this.visitNode();
				this.leftNode.inOrderTraversal();			
				this.rightNode.inOrderTraversal();
			}
		}

		private void postOrderTraversal(){
			if (this != null){
				this.leftNode.inOrderTraversal();			
				this.rightNode.inOrderTraversal();
				this.visitNode();
			}
		}
	}


	private BinaryTreeSearchNode <T> root;
	private int totalNodes;

	public BinaryTree(T data){
		this.root = new BinaryTreeSearchNode<T>(data);
		this.totalNodes = 0;
		this.increaseNodeCount();		
	}

	protected void increaseNodeCount(){
		this.totalNodes ++;
	}

	public BinaryTreeSearchNode <T> getRoot(){
		System.out.println("Get Root:" + this.root.data);
		return this.root;
	}


	public static void main(String args []){		
		BinaryTree<Integer> myBinaryTree = new BinaryTree<Integer>(7);
		System.out.println("Node Count: " + myBinaryTree.totalNodes);
		BinaryTreeSearchNode<Integer> treeRoot =  myBinaryTree.getRoot();
		System.out.println("Height: " + treeRoot.getHeight(treeRoot));
		treeRoot.insertInorder(3);
		System.out.println("Height: " + treeRoot.getHeight(treeRoot));
		treeRoot.insertInorder(13);
		treeRoot.insertInorder(73);
		treeRoot.insertInorder(432);
		treeRoot.insertInorder(33);
		treeRoot.insertInorder(3243);
		treeRoot.insertInorder(343);
		treeRoot.insertInorder(37);
		treeRoot.insertInorder(763);
		treeRoot.insertInorder(34);
		treeRoot.insertInorder(39);
		treeRoot.insertInorder(30);
		System.out.println("Height: " + treeRoot.getHeight(treeRoot));
		System.out.println("Pre Order Traversal");
		treeRoot.preOrderTraversal();
		System.out.println("In Order Traversal");
		treeRoot.inOrderTraversal();
		System.out.println("Post Order Traversal");
		treeRoot.postOrderTraversal();
	}
}