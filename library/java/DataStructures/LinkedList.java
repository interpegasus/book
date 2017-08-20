import java.util.NoSuchElementException;
public class LinkedList<T> {
    protected Node head;
    protected Node tail;
    protected int size;

    // constructor
    public LinkedList() {
        size = 0;
        head = null;
        tail = null;
    }

    protected class Node {
        T element;
        Node next;
        Node prev;
        // constructor
        public Node(T element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public int size() { return size; }

    public boolean isEmpty() { return size == 0; }

    public void addFirst(T element) {
        Node tmp = new Node(element, head, null);
        if(head != null ) {head.prev = tmp;}
        head = tmp;
        if(tail == null) { tail = tmp;}
        size++;
        System.out.println("adding: "+element);
    }

    public void addLast(T element) {

        Node tmp = new Node(element, null, tail);
        if(tail != null) {tail.next = tmp;}
        tail = tmp;
        if(head == null) { head = tmp;}
        size++;
        System.out.println("adding: "+element);
    }

    /**
     * this method walks forward through the linked list
     */
    public void iterateForward(){
        System.out.println("iterating forward ... ");
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.element);
            tmp = tmp.next;
        }
    }

    /**
     * this method walks backward through the linked list
     */
    public void iterateBackward(){
        System.out.println("iterating backword..");
        Node tmp = tail;
        while(tmp != null){
            System.out.println(tmp.element);
            tmp = tmp.prev;
        }
    }

    /**
     * this method removes element from the start of the linked list
     * @return
     */
    public T removeFirst() {
        if (size == 0) throw new NoSuchElementException();
        Node tmp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("deleted: "+tmp.element);
        return tmp.element;
    }

    /**
     * this method removes element from the end of the linked list
     * @return
     */
    public T removeLast() {
        if (size == 0) throw new NoSuchElementException();
        Node tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("deleted: "+tmp.element);
        return tmp.element;
    }



    public static void main(String a[]){
        LinkedList<StringBuilder> myList = new LinkedList<StringBuilder>();
        StringBuilder myString = new StringBuilder("Welcome OK");
        myList.addFirst(myString);
        myList.addFirst(myString.append(" one"));
        myList.addLast(myString.append(" two"));
        myList.addLast(myString.append(" three"));
        myList.iterateForward();
        myList.removeFirst();
        myList.removeLast();
        myList.iterateBackward();
    }
}