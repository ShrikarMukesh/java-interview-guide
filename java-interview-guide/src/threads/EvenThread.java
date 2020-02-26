package threads;

public class EvenThread implements Runnable {
	PrintEvenOdd peo;

	//Dependency Injection
	public EvenThread(PrintEvenOdd peo) {
		this.peo=peo;
	}

	@Override
	public void run() {
		peo.printEven();
	}
}