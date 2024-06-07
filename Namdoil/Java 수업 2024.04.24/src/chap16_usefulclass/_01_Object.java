package chap16_usefulclass;

public class _01_Object {
	public static class ObjectExample {
		private int num1;
		private int num2;
		
		public ObjectExample() {
			
		}
		
		public ObjectExample(int num1, int num2) {
			this.num1 = num1;
			this.num2 = num2;
		}
		
		// clone 메소드는 Object 클래스에 구현이 되어있지 않기때문에
		// 상속받은 자식클래스에서 구현해야된다.
		@Override
		public Object clone() {
			Object obj = null;
			
			try {
				// 깊은 복제
				obj = super.clone();
			} catch(CloneNotSupportedException ce) {
				System.out.println(ce.getMessage());
			}
			
			return obj;
		}
		
		@Override
		public String toString() {
			return "Example [num1 = " + num1 + ", num2 = " + num2 + "]";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectExample objExample1 = new ObjectExample();
		
		// Object의 clone 메소드는 깊은 복제로 메모리에 새로운 객체를 하나 더 생성한다.
		ObjectExample objExample2 = (ObjectExample)objExample1.clone();
		
		// Object eqauls 메소드는 같은 객체인지 다른 객체인지를 비교한다.
		if(objExample1.equals(objExample2)) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
			
		// 객체의 얕은 복제
		objExample2 = objExample1;
			
		if(objExample1.equals(objExample2)) {
			System.out.println("같은 객체입니다.");
		} else {
			System.out.println("다른 객체입니다.");
		}
			
		System.out.println(objExample1);
		
		// 클래스나 타입을 확인할 때 Object의 getClass메소드를 이용한다.
		System.out.println(objExample1.getClass().getName());
		System.out.println(objExample1.getClass().getSimpleName());

			
			
			
			
	}

}
