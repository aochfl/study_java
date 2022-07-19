import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuiEx1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame(); // 창만들기
		frame.setSize(500,500);		// 크기 설정

		JPanel pnl = new JPanel();
		pnl.setBackground(Color.red);
		
		JButton btn = new JButton("Click");
		pnl.add(btn);
		
		
		frame.add(pnl);
		frame.setVisible(true);		// 화면에 표시하기
		
	}
}
