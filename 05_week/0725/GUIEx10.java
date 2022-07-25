
public class GUIEx10 {
	public static void main(String[] args) {
		MFrame f = new MFrame(500,500,null,MFrame.FLOW_LAYOUT);
		
		MPanel p = new MPanel(1);
		MTextField tf = new MTextField(100,50);
		p.add(tf);
		f.add(p);
		
		
		f.setVisible(true);
	}
}
