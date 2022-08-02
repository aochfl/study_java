import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class GUIExTextField extends HFrame implements KeyListener {
	JTextField tf;
	public GUIExTextField() {
		tf = new JTextField();
		tf.addKeyListener(this);
		this.add(tf);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new GUIExTextField();
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Ű ������ ����");
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Ű �������ִµ���");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Ű����");
	}
	
}
