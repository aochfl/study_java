import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class IOTest extends JFrame{
	JPanel pnl;
	JButton btn;
	JCheckBox ck;
	JRadioButton rb;
		
	public IOTest() {
		pnl = new JPanel();
		btn = new JButton("버튼");
		ck = new JCheckBox("체크박스");
		rb = new JRadioButton("라디오");
		pnl.add(btn);
		pnl.add(ck);
		pnl.add(rb);
		this.add(pnl);
		this.setSize(500,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		IOTest io = new IOTest();
		
		System.out.println(io.pnl.getComponentCount());
		int cnt = 0 ;
		for(int i=0;i<io.pnl.getComponentCount();i++) {
			System.out.println(io.pnl.getComponent(i));
		}
	}
}
