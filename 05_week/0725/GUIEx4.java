import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEx4 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setLayout(null); // �⺻ ���̾ƿ��� ���ֹ���
		f.setSize(300,200);

		JButton btn1 = new JButton("��ư1");
		btn1.setSize(70,50);;
		btn1.setLocation(0,10);
		
		f.add(btn1);
		
		f.setVisible(true);
	}
}
