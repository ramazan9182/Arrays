
public class ArrayUtil {

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print('\n');
	}

	public static void printArray(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.print('\n');
		}
	}

	public static void printArray(int[][][][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					for (int l = 0; l < arr[i][j][k].length; l++) {
						System.out.print(arr[i][j][k][l] + " ");
					}
				}
			}
			System.out.println();
		}
	}

	public static void printArrayf(int[] arr) {
		System.out.print("[ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != (arr.length - 1))
				System.out.print(" - ");
		}
		System.out.println(" ]");
	}

	public static int[] initializeIntArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		return arr;
	}

	public static int[][] initializeIntArray(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 100);
			}
		}
		return arr;
	}

	public static int[][][][] initializeIntArray(int[][][][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					for (int l = 0; l < arr[i][j][k].length; l++) {
						arr[i][j][k][l] = (int) (Math.random() * 100);
					}
				}
			}
		}
		return arr;
	}

	public static int[] createIntArray(int length) {
		return new int[length];
	}

	public static int[][] createTwoDimArray() {
		return new int[(int) (Math.random() * 20)][(int) (Math.random() * 10)];
	}

	public static int[][][][] createFourDimArray() {
		return new int[(int) (Math.random() * 20)][(int) (Math.random() * 10)][(int) (Math.random()
				* 20)][(int) (Math.random() * 10)];
	}

	public static int cummulativeSumOfArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static int findMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void shiftLeft(int[] arr) {
		int first = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = first;
	}

	public static void shuffle(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			// [0,1) --> Math.random()
			int randomIndex = (int) (Math.random() * (i + 1));
			int tempSelectedElement = arr[i];
			arr[i] = arr[randomIndex];
			arr[randomIndex] = tempSelectedElement;
		}

	}

	public static int[] copy(int[] arr) {
		int[] copy = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		return copy;
	}

	public static void copy(int[] source, int[] target) {
		// TODO
	}

	public static void search(int[] arr, int key) {
		// TODO : return type might be changed
	}

	public static void sort(int[] arr) {
		// TODO
	}

	// methods can be overloaded
}
