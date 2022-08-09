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
		
		//������Ʈ ����
		lblIdx = new JLabel("��ȣ");
		lblName = new JLabel("�̸�");
		lblAge = new JLabel("����");
		tfIdx = new JTextField();
		tfName = new JTextField();
		tfAge = new JTextField();
		model = new DefaultListModel<>();
		list = new JList<>(model); // ���� ���ٸ� �б������̴�
		// model�� �ٽɱ��. �������� �ʰ� ��ȣ�� �� ���� ���� ������ �� �ִ�.
		// ����Ʈ�� �ݵ�� �ϳ��̻��� �����ؾ����� �� ���� �����ü� �ִ�.
		// model�� ���ؼ� list�� ���� �߰��� �� �ִ�.
		// model�� ���ؼ� �������� �ʰ� �� ��ȣ�� ���� ���� �� �ִ�.
		
		
		
		JScrollPane sp = new JScrollPane(list);
		btnSave = new JButton("����");
		btnLoad = new JButton("�ҷ�����");
		btnDel = new JButton("����");
		btnAllDel = new JButton("��ü����");
		btnUpdate = new JButton("�����ϱ�");
		
		pnlNorth = new JPanel(new GridLayout(0,2));
		pnlSouth = new JPanel();
		
		//�׼Ǹ����� ����
		btnSave.addActionListener(this);
		btnLoad.addActionListener(this);
		btnDel.addActionListener(this);
		btnAllDel.addActionListener(this);
		btnUpdate.addActionListener(this);
		
		//������Ʈ ��ġ
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
		if(e.getSource()==btnSave) {// �̺�Ʈ�� �Ͼ ��ü�� getText()
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
