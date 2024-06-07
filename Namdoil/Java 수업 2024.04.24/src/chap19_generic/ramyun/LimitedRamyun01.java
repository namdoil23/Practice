package chap19_generic.ramyun;

// 제한된 제네릭: 제네릭에 지정될 타입에 제한을 거는 기능
// extends, super 키워드를 이용해서 제한을 걸 수 있다.
// <T extends 부모클래스>: 부모클래스를 상속받은 자식클래스만 타입으로 지정가능. 부모클래스도 타입으로 지정가능
// <T super 자식클래스>: 자식클래스에게 상속해준 부모클래스까지만 타입으로 지정가능. 자식클래스도 타입으로 지정가능
public class LimitedRamyun01<T extends Gimchi> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "LimitedRamyun01 [t=" + t + "]";
	}
}
