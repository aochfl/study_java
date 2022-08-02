import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;

public class GUIExCheckBox extends HFrame implements ItemListener{
	JCheckBox ck1, ck2, ck3;
	public GUIExCheckBox() {
		super(new FlowLayout());
		ck1 = new JCheckBox("����");
		ck2 = new JCheckBox("����");
		ck3 = new JCheckBox("���");
		ck1.addItemListener(this);
		ck2.addItemListener(this);
		ck3.addItemListener(this);
		this.add(ck1);
		this.add(ck2);
		this.add(ck3);
		this.setVisible(true);
	}
	// itemlist�� üũ �ڽ��� ���� ���� �����ϴ� �Ϳ� ���
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==ck1) {
			if(ck1.isSelected()) {
				System.out.println("üũ��");
			}
			else {
				System.out.println("üũǮ��");
			}
		}
		else if(e.getSource()==ck2) {
			if(ck2.isSelected()) {
				System.out.println("üũ��");
			}
			else {
				System.out.println("üũǮ��");
			}
		}
		else if(e.getSource()==ck3) {
			if(ck3.isSelected()) {
				System.out.println("üũ��");
			}
			else {
				System.out.println("üũǮ��");
			}
		}
	}
	
	public static void main(String[] args) {
		new GUIExCheckBox();
	}
}
