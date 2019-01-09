interface MyGeneric<T> {
	T compute(T t);
}

public class GenericFunctionalInterface {
	
	public static void main(String[] args) {
		
		MyGeneric<String> reverseStr = (String str) -> {

			String result = "";

			for(int i = str.length() -1; i >= 0; i--) {
				result += str.charAt(i);
			}

			return result;
		};

		MyGeneric<Integer> factorial = (Integer number) -> {

			int result = 1;

			for (int i = 1; i <= number; i++) {
				
				result = i * result;

			}
			return result;
		};

		// Output: omeD adbmaL
		System.out.println(reverseStr.compute("Lambda Demo")); 

		// Output: 120
		System.out.println(factorial.compute(5)); 

	}

}