package staticConcept;

public class Counter {

	private static int counter;
	private Counter() {
		counter++;
	}
	public static void main(String[] args) {

		new Counter();
		System.out.println(Counter.counter);
		new Counter();
		System.out.println(Counter.counter);
		new Counter();
		System.out.println(Counter.counter);

	}

}
