package _0913;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapEx1 {
	public static void main(String[] args) {
		// map 객체는 순서가 없다. => iterater 쓸수 있다.
		// set과 틀린점은 값에 접근가능한 key를 가지고 있다.
		// 만들때 key,value를 같이 넣어준다.
		// 순서가 없지만 key 로 언제나 값을 가져올 수 있다.

		HashMap<String, Integer> map = new HashMap<>();
		map.put("넘버1", 1);// 키, 값
		map.put("넘버2", 2);
		map.put("넘버3", 3);

		// System.out.println(map.get("넘버1"));// key로 get 하면 value를 가져옴

		// 기본으로 반복자를 가지고 있음. - 키와 값 같이 가져오기
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("키:" + entry.getKey());
			System.out.println("값:" + entry.getValue());
		}

		for (String key : map.keySet()) {// 키만 다 가져오기
			System.out.println(key);
		}

		for (Integer val : map.values()) {// 값만 다 가져오기
			System.out.println(val);
		}

		Iterator<Map.Entry<String, Integer>> entires = map.entrySet().iterator();
		while (entires.hasNext()) {
			Map.Entry<String, Integer> entry = entires.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}
}
