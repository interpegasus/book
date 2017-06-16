import java.util.Arrays;

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

	public boolean isPermutation(boolean caseSensitive) {			
		if (this.string1.length() != this.string1.length()) {
			return false;
		}
		char[] a1 = null;
		char[] a2 = null;
		if (caseSensitive) {
			a1 = this.string1.toCharArray();
			a2 =  this.string2.toCharArray();
		} else {
			a1 = this.string1.toUpperCase().toCharArray();
			a2 =  this.string2.toUpperCase().toCharArray();			
		}
		Arrays.sort(a1);
		Arrays.sort(a2);		
		System.out.println("Sorted Strings: \n" + String.valueOf(a1) + " and " + String.valueOf(a2));
		return (String.valueOf(a1).equals(String.valueOf(a2)));
	}

	public static void main(String[] args) {
		String text1 = "Arturo Gomez Mantilla";
		String text2 = "Cindy Cruse Ratcliff ";
		Permutation permutation = new Permutation(text1,text2);	
		System.out.println("Calling isPermutation on: " + text1 + " and " + text2);	
		System.out.println(permutation.isPermutation(false));
	}
}