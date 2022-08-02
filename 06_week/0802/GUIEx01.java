import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIEx01 extends JFrame implements ActionListener{
	JButton btn;
	public GUIEx01() {
		this.setSize(200,200);;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btn = new JButton();
		btn.addActionListener(this);
		this.add(btn);
		this.setVisible(true);
	}
	void printGui() {
		System.out.println("프린트");
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			printGui();
			}
	}
	
	// 스윙 프로그래밍 = 자바의 GUI <-> 치ㅑ
	// AWT = 자바의 GUI, 다만 OS의 리소스를 가져다가 쓴다.
	// Swing = 자의 GUI, 자체 리소스를 사용한다.
	
	// 컨테이너 = 컴포넌트를 담을수 있는 객체
	// JFrame, JPanel, JDialog, JApple(보안, 설치문제로 현재 사용x)
	
	// 컴포넌트 = 컨테이너에 붙일수 있는 존재
	// JButton, JPanel, JCheckBox, JRadioButton, JTextField
	// JPasswordField, JTextArea, JComboBox, JList, JProgreesber
	// JToolTip, JScrollPane, JMenu, JTable
	
	public static void main(String[] args) {
		new GUIEx01();
	}
}
