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
		
		//컴포넌트 생성
		lblIdx = new JLabel("번호");
		lblName = new JLabel("이름");
		lblAge = new JLabel("나이");
		tfIdx = new JTextField();
		tfName = new JTextField();
		tfAge = new JTextField();
		ta = new JTextArea();
		JScrollPane sp = new JScrollPane(ta);
		btnSave = new JButton("저장");
		btnLoad = new JButton("불러오기");
		pnlNorth = new JPanel(new GridLayout(0,2));
		pnlSouth = new JPanel();
		
		//액션리스너 부착
		btnSave.addActionListener(this);
		btnLoad.addActionListener(this);
		
		//컴포넌트 배치
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

	private void saveMemberList() { // 리스트에 있는 정보들을 파일로 저장하는 동작
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

	private void loadMemberList() { // 파일에 저장되어있는 정보들을 리스트로 불러오는 동작
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
			System.out.println("저장된파일없음");
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
		if(e.getActionCommand().equals("저장")) {// 이벤트가 일어난 객체의 getText()
			String idx = tfIdx.getText();//현재 입력한 번호			
			String str = ta.getText();// 전체 텍스트
			
			int cnt = getCount(str, "\n", 0, idx);
	// 전체문자에서 \n으로 자른다음에 다시 /로 잘라서 0번째 배열의 값이 idx랑 같은게 몇개? 
						
			if(cnt!=0) {// 중복체크
				int lineIdx = getIndex(str,"\n",0,idx);
				String[] temp = str.split("\n");
				
				temp[lineIdx] =tfIdx.getText()+"/"+tfName.getText()+"/"+tfAge.getText();
				
				ta.setText("");
				for(int i = 0 ; i< temp.length; i++) {
					ta.append(temp[i]+"\n");
				}
				
//				JOptionPane.showMessageDialog(this, "이미 있는 번호");
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
			int iidx = Integer.parseInt(idx);//문자를 숫자로 바꿈
			int cnt = getIndex(str, "\n", 0, idx);
			if(cnt>=0) {
				String[] data = str.split("\n");
				String[] res = data[cnt].split("/");
				// iidx는 입력값이고 -1을 해주는 이유는 배열의 번호가 1씩 작기 때문
				tfName.setText(res[1]);// /로 잘랐을 때 2번째 값
				tfAge.setText(res[2]);// /로 잘랐을 때 3번째 값
			}else {
				JOptionPane.showMessageDialog(this, "없는 번호");
			}
		}
		
		/*if(e.getSource()==btnSave) {// e.getSource() 는 이벤트가 일어난 
			                        //               실제 생성된 객체			
		}*/
		
	}
	public static void main(String[] args) {
		new FileGUI1();
	}

}
