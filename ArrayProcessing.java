import java.util.Arrays;

public class ArrayProcessing {

	public static void main(String[] args) {

		int[] numbers = ArrayUtil.createIntArray(10);
		System.out.println("numbers array is initialized");
		ArrayUtil.printArray(numbers);
		ArrayUtil.initializeIntArray(numbers);
		ArrayUtil.printArray(numbers);
		System.out.println("Total : " + ArrayUtil.cummulativeSumOfArray(numbers));
		System.out.println("Max : " + ArrayUtil.findMax(numbers));
		ArrayUtil.shiftLeft(numbers);
		ArrayUtil.printArrayf(numbers);
		ArrayUtil.shuffle(numbers);
		ArrayUtil.printArrayf(numbers);
		ArrayUtil.shuffle(numbers);
		ArrayUtil.printArrayf(numbers);
		ArrayUtil.shuffle(numbers);
		ArrayUtil.printArrayf(numbers);
		
		System.out.println("Copy Array...");
		ArrayUtil.printArrayf(ArrayUtil.copy(numbers));
		
		
	}
}
