package chap13_nestedclass.nestedclass;

public class LocalNestedClass {
	public void speedUp() {
		// 1. 지역 중첩 클래스
		// 지역 중첩 클래스는 메소드 안에 선언되는 클래스
		// 메소드안에서 선언되었기 때문에 메소드의 호출이 끝나면 사용이 불가능하다.
		// 따라서 중첩 클래스가 선언되 메소드 안세서만 사용가능한 중첩 클래스이다.
		// 중첩 크래스가 선언된 메소드에서 객체를 만들어서 사용한다.
		class Engine{
			int fuelAmonut;
			
			public Engine(int fuelAmonut) {
				this.fuelAmonut = fuelAmonut;
			}
			
			public void useFuel() {
				this.fuelAmonut -= 10;
			}
		}
		
		
		// 2. 지역 중첩 클래스의 객체 생성
		// speedUp 메소드안에서 객체로 만들고 사용한다.
		Engine engine = new Engine(100);
		engine.useFuel();
		
		System.out.println("연료가 " + engine.fuelAmonut + "% 남았습니다.");
	}
	
}
