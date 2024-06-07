package chap14_objectarray;

import chap14_objectarray.car.CarInterface;
import chap14_objectarray.car.HuyndaiCar;
import chap14_objectarray.car.KiaCar;

public class _02_InterfaceArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 인터페이스 배열 선언
		// 모든 요소가 null인 상태로 배열이 생성된다.
		// 클래스 배열을 사용하게 되면 HuyndaiCar 배열과 KiaCar 배열을 각각 생성해야 했지만
		// 인터페이스 배열을 사용하므로써 하나의 배열에 HuyndaiCar 객체와 KiaCar 객체를 모두
		// 저장해서 사용할 수 있는 확장성이 생긴다.
		CarInterface[] carInterfaceArr = new CarInterface[100];
		
		// 2. 인터베이스 배열에 값 저장
		// 인터페이스는 객체를 만들수가 없기 때문에
		// 인터페이스 배열의 요소에는 인터페이스를 상속받을 자식 개체가 저장된다.
		
		carInterfaceArr[0] = new HuyndaiCar("제네시스", 5000, "검정");
		carInterfaceArr[1] = new KiaCar("k9", 5000, "흰색");
		
		// 3. 인터페이스 배열에 값 사용
		// 인터페이스에 정의된 메소드만 사용할 수 있다.
		
		carInterfaceArr[0].carInfo();
//		carInterfaceArr[0].speedUp();
		
		// 4. for문과 향상된 forans 사용가능
		for(CarInterface carInterface : carInterfaceArr) {
			carInterface.carInfo();
		}


	}

}
