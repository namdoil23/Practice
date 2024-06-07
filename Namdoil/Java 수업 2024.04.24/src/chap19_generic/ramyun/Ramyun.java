package chap19_generic.ramyun;

import java.util.List;
import java.util.Map;

// 제네릭 클래스: 현재 클래스에서 사용할 서브클래스 또는 참조클래스의 타입을 미리 지정하지 않고
// 객체를 생성해서 사용할 때 지정할 수 있는 기능
// 제네릭 클래스에서는 서브클래스 또는 참조클래스 타입의 변수를 가지고 있거나
// 서브클래스 또는 참조클래스 타입으로 List, Map 등을 만들 수 있고
//  서브클래스 또는 참조클래스 타입이 리턴되는 메소드도 미리 정의할 수 있다.
public class Ramyun<T> {
	// 서브클래스 타입의 변수
	private T t;
	// 서브클래스 타입의 목록
	private List<T> tList;
	private Map<String, T> tMap;
	
	// 리턴 타입이 서브클래스인 메소드
	public T getT() {
		return t;
	}
	public List<T> gettList() {
		return tList;
	}
	public Map<String, T> gettMap() {
		return tMap;
	}
	
	// 매개변수가 서브클래스 타입인 메소드
	public void setT(T t) {
		this.t = t;
	}
	public void settList(List<T> tList) {
		this.tList = tList;
	}
	public void settMap(Map<String, T> tMap) {
		this.tMap = tMap;
	}
	
	// T의 타입이 지정되지 않아서 Object의 메소드만 사용가능
	public void printCurrentT() {
//		this.t.equals(t);
		System.out.println(this.t);
	}
}
