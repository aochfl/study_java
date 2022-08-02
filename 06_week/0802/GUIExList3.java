import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;

public class GUIExList3 extends HFrame implements ActionListener{
	JButton btnL, btnR;
	JList listL, listR;
	DefaultListModel modelL,modelR;
	
	public GUIExList3() {		
		btnL = new JButton("<");
		btnL.addActionListener(this);
		this.add(btnL,"South");
		btnR = new JButton(">");
		btnR.addActionListener(this);
		this.add(btnR,"North");

		JPanel pnl = new JPanel();
		pnl.setLayout(new GridLayout(1, 2));
		modelL = new DefaultListModel<>();
		listL = new JList(modelL);
		pnl.add(listL);

		modelR = new DefaultListModel<>();
		listR = new JList(modelR);
		pnl.add(listR);
		this.add(pnl);
		
		this.setVisible(true);
		

		String[] cityList = {"서울","강원","충청","대전","부산","제주"};
		for(String city : cityList) {
			modelL.addElement(city);
		}
	}
	public static void main(String[] args) {
		new GUIExList3();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnR) {
			int idx = listL.getSelectedIndex();
			if(idx >= 0) {
				modelR.addElement(modelL.getElementAt(idx));
				modelL.remove(idx);
				if(!modelL.isEmpty()) {
					listL.setSelectedIndex(0);
				}
			}
		}else if(e.getSource() == btnL) {
			int idx = listR.getSelectedIndex();
			if(idx >= 0) {
				modelL.addElement(modelR.getElementAt(idx));
				modelR.remove(idx);
				if(!modelR.isEmpty()) {
					listR.setSelectedIndex(0);
				}
			}
		}
		
	}
}
