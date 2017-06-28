public class PalindromePermutation {	
	public String str;

	public PalindromePermutation(String str) {
		this.str = str;
	}

	public String[] palindromePermutations() {						
		// sol 1: convert string to chars. Add char to hash and count. Even length all should have a count of 2. Odd length, all 2 except the 1 in middle.

	}

	public static void main(String[] args) {
		String text2 = "Cindy Cruse Ratcliff ";
		PalindromePermutation permutations = new PalindromePermutation(text2);	
		System.out.println("Calling palindromePermutations on: " + text2);	
		System.out.println(permutations.palindromePermutations());
	}
}