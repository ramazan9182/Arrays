
public class MultiDimensionalArrays {

	
	public static void main(String[] args) {
		
//		int[][] matrix = new int[2][2];
		
//		int[] numbers2 = new int[];
		
		int[][] matrix = { {3,5}, {9,8} };
		
//		int matrix[][] = new int[4][4]; // LEGAL
		
		int[][][] numbers = new int[3][4][5];
//		ArrayUtil.printArray(matrix);
		ArrayUtil.printArray(ArrayUtil.initializeIntArray(ArrayUtil.createTwoDimArray()));
		
		ArrayUtil.printArray(ArrayUtil.initializeIntArray(ArrayUtil.createFourDimArray()));
		
		
		// RAGGED ARRAY
		
		int[][] answers = new int[2][];
		
		
	}
}
