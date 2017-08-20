import java.util.Hashtable;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Iterator;

public class DataStructure {	
	public String text;
	

	// for while switch
	// if else
	// boolean, char, string, float, int, byte
	// array, set, list, hash, tree, graph 

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

		Iterator<Map.Entry<Integer, String>> it = myMap.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, String> entry = it.next();
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

		/*
		 * For While Switch
		 */
		for(int i=1; i<11; i++){
			System.out.println("Count is: " + i);
		}

		int[] numbersArray = {1,2,3,4,5,6,7,8,9,10};
		for (int singleItem : numbersArray) {
			System.out.println("Count is: " + singleItem);
		}

		int month = 7;
		String monthString;
		switch (month) {
			case 1:  monthString = "January";
			break;
			case 2:  monthString = "February";
			break;
			case 3:  monthString = "March";
			break;
			case 4:  monthString = "April";
			break;
			case 5:  monthString = "May";
			break;
			case 6:  monthString = "June";
			break;
			case 7:  monthString = "July";
			break;
			case 8:  monthString = "August";
			break;
			case 9:  monthString = "September";
			break;
			case 10: monthString = "October";
			break;
			case 11: monthString = "November";
			break;
			case 12: monthString = "December";
			break;
			default: monthString = "Invalid month";
			break;
		}
		System.out.println(monthString);
		int count = 1;
		while (count < 11) {
			System.out.println("Count is: " + count);
			count++;
		}
	}

	public static void main(String[] args) {
		dataStructure();
	}
}