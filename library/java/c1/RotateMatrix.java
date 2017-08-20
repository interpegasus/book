public class RotateMatrix {	

	public static boolean rotate(int[][] matrix) {
				if (matrix.length == 0 || matrix.length != matrix[0].length) return false; // Not a square
				int n = matrix.length;
				
				for (int layer = 0; layer < n / 2; layer++) {
					int first = layer;
					int last = n - 1 - layer;
					for(int i = first; i < last; i++) {
						int offset = i - first;
						int top = matrix[first][i]; // save top

						// left -> top
						matrix[first][i] = matrix[last-offset][first]; 			

						// bottom -> left
						matrix[last-offset][first] = matrix[last][last - offset]; 

						// right -> bottom
						matrix[last][last - offset] = matrix[i][last]; 

						// top -> right
						matrix[i][last] = top; // right <- saved top
					}
				}
				return true;
			}

			public static int[][] randomMatrix(int M, int N, int min, int max) {
				int[][] matrix = new int[M][N];
				for (int i = 0; i < M; i++) {
					for (int j = 0; j < N; j++) {
						matrix[i][j] = randomIntInRange(min, max);
					}
				}
				return matrix;
			}

			public static void printMatrix(int[][] matrix) {
				for (int i = 0; i < matrix.length; i++) {
					for (int j = 0; j < matrix[i].length; j++) {
						if (matrix[i][j] < 10 && matrix[i][j] > -10) {
							System.out.print(" ");
						}
						if (matrix[i][j] < 100 && matrix[i][j] > -100) {
							System.out.print(" ");
						}
						if (matrix[i][j] >= 0) {
							System.out.print(" ");
						}
						System.out.print(" " + matrix[i][j]);
					}
					System.out.println();
				}
			}


			public static int randomIntInRange(int min, int max) {
				return randomInt(max + 1 - min) + min;
			}

			public static int randomInt(int n) {
				return (int) (Math.random() * n);
			}
			
			public static void main(String[] args) {
				int[][] matrix = randomMatrix(10, 10, 0, 9);
				printMatrix(matrix);
				rotate(matrix);
				System.out.println();
				printMatrix(matrix);
			}

			/* sol 1: Implement a swap by index

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

