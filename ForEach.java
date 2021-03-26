
public class ForEach {
	
	public static void main(String[] args) {
		
		int[] numbers = ArrayUtil.initializeIntArray(ArrayUtil.createIntArray(10));
		// for each syntax
		for(int number : numbers) {
			System.out.println(number);
		}
		
	}

}
