import java.util.Hashtable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class DataStructure {	
	public String text;
	

	// for while switch
	// if else
	// boolean, char, string, float, int, byte
	// array, list, set, hash, tree, graph 

	public static void dataStructure(){
		/*
		 * Hashtable: No null. Key value pair storage. Thread safe
		 */
		byte[] anArrayOfBytes;
		long[] anArrayOfLongs;
		float[] anArrayOfFloats;
		double[] anArrayOfDoubles;
		boolean[] anArrayOfBooleans;
		char[] anArrayOfChars;
		String[] anArrayOfStrings;

		/*
		 * Hashtable: No null. Key value pair storage. Thread safe
		 */
		Hashtable<Integer,String> myTable = new Hashtable<Integer,String>();
		myTable.put(1, "Jean");
		myTable.put(2, "Claude");
		myTable.put(2, "Gomez");
		System.out.println(myTable.get(1));
		/*
		 * HashMap: Can take null value. Key value pair storage. Non Thread safe.
		 */
		HashMap<Integer,String> myMap = new HashMap<Integer,String>();
		myMap.put(1, "First");
		myMap.put(2,"Second");
		System.out.println(myMap.get(1));		

		Iterator<HashMap.Entry<Integer, String>> it = myMap.entrySet().iterator();

		while (it.hasNext()) {
		  HashMap.Entry<Integer, String> entry = it.next();
		  // Remove entry if key is null or equals 0.
		  if (entry.getKey() == 1) {
		    // it.remove();
		    System.out.println("Iterator: " + entry.getValue());
		  }
		}
		/*
		 * HashSet: Unique items
		 */	
		HashSet<String> mySet = new HashSet<String>();
		mySet.add ("First");
		mySet.add ("Second");
		mySet.add ("Third");
		if(mySet.contains("First")){
			System.out.println("The Set already contains First");
		}
	}

	

	public static void main(String[] args) {
		dataStructure();
	}
}