
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEx2 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		
		FlowLayout fl = new FlowLayout();
		f.setLayout(fl);
		//f.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		
		f.setVisible(true);
	}
}
