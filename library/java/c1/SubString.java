public class SubString {	
	public String str1;
	public String str2;

	public SubString(String str1, String str2) {
		this.matrix = matrix;
	}

	public Boolean isSubString() {						
		
	}

	public static void main(String[] args) {
		String text1 = "Arturo Gomez Mantilla";
		String text2 = "Cindy Cruse Ratcliff ";
		SubString subString = new SubString(text1,text2);	
		System.out.println("Calling isSubString on: " + text1 + " and " + text2);	
		System.out.println(subString.isSubString());
	}
}