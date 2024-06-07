package chap99_homework.homework10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. public static <T> String add(T t1, T t2) 제네릭 메소드를 정의하고 
//		매개변수로 어떤 값이 들어오던 문자열 결합연산이 돼서 스트링값으로 리턴하도록 만드세요.
		System.out.println(add(1, 1.3));

//		3. public static Integer sum(List<?> list) 와일드 카드를 이용하여 리스트의 총합을 구하는 메소드를 구현하세요.
		List<Double> doubleList = new ArrayList<Double>();

		Random random = new Random();

		
		for(int i = 0; i < 10; i++) {
			doubleList.add(random.nextDouble() * 100);
		}
		
		System.out.println(add(doubleList));
		
//		4. 어떤 배열이던지 받아서 인덱스가 3의 배수인 요소만 출력하는 메소드 void printArr을 구현하세요.
		Double[] dArr = new Double[5];

		for(int i = 0; i < 5; i++) {
			dArr[i] = random.nextDouble() * 100;
		}
		
		printArr(dArr);

//		5. Number를 상속받은 클래스타입의 배열만 받아서 배열의 최소값을 구해서 리턴하는 메소드 getMin을 구현하세요.
		System.out.println(getMin(dArr));
		
//		6. Map을 어떤형태로든 받아서 value를 String으로 변경했을 때 길이가 10이상되는 key를 출력하는 메소드 void printOverTen을 구현하세요.
		Map<String, Long > map = 
					new HashMap<String, Long >();
		
		for(long i = 0; i < 20; i++) {
			map.put(String.valueOf(i), i * 100000000L);
		}
		
		printOverTen(map);

//		7. KOR, CHI, JAP, USA 네 개의 상수를 갖는 enum을 생성하고 첫 번째 값은 "나라 한글명"이고 두 번째 값은 "대표음식"으로 지정한다. public void notifyFood(String country) 메소드를 만들고 country 값과 동일한 한글명인 나라의 음식을 다음과 같이 출력하도록 구현하세요. country에 "중국"이 들어오면 "중국의 대표음식은 짜장면입니다."라고 나오도록 하세요. (각 국의 음식은 한국=불고기, 중국=짜장면, 일본=초밥, 미국=햄버거)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한국, 중국, 일본, 미국 중 하나를 입력하세요.");
		String country = sc.nextLine();
		COUNTRY[] countryArr = COUNTRY.values();
		
		for(COUNTRY c : countryArr) {
			c.notifyFood(country);
		}

		sc.close();
	}
	
	public static <T> String add(T t1, T t2) {
		return "" + t1 + t2;
	}
	
	public static Integer add(List<?> list) {
		int sum = 0;
		
		for(Object obj : list) {
			if(obj instanceof Integer ||
				obj instanceof Long ||
				obj instanceof Short ||
				obj instanceof Byte ||
				obj instanceof Character) {
				sum += (int)obj;
			} else if(obj instanceof Double || 
					obj instanceof Float) {
				sum += ((Double)obj).intValue();
			} else if(obj instanceof String) {
				sum += Integer.parseInt((String)obj);
			} else {
				return 0;
			}
		}
		
		return sum;
	}
	
	public static <T> void printArr(T[] tArr) {
		for(int i = 0; i < tArr.length; i++) {
			if(i % 3 == 0) {
				System.out.println(tArr[i]);
			}
		}
	}
	
	public static <T> T getMin(T[] tArr) {
		T min = tArr[0];
		
		for(int i = 1; i < tArr.length; i++) {
			if(min instanceof Integer ||
				min instanceof Long) {
				if((int)min > (int)tArr[i]) {
					min = tArr[i];
				}
			} else if(min instanceof Double || 
					min instanceof Float) {
				if(((Double)min).intValue() > 
						((Double)tArr[i]).intValue()) {
					min = tArr[i];
				}
			} else if(min instanceof String) {
				if(Integer.parseInt((String)min) > 
						Integer.parseInt((String)tArr[i])) {
					min = tArr[i];
				}
			} else {
				if(Integer.parseInt(min.toString()) >
						Integer.parseInt(tArr[i].toString())) {
					min = tArr[i];
				}
			}
		}
		
		return min;
	}
	
	public static <K, V> void printOverTen(Map<K, V> map) {
		for(Entry<K, V> ent : map.entrySet()) {
			if(ent.getValue().toString().length() >= 10) {
				System.out.println(ent.getKey());
			}
		}
	}

}
