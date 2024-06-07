package chap23_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import chap23_stream.car.HyundaiCar;

public class _03_BasicStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<HyundaiCar> hCarList = new ArrayList<>();
		
		hCarList.add(new HyundaiCar("아반떼", 3000));
		hCarList.add(new HyundaiCar("아반떼", 4500));
		hCarList.add(new HyundaiCar("아반떼", 2500));
		hCarList.add(new HyundaiCar("소나타", 4000));
		hCarList.add(new HyundaiCar("그랜저", 4500));
		hCarList.add(new HyundaiCar("제네시스", 5000));
		
		// 스트림을 이용해서 hCarList에 있는 아반떼만 모여있는 리스트 새로 만들기
		
//		Stream<HyundaiCar> carStream = hCarList.stream();
//		
//		// 스트림의 람다식의 매개변수는 컬렉션이나 배열의 요소를 하나씩 담아준다.
//		// filter의 처리부는 true나 false가 리턴되도록 논리식이나 조건식을 사용한다.
//		Stream<HyundaiCar> scarStream = carStream.filter(car -> car.getModel().equals("아반떼"));
//		
//		// mapToInt(): int만 모여있는 스트림으로 변환
//		IntStream priceStream = scarStream.mapToInt(scar ->scar.getPrice());
//		
//		
//		// 최종처리
//		List<HyundaiCar> scarList = scarStream.toList();
//		
//		System.out.println(scarList);
//		
//		int priceSum = priceStream.sum();
//		System.out.println("아반떼 모델의 총 가격은" + priceSum);
//				
		// 3. 파이프라인으로 구성
		// 파이프라인으로 구성되며 최종단계 메소드의 리턴값이 리턴되기 때문에
		// 최종단계 메소드가 리턴하는 타입의 변수로 값을 받아준다.
		// 최종처리 단계가 존재하지 않으면 중간단계들은 의미가 없어지기 때문에
		// 항상 최종처리 단계를 추가한다.
		int priceSum = hCarList.stream() // Stream<HyundaiCar> 
				// 모델명이 아반떼인 객체만 모여있는 Stream<HyundaiCar>
				.filter(hCar -> hCar.getModel().equals("아반떼")) 
				// 모델명이 아반떼인 차의 가격만 모여있는 IntStream
				.mapToInt(avante -> avante.getPrice())
				// IntStream에 담겨있는 값의 총합
				.sum();
		System.out.println(priceSum);
	}

}
