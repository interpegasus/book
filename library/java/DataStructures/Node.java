public class Node <T> {
	T element;
	Node next;
	Node prev;

	public Node(T element, Node next, Node prev) {
		this.element = element;
		this.next = next;
		this.prev = prev;
	}

	public static void main(String [] args){
		Node myNode = new Node <Integer> (7,null,null);
	}

}