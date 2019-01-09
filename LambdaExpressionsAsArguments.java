interface MyString {
	String myStringFunction(String str);
}

public class LambdaExpressionsAsArguments {
	
	public static String reverseStr(MyString reverse, String str) {
		return reverse.myStringFunction(str);
	}

	public static void main(String[] args) {
		
		// Block lambda to reverse string
		MyString reverse = (str) -> {
			String result = "";

			for(int i = str.length()-1; i >= 0; i--)
				result += str.charAt(i);

			return result;
		};
		
		System.out.println(reverseStr(reverse, "Lambda Demo")); 
	}

}