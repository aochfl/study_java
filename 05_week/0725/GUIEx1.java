import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEx1 {
	public static void main(String[] args) {
		JFrame f = new JFrame();// â�� ����
								// f�ȿ� �ִ� ���� �޼������ ��밡���ϴ�.
								// �� �޼������ ��κ� f�� ����, ������ �ְų� �������� ��ɵ��̴�.
		f.setSize(500, 500);

		JButton btn1 = new JButton("��ư1");
		btn1.setSize(100, 100);
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton();
		btn5.setText("��ư5");

		f.add(btn1,"North");
		f.add(btn2,"East");
		f.add(btn3,"West");
		f.add(btn4,"South");
		f.add(btn5,"Center");
		
		f.setVisible(true);
	}
}
