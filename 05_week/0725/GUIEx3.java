import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEx3 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300,200);
		GridLayout gl = new GridLayout(3,2);// (��, ��) - ���� ���� 0���� �Ѵ�.
											// ���ڶ�� �ڵ����� ���� �þ, �ٴ� ������ ���� -> ������
		f.setLayout(gl);

		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton("��ư5");

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		
		
		f.setVisible(true);
	}
}
