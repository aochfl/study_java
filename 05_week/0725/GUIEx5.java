import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIEx5 {
	public static void main(String[] args) {
		JFrame f = new JFrame();// BorderLayout
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x 버튼 종료
		f.setSize(500, 400);
		
		JButton btn1 = new JButton("버튼1");		
		JButton btn2 = new JButton("버튼2");
		
		JPanel pnl = new JPanel();// JFrame의 기능을 가진 컴포넌트
		// 적재 가능한 컨테이너(여기에 머든 add할수 있다는 말)
		// 단독으로 사용이 안되므로 결국엔 JFrame에 붙여서 사용가능하다		
		pnl.add(btn1);
		pnl.add(btn2);
		f.add(pnl,"South");
		f.setVisible(true);
		
	}
}


