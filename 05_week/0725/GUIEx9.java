import java.awt.Color;

import javax.swing.JButton;

public class GUIEx9 extends MFrame{
	public GUIEx9() {
		//super(); // ��� �ڵ�ȣ��
		//super(700,600);
		//super(1000,500,Color.red);
		super(1000,500,null,MFrame.FLOW_LAYOUT);
		
		JButton btn = new JButton("Ŭ��");
		this.add(btn);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIEx9();
	}
}
