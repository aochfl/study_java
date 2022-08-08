import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GUITest extends HFrame implements ActionListener, ListSelectionListener{
	String[] phoneNum = {"010","011","012","017","019"};
	
	JTextField idField,phone1Field,phone2Field;
	JPasswordField pwField;
	JComboBox number_combo;
	JTextArea addressArea;
	DefaultListModel model;
	JList list;	
	JButton btnAdd,btnMod,btnDel;
	
	File file;
	FileWriter fw;
	PrintWriter pw;
	
	FileReader fr;
	BufferedReader br;
	
	public GUITest() {
		this.setSize(500,350);
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
		number_combo = new JComboBox(phoneNum);
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
		btnAdd = new JButton("가입");
		btnAdd.addActionListener(this);
		totalPnl.add(btnAdd);
		btnMod = new JButton("수정");
		btnMod.addActionListener(this);
		totalPnl.add(btnMod);
		btnDel = new JButton("삭제");
		btnDel.addActionListener(this);
		totalPnl.add(btnDel);	
		this.add(totalPnl);
		
		// List
		model = new DefaultListModel<>();
		list = new JList(model);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.addListSelectionListener(this);
		this.add(list);
		
		this.setVisible(true);
		loadMemberList();
	}

	private void loadMemberList() { // 파일에 저장되어있는 정보들을 리스트로 불러오는 동작
		file = new File("./member.txt");
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = "";
			while((line = br.readLine())!= null) {
				model.addElement(line);
			}
			
			br.close();
			fr.close();
		} catch(FileNotFoundException e) {
			System.out.println("저장된파일없음");
		}
		catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	private void saveMemberList() { // 리스트에 있는 정보들을 파일로 저장하는 동작
		file = new File("./member.txt");
		try {
			fw = new FileWriter(file);
			pw = new PrintWriter(fw);
			
			for(int i = 0 ; i < model.getSize() ; i++) {
				pw.append(model.elementAt(i)+"\n");
			}
			
			pw.flush();
			
			pw.close();
			fw.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	// 버튼 눌렸을경우
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnAdd) {
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
			
			saveMemberList(); // 리스트를 파일로 저장
		}else if(e.getSource() == btnMod) { // 수정 버튼을 눌렸을 때
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

			int index = list.getSelectedIndex();
			model.set(index, str);
			
			saveMemberList(); // 리스트를 파일로 저장
			
		} else if(e.getSource()== btnDel) {
			int index = list.getSelectedIndex();
			
			if(index != -1) model.remove(index);
			
			saveMemberList(); // 리스트를 파일로 저장
		}
		
	}

	// 리스트 눌렸을 경우
	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(e.getValueIsAdjusting()) {
			int index = list.getSelectedIndex();
			String[] str = model.getElementAt(index).toString().split("/");
			idField.setText(str[0]);
			pwField.setText(str[1]);
			String[] phone = str[2].split("-");
			int phoneIndex = 0 ;
			for(int i = 0 ; i < phoneNum.length ; i++) { 
				if ( phoneNum[i].equals(phone[0])) {
					phoneIndex = i ;
					break;
				}
			}
			number_combo.setSelectedIndex(phoneIndex);
			phone1Field.setText(phone[1]);
			phone2Field.setText(phone[2]);

			String address = "";
			if(str.length == 4)
			{
				address = str[3];
			}
			addressArea.setText(address);
		}
	}
	
	public static void main(String[] args) {
		new GUITest();
	}

}
