package chap99_homework.homework10;

public enum MONTH {
	JAN(1, 31, 31), FEB(2, 28, 29), MAR(3, 31, 31), 
	APR(4, 30, 30), MAY(5, 31, 31), JUN(6, 30, 30),
	JUL(7, 31, 31), AUG(8, 31, 31), SEP(9, 30, 30),
	OCT(10, 31, 31), NOV(11, 30, 30), DEC(12, 31, 31);
	
	private int month;
	private int normalDates;
	private int yoonDates;
	
	MONTH(int month, int normalDates, int yoonDates) {
		this.month = month;
		this.normalDates = normalDates;
		this.yoonDates = yoonDates;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getNormalDates() {
		return normalDates;
	}

	public void setNormalDates(int normalDates) {
		this.normalDates = normalDates;
	}

	public int getYoonDates() {
		return yoonDates;
	}

	public void setYoonDates(int yoonDates) {
		this.yoonDates = yoonDates;
	}

	public int sumDays(int year) {
		int dates = 0;
		
		MONTH[] monthArr = MONTH.values();
		
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			for(int i = 0; i < 5; i++) {
				dates += monthArr[i].getYoonDates();
			}
		} else {
			for(int i = 0; i < 5; i++) {
				dates += monthArr[i].getNormalDates();
			}
		}
		
		return dates;
	}
}
