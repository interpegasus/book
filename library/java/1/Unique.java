import java.util.Set;
public class Unique {	
	public String text;
	public int length;	
	public char[] charArray;

	// for while switch
	// if else
	// boolean, char, string, float, int, byte
	// array, list, set, hash, tree, graph 

	public Unique(String text) {
		this.text = text;
		this.charArray = text.toCharArray();
		this.length = text.length();      
	}

	public boolean unique() {
		// Set<T> mySet = new HashSet<T>(Arrays.asList(this.charArray));
		// return this.charArray.length() == mySet.length();
		return false;
	}

	public boolean uniqueOn(){
		for(int i = 0; i < this.charArray.length; i++) {
			
		}
		return true;
	}

	public boolean uniqueOnSquare(){
		for(int i = 0; i < this.charArray.length; i++) {
			for(int j = 0; j < this.charArray.length; j++) {
				if (i == j){
					continue;
				}
				if (this.charArray[i] == this.charArray[j] ){
					return false;
				}
			}	
		}
		return true;
	}

	public static void main(String[] args) {
		String text = "This Rulez";
		Unique uniqueObject = new Unique(text);
		System.out.println("Calling uniqueOnSquare on:\n" + text);
		System.out.println(uniqueObject.uniqueOnSquare());
	}
}