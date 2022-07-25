import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class MPanel extends JPanel{
	final static int BORDER_LAYOUT = 0 ;
	final static int FLOW_LAYOUT = 1 ;
	public MPanel() {
		this(0,null);
	}
	public MPanel(int layout) {
		this(layout,null);
	}
	public MPanel(int layout, Color c) {
		if(layout == FLOW_LAYOUT) {
			this.setLayout(new FlowLayout());
		}
		this.setBackground(c);
	}
}
