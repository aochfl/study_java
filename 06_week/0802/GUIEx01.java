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
		System.out.println("����Ʈ");
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			printGui();
			}
	}
	
	// ���� ���α׷��� = �ڹ��� GUI <-> ġ��
	// AWT = �ڹ��� GUI, �ٸ� OS�� ���ҽ��� �����ٰ� ����.
	// Swing = ���� GUI, ��ü ���ҽ��� ����Ѵ�.
	
	// �����̳� = ������Ʈ�� ������ �ִ� ��ü
	// JFrame, JPanel, JDialog, JApple(����, ��ġ������ ���� ���x)
	
	// ������Ʈ = �����̳ʿ� ���ϼ� �ִ� ����
	// JButton, JPanel, JCheckBox, JRadioButton, JTextField
	// JPasswordField, JTextArea, JComboBox, JList, JProgreesber
	// JToolTip, JScrollPane, JMenu, JTable
	
	public static void main(String[] args) {
		new GUIEx01();
	}
}
