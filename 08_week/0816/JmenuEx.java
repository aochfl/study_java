import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class JmenuEx extends JFrame{
	public JmenuEx() {
		this.setSize(400,200);
		this.setDefaultCloseOperation(3);
		
		JMenuBar bar = new JMenuBar();
		
		JMenu menu1 = new JMenu("�޴�1");
		
		JMenu menu2 = new JMenu("Menu2");
		menu2.setMnemonic(KeyEvent.VK_M);// Menu2 �� M �κп� ������ ����
		
		
		JMenuItem item1 = new JMenuItem("�޴� �׸�1");
		JMenuItem item2 = new JMenuItem("�޴� �׸�1");
		JMenuItem item3 = new JMenuItem("�޴� �׸�1");
		JMenuItem item4 = new JMenuItem("�޴� �׸�1");
		
		item3.setAccelerator(
			KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.ALT_MASK));
		
		bar.add(menu1);
		bar.add(menu2);
		
		menu1.add(item1);
		menu1.add(item2);
		
		menu2.add(item3);
		menu2.addSeparator();// ����
		menu2.add(item4);
		
		this.setJMenuBar(bar);
		
		this.setVisible(true);
	}
	
	
	
	
	
	public static void main(String[] args) {
		new JmenuEx();
	}
}
