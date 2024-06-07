package chap18_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _08_MapObjectvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map의 value를 Object타입으로 지정하면 value에 모든 타입을 담을 수 있게 된다.
		// VO(Value Object), DTD(Data Transfer Object), Entity 클래스를 만드는데
		// DB의 테이블과 매핑되도록 만든다.
		// 테이블들을 조인해서 데이터를 가지고 오면 VO나 DTO, Entity로 담을 수 없는 데이터들이 
		// 생기기 때문에 Map을 이용한다.
		// A 테이블: id, name, AVO: int id, String name
		// B 테이블: team_id, team_name, id
		// BVO: int team_id, String team_name, int id
		// id, name, team_id, team_name을 함께 가져오려면 새로운 클래스가 필요한다
		// 클래스는 새로 만드는 것보다 Map을 이용하는 것이 편하다.
		// id, name, team_id, team_name의 타입이 모두 다르기때문에 value의 Object로 
		// 지정해서 모든 값들을  담을 수 있도록 한다.
		Map<String, Object> objMap = new HashMap<>();	
		
		/*
		 * {
		 * 		serialNo:1234
		 * 		intList:[
		 * 					1
		 * 					2
	 	 * 					3		
	     * 					4
	 	 * 				]	
	 	 * }
		 */
		
		
		
		
		objMap.put("serialNo", 1234);
		
		List<Integer> intList = new ArrayList<>();
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		objMap.put("intList", objMap);
		
		System.out.println(objMap);

		
		
	}

}
