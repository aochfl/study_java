import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUITest extends HFrame implements ActionListener{
	JTextField idField,phone1Field,phone2Field;
	JPasswordField pwField;
	JComboBox number_combo;
	JTextArea addressArea;
	DefaultListModel model;
	JList list;	
	JButton btn;
	
	public GUITest() {
		this.setLayout(new GridLayout(0, 2));
		
		// 회원가입정보
		JPanel totalPnl = new JPanel();
		JPanel inputPnl = new JPanel();
		inputPnl.setLayout(new GridLayout(0, 1));
		
		// id
		JPanel line1 = new JPanel();
		line1.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JLabel idLabel = new JLabel("아이디");
		line1.add(idLabel);
		idField = new JTextField(10);
		idField.setBounds(0, 0, 100, 50);
		line1.add(idField);
		inputPnl.add(line1);
		// pw
		JPanel line2 = new JPanel();
		line2.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JLabel pwLabel = new JLabel("비밀번호");
		line2.add(pwLabel);
		pwField = new JPasswordField(10);
		line2.add(pwField);
		inputPnl.add(line2);
		// phone
		JPanel line3 = new JPanel();
		line3.setLayout(new FlowLayout());
		String[] num = {"010","011","012","017","019"};
		number_combo = new JComboBox(num);
		line3.add(number_combo);
		phone1Field = new JTextField(4);
		phone2Field = new JTextField(4);
		line3.add(phone1Field);
		line3.add(phone2Field);
		inputPnl.add(line3);
		totalPnl.add(inputPnl,"North");
		
		// addresss
		JPanel addressPnl = new JPanel();
		addressPnl.setLayout(new BorderLayout());
		JLabel addressLabel = new JLabel("주소");
		addressPnl.add(addressLabel,"North");
		addressArea = new JTextArea(5,20);
		addressPnl.add(addressArea);
		totalPnl.add(addressPnl);
		
		// btn
		btn = new JButton("가입");
		btn.addActionListener(this);
		totalPnl.add(btn);
		
		this.add(totalPnl);
		
		// List
		model = new DefaultListModel<>();
		list = new JList(model);
		this.add(list);
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUITest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			String str = "";
			str += idField.getText();
			str += "/";
			str += pwField.getText();
			str += "/";
			str += number_combo.getSelectedItem();
			str += "-";
			str += phone1Field.getText();
			str += "-";
			str += phone2Field.getText();
			str += "/";
			str += addressArea.getText();
			
			model.addElement(str);
		}
		
	}
}
