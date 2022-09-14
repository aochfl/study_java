package _0913;

import java.util.ArrayList;

import javax.swing.JPanel;

class MyPanel extends JPanel {

}

public class ListEx2 {
	public static void main(String[] args) {

		MyPanel[] mps = new MyPanel[10];
		mps[0] = new MyPanel();

		ArrayList<MyPanel> list2 = new ArrayList<>();
		list2.add(new MyPanel());

		// 컬렉션을 사용하면 배열에 대비하여 특정 변수(msp[0]) 처럼 따로 변수에 값을 넣는 작업이 필요없다

		ArrayList<Integer> list = new ArrayList();
		list.add(10);
		list.add(1);
		list.add(2);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("1번째 값 지우기");
		list.remove(1);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
