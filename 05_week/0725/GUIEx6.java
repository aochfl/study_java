import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class GUIEx6 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setSize(300,500);
		f.setLayout(new FlowLayout());
		
		JLabel lbl = new JLabel("그냥글씨");
		JTextField tf = new JTextField(5); // 입력창
		JButton btn = new JButton("버튼");
		JRadioButton radio1 = new JRadioButton("남"); // 하나만 선택
		JRadioButton radio2 = new JRadioButton("여"); // 하나만 선택
		JRadioButton radio3 = new JRadioButton("?"); // 하나만 선택
		JCheckBox ck1 = new JCheckBox("사과"); // 체크창
		JCheckBox ck2 = new JCheckBox("망고"); // 체크창
		JCheckBox ck3 = new JCheckBox("포도"); // 체크창
		ButtonGroup bg = new ButtonGroup();
		bg.add(radio1);
		bg.add(radio2);
		bg.add(radio3);
		
		f.add(lbl);
		f.add(tf);
		f.add(btn);
		f.add(radio1);
		f.add(radio2);
		f.add(radio3);
		f.add(ck1);
		f.add(ck2);
		f.add(ck3);
		f.setSize(700,500);
		f.setVisible(true);
		
		
	
	}
}
