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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FileGUI1 extends JFrame implements ActionListener{
	JLabel lblIdx,lblName,lblAge;
	JTextField tfIdx, tfName, tfAge;
	JTextArea ta;
	JButton btnSave,btnLoad;
	JPanel pnlNorth,pnlSouth;

	File file;
	FileWriter fw;
	PrintWriter pw;
	
	FileReader fr;
	BufferedReader br;
	public FileGUI1() {
		this.setSize(300, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//������Ʈ ����
		lblIdx = new JLabel("��ȣ");
		lblName = new JLabel("�̸�");
		lblAge = new JLabel("����");
		tfIdx = new JTextField();
		tfName = new JTextField();
		tfAge = new JTextField();
		ta = new JTextArea();
		JScrollPane sp = new JScrollPane(ta);
		btnSave = new JButton("����");
		btnLoad = new JButton("�ҷ�����");
		pnlNorth = new JPanel(new GridLayout(0,2));
		pnlSouth = new JPanel();
		
		//�׼Ǹ����� ����
		btnSave.addActionListener(this);
		btnLoad.addActionListener(this);
		
		//������Ʈ ��ġ
		pnlNorth.add(lblIdx);
		pnlNorth.add(tfIdx);
		pnlNorth.add(lblName);
		pnlNorth.add(tfName);
		pnlNorth.add(lblAge);
		pnlNorth.add(tfAge);
		
		pnlSouth.add(btnSave);
		pnlSouth.add(btnLoad);
		
		this.add(pnlNorth,BorderLayout.NORTH);
		this.add(sp);
		this.add(pnlSouth,BorderLayout.SOUTH);
		
		this.setVisible(true);
		
		loadMemberList();
	}

	private void saveMemberList() { // ����Ʈ�� �ִ� �������� ���Ϸ� �����ϴ� ����
		file = new File("./member.txt");
		try {
			fw = new FileWriter(file);
			pw = new PrintWriter(fw);
			
			pw.print(ta.getText());
			
			pw.flush();
			
			pw.close();
			fw.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private void loadMemberList() { // ���Ͽ� ����Ǿ��ִ� �������� ����Ʈ�� �ҷ����� ����
		file = new File("./member.txt");
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line = "";
			String str = "";
			while((line = br.readLine())!= null) {
				str+=line;
				str+="\n";
			}
			ta.setText(str);
			br.close();
			fr.close();
		} catch(FileNotFoundException e) {
			System.out.println("��������Ͼ���");
		}
		catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	
	int getCount(String str, String delim, int idx, String find) {
		int result = 0;
		String data[] = str.split(delim);
		for(int i=0;i<data.length;i++) {
			if(data[i].split("/")[idx].equals(find)){
				result++;
			}
		}		
		return result;
	}
	
	int getIndex(String str, String delim, int idx, String find) {
		int result = -1;
		
		String data[] = str.split(delim);
		for(int i = 0 ; i< data.length; i++) {
			if(data[i].split("/")[idx].equals(find)){
				result = i;
				break;
			}
		}
		
		
		return result;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("����")) {// �̺�Ʈ�� �Ͼ ��ü�� getText()
			String idx = tfIdx.getText();//���� �Է��� ��ȣ			
			String str = ta.getText();// ��ü �ؽ�Ʈ
			
			int cnt = getCount(str, "\n", 0, idx);
	// ��ü���ڿ��� \n���� �ڸ������� �ٽ� /�� �߶� 0��° �迭�� ���� idx�� ������ �? 
						
			if(cnt!=0) {// �ߺ�üũ
				int lineIdx = getIndex(str,"\n",0,idx);
				String[] temp = str.split("\n");
				
				temp[lineIdx] =tfIdx.getText()+"/"+tfName.getText()+"/"+tfAge.getText();
				
				ta.setText("");
				for(int i = 0 ; i< temp.length; i++) {
					ta.append(temp[i]+"\n");
				}
				
//				JOptionPane.showMessageDialog(this, "�̹� �ִ� ��ȣ");
//				tfIdx.setText("");

			}else {			
				ta.append(tfIdx.getText()+"/"+
						  tfName.getText()+"/"+
						  tfAge.getText()+"\n");
			}
			saveMemberList();
			
			
		}else if(e.getSource()==btnLoad) {
			String str = ta.getText();
			String idx = tfIdx.getText();
			int iidx = Integer.parseInt(idx);//���ڸ� ���ڷ� �ٲ�
			int cnt = getIndex(str, "\n", 0, idx);
			if(cnt>=0) {
				String[] data = str.split("\n");
				String[] res = data[cnt].split("/");
				// iidx�� �Է°��̰� -1�� ���ִ� ������ �迭�� ��ȣ�� 1�� �۱� ����
				tfName.setText(res[1]);// /�� �߶��� �� 2��° ��
				tfAge.setText(res[2]);// /�� �߶��� �� 3��° ��
			}else {
				JOptionPane.showMessageDialog(this, "���� ��ȣ");
			}
		}
		
		/*if(e.getSource()==btnSave) {// e.getSource() �� �̺�Ʈ�� �Ͼ 
			                        //               ���� ������ ��ü			
		}*/
		
	}
	public static void main(String[] args) {
		new FileGUI1();
	}

}
