public class Queue <T>{
	private static class QueueNode <T> {
		private T data;
		private QueueNode<T>  next;
		private QueueNode<T>  prev;
		public QueueNode(T data){
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public static class MyQueueIsEmptyException extends Exception
	{
		public MyQueueIsEmptyException(String message)
		{
			super(message);
		}
	}

	private QueueNode<T>  first;
	private QueueNode<T>  last;
	private int size;

	public Queue(){
		this.first = null;
		this.last = null;
		this.size = 0;
	}

	public boolean isEmpty() {
		return (this.size == 0);
	}

	public void push(T data){
		QueueNode<T> myQueueNode = new QueueNode<T>(data);
		if (this.last == null){
			this.first = myQueueNode;
			this.last = myQueueNode;
		} else {
			this.last.next = myQueueNode;
			this.last = myQueueNode;
		}
		this.size++;
	}

	public T pop(){
		if (this.isEmpty()){				
			throw new java.lang.IllegalStateException();
		}
		T data = this.first.data;
		this.first = this.first.next;
		this.size --;
		return data;
	}

	public static void main(String args []){
		Queue <String> myQueue = new Queue<String>();
		System.out.println("Empty: " + myQueue.isEmpty());
		myQueue.push("It");
		myQueue.push(" ");
		myQueue.push("Works");
		myQueue.push("fine");
		System.out.println("Empty: " + myQueue.isEmpty());
		try {
			System.out.println(myQueue.pop());
			System.out.println(myQueue.pop());
			System.out.println(myQueue.pop());
			System.out.println(myQueue.pop());
			System.out.println(myQueue.pop());
			System.out.println(myQueue.pop());
		} catch (java.lang.IllegalStateException e) {
			System.out.println("Empty Ilegal State Exception: " + myQueue.isEmpty());
		} catch (java.lang.NullPointerException e) {
			System.out.println("Empty Null Exception: " + myQueue.isEmpty());
		}

	}
}