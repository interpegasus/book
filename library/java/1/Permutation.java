import java.util.HashMap;
import java.util.HashSet;


public class Permutation {	
	public String string1;
	public String string2;

	// for while switch
	// if else
	// boolean, char, string, float, int, byte
	// array, list, set, hash, tree, graph 

	public Permutation(String txt1,String txt2) {
		this.string1 = txt1;
		this.string2 = txt2;
	}

	public boolean isPermutation() {	
		return this.charArray.length == mySet.size();
	}

	public static void main(String[] args) {
		String text = "This Rulez";
		String text = "ThisRulez ";
		Unique uniqueObject = new Unique(text);
		System.out.println("Calling uniqueOnSquare on:\n" + text);
		System.out.println(uniqueObject.uniqueOnSquare());
		System.out.println("Calling unique on:\n" + text);
		System.out.println(uniqueObject.unique());
		System.out.println("Calling uniqueOn on:\n" + text);
		System.out.println(uniqueObject.uniqueOn());
	}
}