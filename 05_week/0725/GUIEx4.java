import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEx4 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setLayout(null); // 기본 레이아웃을 없애버림
		f.setSize(300,200);

		JButton btn1 = new JButton("버튼1");
		btn1.setSize(70,50);;
		btn1.setLocation(0,10);
		
		f.add(btn1);
		
		f.setVisible(true);
	}
}
