import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

class HButton extends JButton{
	public HButton(String str) {
		this.setText(str);
		this.setBackground(Color.blue);
	}
}


public class ExtendsEx3 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,200);
		
		//JButton btn = new JButton("Ŭ��");
		HButton btn = new HButton("Ŭ��");
		
		
		f.add(btn);
		
		f.setVisible(true);
	}
}
