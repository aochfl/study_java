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
	DefaultListModel model; // ����Ʈ�� ���� �߰�/����/���������� �����ϰ� ������ش�
	
	public GUIExList2() {
		tf = new JTextField(15);
		btnAdd = new JButton("�߰�");
		btnAdd.addActionListener(this);
		btnDel = new JButton("����");
		btnDel.addActionListener(this);
		JPanel pnl = new JPanel();
		pnl.add(tf);
		pnl.add(btnAdd);
		pnl.add(btnDel);
		
		model = new DefaultListModel<>();
		
		list = new JList(model); // �迭�� �־� �ʱⰪ�� ������� ������
		// JList, JComboBox, JTable ���� ��� �迭�� ������  ����, ������ �����ʴ´�
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
			JOptionPane.showMessageDialog(this, "�����Է����ּ���");
		}else{
			model.addElement(str);
			tf.setText("");
		}
		tf.grabFocus();
		
	}
	public void removeItem() {
		int idx = list.getSelectedIndex();
		if(idx < 0) {
			JOptionPane.showMessageDialog(this, "���� ����� �������ּ���");
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
