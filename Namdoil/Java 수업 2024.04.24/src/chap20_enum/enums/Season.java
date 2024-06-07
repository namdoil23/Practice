package chap20_enum.enums;

public enum Season {
	SPRING("봄", 3, 4, 5),
	SUMMER("여름", 6, 7, 8),
	FALL("가을", 9, 10, 11),
	WINTER("겨울", 12, 1, 2);
	
	private String seasonStr;
	
	//같은 타입의 값은 배열로도 받을 수 있다.
	int[] seasonMonths = new int[3];
	
	Season(String seasonStr, int seasonMonth0, int seasonMonth1, int seasonMonth2) {
		this.seasonStr = seasonStr;
		this.seasonMonths[0] = seasonMonth0;
		this.seasonMonths[1] = seasonMonth1;
		this.seasonMonths[2] = seasonMonth2;
	}
	
	public String getSeasonStr() {
		return this.seasonStr;
	}
	
	public int[] getSeasonMonths() {
		return this.seasonMonths;
	}
	
	/// 봄은 3, 4, 5월입니다.
	public void printSeasonMonths() {
		System.out.print(this.seasonStr + "는(은) ");
		
		for(int i = 0; i < this.seasonMonths.length; i++) {
			if(i == this.seasonMonths.length - 1) {
				System.out.print(this.seasonMonths[i]);
			} else {
				System.out.print(this.seasonMonths[i] + ", ");
			}
		}
		
		System.out.println("월입니다.");
	}
	
	
	
	
	
	
	
	
}
