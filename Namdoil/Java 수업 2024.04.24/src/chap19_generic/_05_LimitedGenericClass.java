package chap19_generic;

import chap19_generic.ramyun.Danmuji;
import chap19_generic.ramyun.Gimchi;
import chap19_generic.ramyun.LimitedRamyun01;
import chap19_generic.ramyun.PaGimchi;

public class _05_LimitedGenericClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// LimitedRamyun01 클래스에 제한을 걸어둔 Gimchi를 상속받은 클래스와
		// Gimchi클래스까지 서브클래스의 타입으로 지정할 수 있다.
		LimitedRamyun01<Gimchi> gimchiRamyun = new LimitedRamyun01<>();
		LimitedRamyun01<PaGimchi> paGimchiRamyun = new LimitedRamyun01<>();
		
		// Gimchi를 상속받지 않은 Danmuji는 서브클래스의 타입으로 지정할 수 없다.
//		LimitedRamyun01<Danmuji> danmujiRamyun = new LimitedRamyun01<>();
	}

}
