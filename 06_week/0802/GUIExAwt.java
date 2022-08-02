import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class GUIExAwt extends Frame{
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(200,300);
		f.setLayout(new FlowLayout());
		Button btn = new Button("클릭");
		f.add(btn);
		WindowListener wl = new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
			}
		};
		f.addWindowListener(wl);
		f.setVisible(true);
		
		JFrame jf = new JFrame();
		jf.setSize(200,300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());
		JButton btn2 = new JButton("클릭");
		jf.add(btn2);
		jf.setVisible(true);
	}
}
