package threads;

class EvenT implements Runnable{
	EvenOddPrint eop;
	public EvenT(EvenOddPrint eop) {
		this.eop = eop;
	}

	public void run() {
		eop.printEven();
	}
}
class OddT implements Runnable{

	EvenOddPrint eop;
	public OddT(EvenOddPrint eop) {
		this.eop = eop;
	}

	@Override
	public void run() {
		eop.printOdd();
	}
}
public class PrintingEvenOdd {
	public static void main(String[] args) {

		EvenOddPrint eop = new EvenOddPrint(1,100);
		Thread eT = new Thread(new EvenT(eop));
		eT.setName("Even Thread");
		eT.start();
		Thread oT = new Thread(new OddT(eop));
		oT.setName("Odd Thread");
		oT.start();
	}
}
class EvenOddPrint {
	int start ,end;
	public EvenOddPrint(int start, int end) {
		this.start = start;
		this.end = end;
	}
	public void printEven() {
		while(this.start <= this.end) {
             synchronized (this) {
				 if(start % 2 ==0) {
					 System.out.println(Thread.currentThread().getName() +" = "+ start);
					 start++;
					 notify();
				 }else {
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
		while(this.start<this.end) {
			synchronized (this) {
				 if(start % 2 !=0) {
					 System.out.println(Thread.currentThread().getName()+ " = "+ start );
					 start++;
					 notify();
				 }else {
					 try {
						this.wait();
					} catch (InterruptedException e) {					
						e.printStackTrace();
					}
				 }
			}
		}
	}

}
