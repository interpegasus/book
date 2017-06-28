import java.util.Arrays;

public class Permutation {	
	public String string1;
	public String string2;

	public Permutation(String txt1,String txt2) {
		this.string1 = txt1;
		this.string2 = txt2;
	}

	public boolean isPermutation(boolean caseSensitive) {		
		// check string lenght
		// check case sensitive
		// sol 1: sort and compare. nLogn
		// sol 2:	hashmap that keeps track of letters On
		if (this.string1.length() != this.string1.length()) {
			return false;
		}
	}

	public static void main(String[] args) {
		String text1 = "Arturo Gomez Mantilla";
		String text2 = "Cindy Cruse Ratcliff ";
		Permutation permutation = new Permutation(text1,text2);	
		System.out.println("Calling isPermutation on: " + text1 + " and " + text2);	
		System.out.println(permutation.isPermutation(false));
	}
}