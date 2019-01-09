interface Greeting {
	String processName(String name);
}

public class GreetingTest {

	public static void main(String ... args) {

		Greeting morning = (name) -> "Good morning " + name + "!";
		Greeting evening = (name) -> "Good evening " + name + "!";

		// Output: Good Morning Eduardo! 
		System.out.println(morning.processName("Eduardo"));

		// Output: Good Evening Ana!
		System.out.println(evening.processName("Ana"));
		
	}	

}