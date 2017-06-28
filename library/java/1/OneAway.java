public class OneAway {	
	public String string1;
	public String string2;

	public OneAway(String txt1,String txt2) {
		this.string1 = txt1;
		this.string2 = txt2;
	}

	public Boolean oneAway() {						
		// sol 1: Add chars to hash and count differences. 
		// sol 2: Order strings. compare them except last char of both or longer. If equal retun true.
		
	}

	public static void main(String[] args) {
		String text2 = "Cindy Cruse Ratcliff ";
		String text1 = "Cindy CruseRatcliff ";
		OneAway oneAway = new OneAway(text1,text2);	
		System.out.println("Calling oneAway on: " + text1 + " and " + text2);	
		System.out.println(oneAway.oneAway());
	}
}