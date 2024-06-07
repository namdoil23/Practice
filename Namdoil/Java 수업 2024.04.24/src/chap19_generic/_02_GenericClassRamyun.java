package chap19_generic;

import java.util.ArrayList;
import java.util.List;

import chap19_generic.ramyun.Danmuji;
import chap19_generic.ramyun.Gimchi;
import chap19_generic.ramyun.Ramyun;

public class _02_GenericClassRamyun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제네릭 클래스 변수를 선언할 때 제네릭 클래스의 서브클래스 타입을 지정한다.
		Ramyun<Danmuji> ramyun = new Ramyun<>();
		
		ramyun.setT(new Danmuji());
		
		System.out.println(ramyun.getT());
		
		List<Danmuji> danmujiList = new ArrayList<>();
		danmujiList.add(new Danmuji());
		danmujiList.add(new Danmuji("white"));
		
		ramyun.settList(danmujiList);
		
		for(Danmuji danmuji : ramyun.gettList()) {
			System.out.println(danmuji);
		}
		
		Ramyun<Gimchi> gimchiRamyun = new Ramyun<>();
		
		gimchiRamyun.setT(new Gimchi());
		
		System.out.println(gimchiRamyun.getT());
		
		
		
	}

}
