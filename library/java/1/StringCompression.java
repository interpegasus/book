public class StringCompression {	
	public String str;

	public StringCompression(String str) {
		this.str = str;
	}

	public String stringCompression() {						
		// sol 1: count craracter sequeces and return compressed version. If equal ort longer return original string.

	}

	public static void main(String[] args) {
		String text2 = "Cindy Cruse Ratcliff ";
		StringCompression stringCompression = new StringCompression(text2);	
		System.out.println("Calling stringCompression on: " + text2);	
		System.out.println(stringCompression.stringCompression());
	}
}