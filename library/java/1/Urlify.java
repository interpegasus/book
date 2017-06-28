public class Urlify {	
	public String url;

	public Urlify(String str, Integer strLength) {
		this.url = url;
	}

	public String convertSpaces() {						
		// sol 1: Convert to chars. Check each char for space an convert to %20		
		// sol 2:	Use Stringbuilder anf append chars to eachnew string

	}

	public static void main(String[] args) {
		String text2 = "Cindy Cruse Ratcliff ";
		Urlify convertToUrl = new Urlify(text2);	
		System.out.println("Calling isPermutation on: " + text2);	
		System.out.println(convertToUrl.convertSpaces());
	}
}