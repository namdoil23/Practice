package chap99_homework.homework11;

public class Thread1 extends Thread{
	private NumberPrinter np;

	public NumberPrinter getNp() {
		return np;
	}

	public void setNp(NumberPrinter np) {
		this.np = np;
	}
	
	@Override
	public void run() {
		np.numPrint1(20);
	}
}
