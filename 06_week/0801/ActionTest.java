import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionTest extends JFrame implements ActionListener{
	public ActionTest() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,400);;
		JButton btn = new JButton();
		btn.addActionListener(this);
		this.add(btn);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// ��ư�������� ���� �� �۵��ϴ� �κ�
		// ��� �۵��ϴ����� �� �ʿ䰡 ����. �׳� ���� ���� �۵���
		System.out.println("Ŭ��");
	}
	
	public static void main(String[] args) {
		ActionTest at = new ActionTest();
	}

}
