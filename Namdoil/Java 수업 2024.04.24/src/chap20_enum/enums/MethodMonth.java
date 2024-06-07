package chap20_enum.enums;

public enum MethodMonth {
	JAN(1) {
		public void printHangulMonth() {
			System.out.println("1월입니다.");
		}
	}, 
	FEB(2) {
		public void printHangulMonth() {
			System.out.println("2월입니다.");
		}
	}, 
	MAR(3) {
		public void printHangulMonth() {
			System.out.println("3월입니다.");
		}
	}, 
	APR(4) {
		public void printHangulMonth() {
			System.out.println("4월입니다.");
		}
	}, 
	MAY(5) {
		public void printHangulMonth() {
			System.out.println("5월입니다.");
		}
	}, 
	JUN(6) {
		public void printHangulMonth() {
			System.out.println("6월입니다.");
		}
	}, 
	JUL(7) {
		public void printHangulMonth() {
			System.out.println("7월입니다.");
		}
	}, 
	AUG(8) {
		public void printHangulMonth() {
			System.out.println("8월입니다.");
		}
	}, 
	SEP(9) {
		public void printHangulMonth() {
			System.out.println("9월입니다.");
		}
	}, 
	OCT(10) {
		public void printHangulMonth() {
			System.out.println("10월입니다.");
		}
	}, 
	NOV(11) {
		public void printHangulMonth() {
			System.out.println("11월입니다.");
		}
	}, 
	DEC(12) {
		public void printHangulMonth() {
			System.out.println("12월입니다.");
		}
	};
	
	private int monthValue;
	
	MethodMonth(int monthValue) {
		this.monthValue = monthValue;
	}
	
	public int getMonthValue() {
		return this.monthValue;
	}
	
	// 1. enum에 static 메소드 선언
	public static void printMonths() {
		MethodMonth[] methodMonthArr = MethodMonth.values();
		
		for(MethodMonth methodMonth : methodMonthArr) {
			System.out.println(methodMonth + "는(은) " + methodMonth.getMonthValue() + "월입니다.");
		}
	}
	
	// 2. enum에 일반(인스턴스) 메소드 선언
	public void printMonth(int month) {
		MethodMonth[] methodMonthArr = MethodMonth.values();
		
		for(MethodMonth methodMonth : methodMonthArr) {
			if(methodMonth.getMonthValue() == month) {
				System.out.println("입력한 달은 " + methodMonth.getMonthValue() + "월 입니다.");
			}
		}
	}
	
	// 현재 생성된 상수 객체의 월 값에 매개변수로 받은 개월 수를 더해서
	// month 개월 후가 몇월달인지 출력하는 메소드를 구현하세요.
	public void printAddMonth(int month) {
		if(this.monthValue + month <= 12) {
			System.out.println(month + "개월 뒤는 " + (this.monthValue + month) + "월입니다.");
		} else {
			System.out.println(month + "개월 뒤는 " + 
					((this.monthValue + month) % 12) + "월입니다.");
		}
	}
	
	// 3. enum에 추상메소드 선언
	// enum에 선언된 추상메소드는 자식클래스에서 구현되는 게 아니고 선언된 상수마다 구현을 해줘야한다.
	public abstract void printHangulMonth();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
