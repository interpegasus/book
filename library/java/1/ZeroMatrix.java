public class ZeroMatrix {	
	public Integer[][] matrix;

	public ZeroMatrix(Integer[][] matrix) {
		this.matrix = matrix;
	}

	public String zeroMatrix() {						
		/* sol 1: Check split string into xy such that xy = s1 and yx = s2

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
		ZeroMatrix zeroMatrix = new ZeroMatrix(matrix);	
		System.out.println("Calling zeroMatrix on: " + matrix);	
		System.out.println(zeroMatrix.zeroMatrix());
	}
}