import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MFrame extends JFrame{
	final static int BORDER_LAYOUT = 0 ;
	final static int FLOW_LAYOUT = 1 ;
	public MFrame() {
		this(500,400,null, BORDER_LAYOUT);
	}
	public MFrame(int w,int h) {
		this(w,h,null, BORDER_LAYOUT);
	}
	public MFrame(int w, int h, Color c) {
		this(w,h,c, BORDER_LAYOUT);
	}
	public MFrame(int w, int h, Color c,int layout) {
		this.setSize(w,h);
		this.setBackground(c);
		if(layout == FLOW_LAYOUT) {
			this.setLayout(new FlowLayout());
		}
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
