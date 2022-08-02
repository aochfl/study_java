import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTextField;

public class GUIExTextField2 extends HFrame implements FocusListener{
	JTextField tf1, tf2;

	public GUIExTextField2() {
		super(new FlowLayout());
		tf1 = new JTextField(0);
		tf2 = new JTextField(1);
//		tf1.setBackground(Color.while);
		tf1.addFocusListener(this);
		tf2.addFocusListener(this);

		this.add(tf1);
		this.add(tf2);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIExTextField2();
	}
	@Override
	public void focusGained(FocusEvent e) {
		JTextField tf = (JTextField) e.getSource();
		// 내가 선택한 TextField를 tf라고 해주기 위해서 위에 코드처럼 작성
		tf.setBackground(Color.RED);
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		JTextField tf = (JTextField) e.getSource();
		tf.setBackground(Color.white);
	}
}
