import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class TabbedPaneEx extends JFrame {
	
	public TabbedPaneEx() {
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabPnl = new JTabbedPane();
		tabPnl.add("메뉴1",new JTextArea());
		tabPnl.add("메뉴2",new JTextArea());
//		this.add(tabPnl);
		
		JTextArea ta = new JTextArea("asdfasdf");
		this.add(tabPnl,"North");
		this.add(ta,"South");
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		TabbedPaneEx ex = new TabbedPaneEx();
	}
}
