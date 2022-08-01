import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowEvent extends JFrame implements WindowListener{
	public WindowEvent() {
		this.setSize(300,300);
		this.setVisible(true);
		this.addWindowListener(this);
		// ���� �� Ŭ�������ٰ� ������ �̺�Ʈ�� ����
	}
	
	public static void main(String[] args) {
		new WindowEvent();
	}
	
	@Override
	public void windowOpened(java.awt.event.WindowEvent e) {
		System.out.println("windowOpened");
	}

	@Override
	public void windowClosing(java.awt.event.WindowEvent e) {
		System.out.println("windowClosing");
		JOptionPane.showMessageDialog(this, "�����ϰڽ��ϴ�.");
		System.exit(0);
	}

	@Override
	public void windowClosed(java.awt.event.WindowEvent e) {
		System.out.println("windowClosed");
	}

	@Override
	public void windowIconified(java.awt.event.WindowEvent e) {
		System.out.println("windowIconified");
	}

	@Override
	public void windowDeiconified(java.awt.event.WindowEvent e) {
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowActivated(java.awt.event.WindowEvent e) {
		System.out.println("windowActivated");
	}

	@Override
	public void windowDeactivated(java.awt.event.WindowEvent e) {
		System.out.println("windowDeactivated");
	}

}
