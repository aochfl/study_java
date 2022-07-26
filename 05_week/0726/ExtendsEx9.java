import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


class AButton extends JButton{
	public AButton() {
		this.setText("A");
	}
}
class BButton extends JButton{
	public BButton(String str) {
		this.setBackground(Color.blue);
		this.setText(str);
	}
}
class CButton extends JButton{
	public CButton(String str) {
		this.setForeground(Color.red);
		this.setText(str);
	}
}

class APanel extends JPanel{
	public APanel() {
		this.setBackground(Color.red);
		this.add(new JTextField("APanel"));
	}
}
class BPanel extends JPanel{
	public BPanel() {
		this.setLayout(null);
		this.setSize(100,100);
		this.setBounds(0, 0, 400, 400);
	}
}

public class ExtendsEx9 extends MFrame{
	public ExtendsEx9() {
		super(500,500,null,1);
	}
	public void addButton(JButton btn) {
		this.add(btn);
	}
	
	
	public static void main(String[] args) {
		ExtendsEx9 f = new ExtendsEx9();
		f.addButton(new AButton());
		f.addButton(new BButton("B"));
		f.addButton(new CButton("C"));
		
		f.add(new APanel());
		
		BPanel p = new BPanel();
		CButton cBtn = new CButton("Bp in Cbtn");
		cBtn.setBounds(0,0,100,100);
		p.add(cBtn);
		f.add(p);
		
		f.setVisible(true);
	}
}
