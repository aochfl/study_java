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

		// �÷����� ����ϸ� �迭�� ����Ͽ� Ư�� ����(msp[0]) ó�� ���� ������ ���� �ִ� �۾��� �ʿ����

		ArrayList<Integer> list = new ArrayList();
		list.add(10);
		list.add(1);
		list.add(2);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("1��° �� �����");
		list.remove(1);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
