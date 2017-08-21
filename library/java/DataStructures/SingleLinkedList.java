public class SingleLinkedList <T> implements SingleLinkedListInterface {
	private int size;
	protected Node head;
	protected Node tail;

	public SingleLinkedList() {
		size = 0;
		head = null;
		tail = null;
	}

	public Boolean isEmpty(){
		return (this.size == 0);
	}
	public int size(){
		return (this.size);
	}

	public Node getHead(){
		return this.head;
	}
	public Node getTail(){
		return this.tail;
	}
	public Node addNode(T element){		
		Node tmpNode = new Node(element,null,null);
		// check empty
		if (this.isEmpty()){			
			this.head = tmpNode;
			this.tail = tmpNode;
		} else {
			Node nodeIterator = this.head;
			while (nodeIterator.next != null){
				nodeIterator = nodeIterator.next;
			}
			nodeIterator.next = tmpNode;
			this.tail = tmpNode;
		}
		this.size ++;
		return this.head;
	}

	public void removeNode(T element){
		Node nodeIterator = this.head;
		while (nodeIterator != null){	
			if (nodeIterator.element == element) {
				if (nodeIterator == this.head){					
					this.head = this.head.next;
					this.head.prev = null;					
				} else {
					nodeIterator.prev.next = nodeIterator.next;
					nodeIterator.next.prev = nodeIterator.prev;
					if (nodeIterator.next == null) {
						this.tail = nodeIterator;
					}
				}
				this.size--;
			}
			nodeIterator = nodeIterator.next;		
		}
	}

	public void iterateList(){
		Node nodeItertor = this.head;
		while (nodeItertor != null){
			System.out.println(nodeItertor.element.toString());
		}
	}

	public static void main(String[] a){    
		System.out.println("I am a static main method inside Inteface !!");
		SingleLinkedList<Integer>  myL = new SingleLinkedList<Integer>();
		myL.addNode(new Integer(5));
		myL.addNode(new Integer(234));
		myL.addNode(new Integer(234523));
		myL.addNode(new Integer(435234665));
		myL.addNode(new Integer(546246));
		myL.addNode(new Integer(879756));
		myL.addNode(new Integer(35));
		
		System.out.println(myL.getHead());
		System.out.println(myL.size());


	}

}