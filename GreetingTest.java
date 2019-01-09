interface Greeting {
	String processName(String name);
}

public class GreetingTest {
	
	Greeting morning = (name) -> "Good morning " + name + "!";
	Greeting evening = (name) -> "Good evening " + name + "!";
	System.out.println(morning.processName("Eduardo"));
	System.out.println(evening.processName("Ana"));

}