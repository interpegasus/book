public class RotateMatrix {	
	public Integer[][] matrix;

	public RotateMatrix(Integer[][] matrix) {
		this.matrix = matrix;
	}

	public String rotateMatrix() {						
		/* sol 1: count craracter sequeces and return compressed version. If equal ort longer return original string.

			c0c1c2c3c4

		r0	3 4 5 6 7
		r1	3 4 5 6 7
		r2	1 2 5 6 7
		r3	3 4 5 6 7
		r4	3 4 5 6 7

		size 5 x 5
		r0 c0 -> r0 c4
		r0 c1 -> r1 c4
		r0 c2 -> r2 c4
		r0 c3 -> r3 c4
		r0 c4 -> r4 c4

		*/
	}

	public static void main(String[] args) {
		Integer[][] matrix = null;
		RotateMatrix rotateMatrix = new RotateMatrix(matrix);	
		System.out.println("Calling rotateMatrix on: " + matrix);	
		System.out.println(rotateMatrix.rotateMatrix());
	}
}