public class HashElement <K, V> {
	public K key;
	public V value;
	public HashElement(K k, V v){
		this.key = k;
		this.value = v;
	}

	public static void main(String[] args) {
		HashElement<String, Integer> p1 = new HashElement<String, Integer>("Even", 8);
	}
}