public class Stack <T> {
	private class StackNode <T> {
		private T data;
		private StackNode<T> next;

		public StackNode(T element) {
			this.data = element;
			this.next = null;			
		}
	}

	private StackNode<T> top;

	public Stack() {
		this.top = null;
	}	

	public void push(T data){
		StackNode<T> myNode = new StackNode<T>(data);
		myNode.next = this.top;
		this.top = myNode;
	}

	public T peek(){
		return this.top.data;
	}

	public T pop(){		
		T data = null;
		if (this.top != null){
			data = this.top.data;
			this.top = this.top.next;
		}				
		return data;
	}

	public static void main(String [] args){
		Stack<Integer> myStack = new Stack<Integer>();
		myStack.push(7);
		myStack.push(4);
		myStack.push(2);
		myStack.push(1);
		System.out.println("P");
		System.out.println(myStack.peek());
	}	
}