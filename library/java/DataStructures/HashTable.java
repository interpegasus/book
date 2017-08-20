public class HashTable <K,V> {
	// 1. Array of length n. 
	// 2. map key to an index in the array
	// 3. Store item in single linked list at index i
	
	private static LinkedList <HashElement>[] linkedListArray;	
	private static int size;
	private static int capacity;

	// constructor
	public HashTable(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		//HashElement<String, Integer> p1 = new HashElement<String, Integer>("Even", 8);
		this.linkedListArray = new LinkedList [capacity];
		for (int i = 0 ; i < this.linkedListArray.length ; i++){				
			this.linkedListArray[i] = new <HashElement> LinkedList();						
		}
	}

	public boolean isEmptyHash() { return this.size == 0; }

	public int getSizeHash() { return this.size; }

	private int customHashCode(K key){
		return key.toString().length();
	}

	private int hashCode(K key){
		return Math.abs(key.hashCode());
	}

	private int hashTableIndex(K key, int hashTableCap) {
		return  hashCode(key) % hashTableCap;
	}

	public V put(K key,V value) {								
		if(this.get(key) != null){
			return this.get(key);
		}else{
			HashElement<K, V> ele = new HashElement<K, V>(key, value);	
			int index = hashTableIndex(key,this.capacity);
			this.linkedListArray[index].addLast(ele);
		}
		this.size++;
		return value;
	}

	public V get(K key){
		V value = null;
		int index = hashTableIndex(key,this.capacity);
		System.out.println(new StringBuilder("Checking Index: ").append(index));
		System.out.println(new StringBuilder("Size: ").append(this.linkedListArray[index].isEmpty()));
		System.out.println(new StringBuilder("linked list: ").append(this.linkedListArray[index]));
		if (this.linkedListArray[index].head != null) {
			HashElement<K, V> tmp = this.linkedListArray[index].head.element;
			if (tmp.key == key){
				return tmp.value;
			}
		}		
		return value;
	}

	public static void main(String[] args) {
		HashTable  <String,Integer> myHash = new HashTable(21);
		System.out.println(new StringBuilder("Size: ").append(myHash.getSizeHash()));		
		System.out.println(new StringBuilder("Is Empty: ").append(myHash.isEmptyHash()));	
		System.out.println(new StringBuilder("Capacity:").append(myHash.capacity));					
		System.out.println(new StringBuilder("Get :").append(myHash.get("firstName1")));		
		System.out.println(new StringBuilder("Put :").append(myHash.put("firstName1",23)));
		System.out.println(new StringBuilder("Put :").append(myHash.put("firstName1",24)));
		System.out.println(new StringBuilder("Put :").append(myHash.put("firstName1",25)));
		System.out.println(new StringBuilder("Put :").append(myHash.put("firstName2",26)));
		System.out.println(new StringBuilder("Put :").append(myHash.put("firstName3",27)));					
		System.out.println(new StringBuilder("Get firstName2:").append(myHash.get("firstName2")));	
		System.out.println(new StringBuilder("Size: ").append(myHash.getSizeHash()));
	}
}