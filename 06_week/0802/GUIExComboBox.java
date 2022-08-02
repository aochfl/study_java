import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class GUIExComboBox extends HFrame implements ActionListener{
	JComboBox combo;
	JLabel lbl;
	public GUIExComboBox() {
		String[] city = {"서울","강원","충청","대전","부산","제주"};
		combo = new JComboBox<>(city);
		combo.addActionListener(this);
		lbl = new JLabel("여기에 레이블");
		this.add(combo,"North");
		this.add(lbl,"Center");
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new GUIExComboBox();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JComboBox cb = (JComboBox) e.getSource();
		System.out.println(cb.getSelectedIndex());
		int idx = cb.getSelectedIndex();
		lbl.setText(cb.getSelectedItem()+"");
	}
}
