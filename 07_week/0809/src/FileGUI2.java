import java.awt.BorderLayout;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class FileGUI2 extends JFrame implements ActionListener{
	JLabel lblIdx,lblName,lblAge;
	JTextField tfIdx, tfName, tfAge;
	JList<String> list;
	DefaultListModel<String> model;
	JButton btnSave,btnLoad,btnDel,btnAllDel,btnUpdate;
	JPanel pnlNorth,pnlSouth;
	
	File f;
	public FileGUI2() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f=new File("./FileGUI2.txt");
		
		//컴포넌트 생성
		lblIdx = new JLabel("번호");
		lblName = new JLabel("이름");
		lblAge = new JLabel("나이");
		tfIdx = new JTextField();
		tfName = new JTextField();
		tfAge = new JTextField();
		model = new DefaultListModel<>();
		list = new JList<>(model); // 모델이 없다면 읽기전용이다
		// model의 핵심기능. 선택하지 않고 번호로 그 줄의 값을 가져올 수 있다.
		// 리스트는 반드시 하나이상을 선택해야지만 그 값을 가져올수 있다.
		// model을 통해서 list에 값을 추가할 수 있다.
		// model을 통해서 선택하지 않고 줄 번호를 통해 지울 수 있다.
		
		
		
		JScrollPane sp = new JScrollPane(list);
		btnSave = new JButton("저장");
		btnLoad = new JButton("불러오기");
		btnDel = new JButton("삭제");
		btnAllDel = new JButton("전체삭제");
		btnUpdate = new JButton("수정하기");
		
		pnlNorth = new JPanel(new GridLayout(0,2));
		pnlSouth = new JPanel();
		
		//액션리스너 부착
		btnSave.addActionListener(this);
		btnLoad.addActionListener(this);
		btnDel.addActionListener(this);
		btnAllDel.addActionListener(this);
		btnUpdate.addActionListener(this);
		
		//컴포넌트 배치
		pnlNorth.add(lblIdx);
		pnlNorth.add(tfIdx);
		pnlNorth.add(lblName);
		pnlNorth.add(tfName);
		pnlNorth.add(lblAge);
		pnlNorth.add(tfAge);
		
		pnlSouth.add(btnSave);
		pnlSouth.add(btnLoad);
		pnlSouth.add(btnDel);
		pnlSouth.add(btnAllDel);
		pnlSouth.add(btnUpdate);
		
		this.add(pnlNorth,BorderLayout.NORTH);
		this.add(sp);
		this.add(pnlSouth,BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	
		
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnSave) {// 이벤트가 일어난 객체의 getText()
			String idx = tfIdx.getText();
			String name = tfName.getText();
			String age = tfAge.getText();
			
			model.addElement(idx+"/"+name+"/"+age);
			saveFile();
			
		}else if(e.getSource()==btnLoad) {
			String value = list.getSelectedValue()+"";
			String vals[] = value.split("/");
			tfIdx.setText(vals[0]);
			tfName.setText(vals[1]);
			tfAge.setText(vals[2]);
		}else if(e.getSource()== btnDel) {
			int index = list.getSelectedIndex();
			if(index >=0)
			{
				model.remove(index);
			}

			saveFile();
			
		}
		else if(e.getSource()== btnAllDel) {
			model.removeAllElements();
		}else if(e.getSource()== btnUpdate) {
			String idx = tfIdx.getText();
			String name = tfName.getText();
			String age = tfAge.getText();

			int index = list.getSelectedIndex();
			
			model.setElementAt(idx+"/"+name+"/"+age,index);
			saveFile();
		}
				
	}
	void loadFile() {
		FileReader fr;
		try {
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String line = null;
			while((line=br.readLine())!= null) {
				model.addElement(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			catch (IOException e1) {
			
			}
		}
	
	void saveFile() {
		FileWriter fw;
		try {
			fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter(fw);

			for(int i =0 ; i < model.size();i++) {
				pw.println(model.get(i));
			}
			pw.flush();
			pw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new FileGUI2();
	}

}
