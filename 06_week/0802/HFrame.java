import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;

public class HFrame extends JFrame{
	public HFrame() {
		this(new BorderLayout());
	}
	public HFrame(LayoutManager manager) {
		this.setSize(500,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(manager);
	}
	
}
