import java.awt.Color;

import javax.swing.JPanel;

public class CPanel extends JPanel{
	public CPanel() {
		//super(); <= 부모의 생성자를 반드시 불러야 하는것은 아님
		// 왜냐하면 부모가 빈생성자를 가지고 있으니 알아서 호출됨
		// 만약 부모가 빈생성자() <= 과로안에 아무것도 없는 생성자가 없다면 반드시
		// 		super(매개변수) <= 부모의 생성자를 명시적으로 호출해야함
	}
	public CPanel(Color c) {
		this.setBackground(c);
	}
}
