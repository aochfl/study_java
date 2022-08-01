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
		// 버튼같은것을 누를 때 작동하는 부분
		// 어떻게 작동하는지는 알 필요가 없음. 그냥 여기 쓰면 작동함
		System.out.println("클릭");
	}
	
	public static void main(String[] args) {
		ActionTest at = new ActionTest();
	}

}
