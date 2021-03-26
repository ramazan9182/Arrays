
public class Arrays {

	
	public static void main(String[] args) {
		
		int a;
		String str;
		
		 int[] numbers = new int[10];
		 // int numbers1[] = new int[1000]; // same definition affect as above
		System.out.println(numbers.length);
//		 System.out.println(numbers[5]);
		 
		 numbers[6] = 49;
		 
		 // last-index = array length - 1; 
		 
		 // numbers[10] = 33; // java.lang.ArrayIndexOutOfBoundsException
		 
		 System.out.println("Array Length ::: " + numbers.length);
		 
		 // array length fields is READ ONLY !!
//		 numbers.length = 50; // CAN NOT COMPILE
		 
		 // iteration
		 for(int i = 0; i < numbers.length; i++) {
			 System.out.println(numbers[i]);
		 }
		 
		 String[] strings = new String[5];
//		 System.out.println("abc".charAt(1));
		
		 int[] integers = {1,2,3,4,5,60};
		 System.out.println(integers.length);
		 
	}
}
