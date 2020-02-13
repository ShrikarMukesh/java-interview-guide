package threads;

public class PrintEvenOdd {
	int start,max;

	public PrintEvenOdd(int start, int max) {
		super();
		this.max = max;
		this.start=start;
	}
	public void printEven() {
		
		while(this.start<=this.max){
			synchronized (this) {
				if(this.start%2 == 0){
					System.out.println(Thread.currentThread().getName()+ start);
					start++;
					this.notify();
				}
				else{
					try {
						this.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	public void printOdd() {
		while(this.start<=this.max){
			synchronized (this) {
				if(this.start%2 != 0){
					System.out.println(Thread.currentThread().getName()+ start);
					start++;
					this.notify();
				}
				else{
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

}