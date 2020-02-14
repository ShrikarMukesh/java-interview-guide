package staticConcept;

public class StaticBlock {
	private static final int initialValue;
	private static int calculatedVlaue;
	static {
		System.out.println("Static block started");
		initialValue =10;
		calculatedVlaue = initialValue*10;
		System.out.println(initialValue);
		System.out.println(calculatedVlaue);
		System.out.println("Static block ended");
	}
	public static void main(String[] args) {
		System.out.println("Main method");
		System.out.println("U r in main method"+initialValue);
		System.out.println("U r in main method"+calculatedVlaue);
	}
}
