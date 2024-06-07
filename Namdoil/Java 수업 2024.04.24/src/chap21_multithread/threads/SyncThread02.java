package chap21_multithread.threads;

public class SyncThread02 extends Thread{
	private PrintNumWithSync pnws;
	
	public void setPnws(PrintNumWithSync pnws) {
		this.pnws = pnws;
	}
	
	public PrintNumWithSync getPnws() {
		return this.pnws;
	}
	
	@Override
	public void run() {
		// 동기화 블록에 의해서 동기화 메소드에서 선점한 공유객체를 사용할 수 없는 상태
		// 공유객체를 선점한 스레드의 작업이 끝날 때까지 실행되지 않는다.
		pnws.printNum2(20);
	}
}
