import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEx1 {
	public static void main(String[] args) {
		JFrame f = new JFrame();// 창을 만듬
								// f안에 있는 여러 메서드들을 사용가능하다.
								// 이 메서드들은 대부분 f의 설정, 값들을 넣거나 가져오는 기능들이다.
		f.setSize(500, 500);

		JButton btn1 = new JButton("버튼1");
		btn1.setSize(100, 100);
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton();
		btn5.setText("버튼5");

		f.add(btn1,"North");
		f.add(btn2,"East");
		f.add(btn3,"West");
		f.add(btn4,"South");
		f.add(btn5,"Center");
		
		f.setVisible(true);
	}
}
