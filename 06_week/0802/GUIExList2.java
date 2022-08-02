import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class GUIExList2 extends HFrame implements ActionListener{
	JTextField tf;;
	JButton btnAdd,btnDel;
	JList list;
	DefaultListModel model; // 리스트에 값을 추가/수정/삭제삭제가 가능하게 만들어준다
	
	public GUIExList2() {
		tf = new JTextField(15);
		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		btnDel = new JButton("삭제");
		btnDel.addActionListener(this);
		JPanel pnl = new JPanel();
		pnl.add(tf);
		pnl.add(btnAdd);
		pnl.add(btnDel);
		
		model = new DefaultListModel<>();
		
		list = new JList(model); // 배열을 넣어 초기값을 만들수는 있으나
		// JList, JComboBox, JTable 같은 경우 배열로 넣으면  수정, 삭제가 되지않는다
		JScrollPane sp = new JScrollPane(list);
		
		this.add(pnl,"North");
		this.add(sp);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new GUIExList2();
	}
	
	public void addItem() {
		String str = tf.getText().trim();
		if(str.equals("")) {
			JOptionPane.showMessageDialog(this, "값을입력해주세요");
		}else{
			model.addElement(str);
			tf.setText("");
		}
		tf.grabFocus();
		
	}
	public void removeItem() {
		int idx = list.getSelectedIndex();
		if(idx < 0) {
			JOptionPane.showMessageDialog(this, "지울 목록을 선택해주세요");
		}else {
			model.remove(idx);
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAdd) {
			addItem();
		}else if(e.getSource()==btnDel) {
			removeItem();
		}

			
	}
}
