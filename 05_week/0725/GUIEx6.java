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
		
		JLabel lbl = new JLabel("�׳ɱ۾�");
		JTextField tf = new JTextField(5); // �Է�â
		JButton btn = new JButton("��ư");
		JRadioButton radio1 = new JRadioButton("��"); // �ϳ��� ����
		JRadioButton radio2 = new JRadioButton("��"); // �ϳ��� ����
		JRadioButton radio3 = new JRadioButton("?"); // �ϳ��� ����
		JCheckBox ck1 = new JCheckBox("���"); // üũâ
		JCheckBox ck2 = new JCheckBox("����"); // üũâ
		JCheckBox ck3 = new JCheckBox("����"); // üũâ
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
