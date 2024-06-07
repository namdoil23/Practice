package chap02_variables;

public class _10_TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 자동형변환1: byte 크기가 작은 타입에서 큰 타입으로는 자동형변환이 일어난다.
		short sNum1 = 10;
		
		// short은 2byte고 int는 4byte이기 때문에 sNum1이 자동으로 int 타입으로 변환된다.
		int iNum1 = sNum1;
		
		// 2. 자동형변환2: 좀 더 세밀한 표현범위를 갖는 타입으로 자동형변환이 일어난다.(정수 -> 실수)
		long lNum1 = 200L;
		
		// long은 8byte고 float는 4byte로 long이 byte 크기는 더 크지만 float가 더 세밀한 표현범위를 갖고 있기 때문에
		// lNum1이 float 타입으로 변환된다.
		float fNum1 = lNum1;
		
		// 3. 강제형변환1: byte 크기가 큰 타입에서 작은 타입으로 변환할 때는 타입을 명시해줘야 한다.
		int iNum2 = 60;
		
		// int 타입인 iNum2가 short 타입보다 byte 크기가 크기때문에 강제로 short 타입으로 변환한다.
		short sNum2 = (short)iNum2;
		
		// 4. 강제형변환2: 덜 세밀한 표현범위를 갖는 타입으로 변환할 때도 타입을 명시해줘야 한다.
		float fNum2 = 3.14f;
		
		// long 타입인 lNum2가 덜 세밀한 표현범위를 갖기 때문에 강제로 long 타입으로 변환한다.
		long lNum2 = (long)fNum2;
		
		
		// 5. 연산에서의 형변환
		// 형변환순서에 따라서 연산중에 byte 크기가 더 큰 타입이나 좀 더 세밀한 표현범위를 갖는 타입으로 자동 형변환이 일어난다.
		// 연산의 결과도 형변환된 타입으로 나타난다.
		long result1 = lNum1 + iNum1;
		
		int result2 = (int)lNum1 + iNum1;
		int result3 = (int)(lNum1 + iNum1);
		
		
		// 6. 문자열 결합 연산
		// 문자열 결합 연산에서는 모든 타입이 문자열로 변환된 후 문자열과 결합된다.
		String str = "bitcamp";
		int classRoom = 502;
		double dNum1 = 11.1592;
		
		//                  "bitcamp" + "11.1592" 
		String combineStr = str + dNum1;
		System.out.println(combineStr);
		
		
		
		
	}

}
