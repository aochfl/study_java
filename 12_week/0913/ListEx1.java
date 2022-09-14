package _0913;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ListEx1 {

	
	
	
	public static void main(String[] args) {
		List<JButton> ls = new ArrayList<>(); // 넣을수 있는 값의 타입은 기본 Object임
		// 제네릭 - 특정 타입을 미리 정의해서 그것만 사용하도록 강제함
		// 여러 타입이 들어감으로써 발생할 수 있는 문제를 미연에 방지함
		// 타입이 미리 정해지기 때문에 값을 가져와서(get) 형변환을 할 필요가 없음
		// E-Element : 넣을 요소
		// T-Type : 타입
		// K-Key : Map서 사용되는 키
		// V-Value : Map에서 사용되는 값
		// N-Number : 숫자
		
				
//		ls.add("문자");
//		ls.add(10);
//		ls.add(11.1);
//		ls.add(false);
		ls.add(new JButton());
		
		JFrame frame =  new JFrame();
		JButton btn = ls.get(4);
		
	}
}
