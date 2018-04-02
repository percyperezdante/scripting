/*
 * Amazon interview arrays
 *
 * Write a logic to print the elements of 2D matrix in a spiral way?
 * for eg if int[][] matrix = {{1,2,3,4}{5.6,7,8}{9, 10, 11,12}};
 * The output should be 1 2 3 4 8 12 11 10 9 5 6 7
 * The interviewer asked me to implement a recursive algorithm.
 *
 * Ref.:
 * https://www.careercup.com/question?id=5123820187811840
 * 
 * Expected result
 *
 * -
 *  |1  2   3   4  |
 *  |5  6   7   8  |
 *  |9  10  11  12 |
 *  |-9 -10 -11 12 |
 *  |13 14  15  16 |
 *  -
 *  1 -> 2 -> 3 -> 4 -> 8 -> 12 -> 12 -> 16 -> 15 -> 14 -> 13 -> -9 -> 9 -> 5 -> 6 -> 7 -> 11 -> -11 -> -10 -> 10 -
 *
 */

public class matrix {

	static int[][]arr = {{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{-9,-10,-11,12},
						{13,14,15,16}
						};
	public static void main(String[] args) {
		printMatrix(arr);
		rotateAndPrintSpiralWay(arr);
	}

	public static void rotateAndPrintSpiralWay(int[][] matrix){
		int row=matrix.length;
		int col=matrix[0].length;
	
		//printMatrix(matrix);
		printFirstRow(matrix);
		int[][] newM = new int[col][row-1];
		int n=col-1;	

		for(int newRow=0;newRow<col;newRow++){
			int prevRow=1;
		    for(int newCol=0;newCol<row-1;newCol++){
				newM[newRow][newCol]=matrix[prevRow][n];
				prevRow++;
			}
			n--;
		}
		if(newM.length==0){
			return;
		}
		rotateAndPrintSpiralWay(newM);
	}

	public static void printFirstRow(int[][] matrix){
		for(int col=0;col<matrix[0].length;col++){
			System.out.print(matrix[0][col] + " -> ");
		}
	}

	public static void  printMatrix(int[][] m){
		System.out.println("-");		
		for(int i=0;i<m.length;i++){
			System.out.print("|");
		    for(int j=0;j<m[i].length;j++){
			System.out.print(m[i][j]+" ");				
			}
			System.out.print("|\n");
		}
		System.out.println("-");		
	}
}

/*
 *  Apendix
 *  The method used in this program is as follow:
 *    1- Print the first raw of the NxM matrix
 *    2- Remove or lock the first row Nx1
 *    3- Rotate the remaining matrix, means rotate the Nx(M-1) matrix
 *    4- Go to step 1
 *
 *    Example :
 *
 *  -
 *  |1    2    3    4   |
 *  |5    6    7    8   |
 *  |9    10   11   12  |
 *  |-9   -10  -11  12  |
 *  |13   14   15   16  |
 *  -
 *  1     ->   2    ->  3   ->  4   ->  -
 *  |8    12   12   16  |
 *  |7    11   -11  15  |
 *  |6    10   -10  14  |
 *  |5    9    -9   13  |
 *  -
 *  8     ->   12   ->  12  ->  16  ->  -
 *  |15   14   13   |
 *  |-11  -10  -9   |
 *  |11   10   9    |
 *  |7    6    5    |
 *  -
 *  15    ->   14   ->  13  ->  -
 *  |-9   9    5    |
 *  |-10  10   6    |
 *  |-11  11   7    |
 *  -
 *  -9    ->   9    ->  5   ->  -
 *  |6    7    |
 *  |10   11   |
 *  |-10  -11  |
 *  -
 *  6     ->   7    ->  -
 *  |11   -11  |
 *  |10   -10  |
 *  -
 *  11    ->   -11  ->  -
 *  |-10  |
 *  |10   |
 *  -
 *  -10   ->   -
 *  |10   |
 *  -
 *  10    ->   -
 *  ||
 *  -
 *
 *
 *
 *
 *
 */
 
