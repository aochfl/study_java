package _0913;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ListEx1 {

	
	
	
	public static void main(String[] args) {
		List<JButton> ls = new ArrayList<>(); // ������ �ִ� ���� Ÿ���� �⺻ Object��
		// ���׸� - Ư�� Ÿ���� �̸� �����ؼ� �װ͸� ����ϵ��� ������
		// ���� Ÿ���� �����ν� �߻��� �� �ִ� ������ �̿��� ������
		// Ÿ���� �̸� �������� ������ ���� �����ͼ�(get) ����ȯ�� �� �ʿ䰡 ����
		// E-Element : ���� ���
		// T-Type : Ÿ��
		// K-Key : Map�� ���Ǵ� Ű
		// V-Value : Map���� ���Ǵ� ��
		// N-Number : ����
		
				
//		ls.add("����");
//		ls.add(10);
//		ls.add(11.1);
//		ls.add(false);
		ls.add(new JButton());
		
		JFrame frame =  new JFrame();
		JButton btn = ls.get(4);
		
	}
}
