import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class GUIExComboBox3 extends HFrame implements ItemListener{
	JComboBox combo;
	JLabel lbl;
	
	
	public GUIExComboBox3() {
		String[] city = {"����","����","��û","����","�λ�","����"};
		combo = new JComboBox<>(city);
		combo.addItemListener(this);
		lbl = new JLabel("���Ⱑ ���̺�");
		this.add(combo,"North");
		this.add(lbl,"Center");
		
		this.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			lbl.setText(e.getItem()+"");
		}
	}
	
	public static void main(String[] args) {
		new GUIExComboBox();
	}
}
